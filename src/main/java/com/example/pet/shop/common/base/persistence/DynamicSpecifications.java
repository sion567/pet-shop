package com.example.pet.shop.common.base.persistence;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;



public class DynamicSpecifications {

    @SuppressWarnings("serial")
    public static <T> Specification<T> bySearchFilter(final Collection<SearchFilter> filters,
                                                      final Class<T> entityClazz) {
        return new Specification<T>() {
            @SuppressWarnings({ "unchecked", "rawtypes" })
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
                if (isNotEmpty(filters)) {
                    List<Predicate> predicates = Lists.newArrayList();
                    for (SearchFilter filter : filters) {
                        String[] names = StringUtils.split(filter.fieldName, ".");
                        Path expression = root.get(names[0]);
                        for (int i = 1; i < names.length; i++) {
                            expression = expression.get(names[i]);
                        }

                        // logic operator
                        switch (filter.operator) {
                            case EQ:
                                predicates.add(builder.equal(expression, filter.value));
                                break;
                            case LIKE:
                                predicates.add(builder.like(expression, "%" + filter.value + "%"));
                                break;
                            case GT:
                                predicates.add(builder.greaterThan(expression, (Comparable) filter.value));
                                break;
                            case LT:
                                predicates.add(builder.lessThan(expression, (Comparable) filter.value));
                                break;
                            case GTE:
                                predicates.add(builder.greaterThanOrEqualTo(expression, (Comparable) filter.value));
                                break;
                            case LTE:
                                predicates.add(builder.lessThanOrEqualTo(expression, (Comparable) filter.value));
                                break;
                        }
                    }

                    /**
                     * 将所有条件用 and 联合起来
                     */
                    if (!predicates.isEmpty()) {
                        return builder.and(predicates.toArray(new Predicate[predicates.size()]));
                    }
                }

                return builder.conjunction();
            }
        };
    }

    private static boolean isNotEmpty(Collection collection) {
        return (collection != null) && !(collection.isEmpty());
    }
}