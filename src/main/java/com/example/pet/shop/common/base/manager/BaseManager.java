package com.example.pet.shop.common.base.manager;

import com.example.pet.shop.common.base.entiry.BaseEntity;
import com.example.pet.shop.common.base.persistence.DynamicSpecifications;
import com.example.pet.shop.common.base.persistence.SearchFilter;
import com.example.pet.shop.common.base.repository.BaseRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ResolvableType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Map;
import java.util.Optional;

@Service
@Log4j2
public abstract class BaseManager<R extends BaseRepository<T, ID>, T extends BaseEntity, ID extends Serializable> {
    @Autowired
    protected R repository;

    public Page<T> findAll(Map<String, Object> searchParams, int page, int rows) {
        Map<String, SearchFilter> filters = SearchFilter.parse(searchParams);
        ResolvableType.forClass(getClass()).getInterfaces()[0].getGeneric(0).resolve();
        @SuppressWarnings("unchecked")
        Specification<T> spec = DynamicSpecifications.bySearchFilter(filters.values(),
                (Class<T>) ResolvableType.forClass(getClass()).getInterfaces()[0].getGeneric(0).resolve());
        Pageable pageable = PageRequest.of(page, rows);
        return repository.findAll(spec, pageable);
    }

    public <S extends T> T save(S obj) {
       return repository.save(obj);
    }

    public Optional<T> deleteById(ID id) {
        T deleted = repository.findById(id).get();
        Optional<T> returned = Optional.empty();

        if (deleted != null) {
            repository.remove(id);
            returned = Optional.of(deleted);
        }
        return returned;
    }
}
