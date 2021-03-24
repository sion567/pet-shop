package com.example.pet.shop.common.base.entiry;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

@Data
@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BaseEntity implements Persistable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
    @TableGenerator(name = "table-generator",
            table = "t_ids",
            pkColumnName = "seq_id",
            valueColumnName = "seq_value")
    private Long id;

    @Column(name = "available_state", columnDefinition="tinyint default 0")
    private int available ;

    @Version
    protected Integer version;

    @Transient
    private boolean isNew = true;

    @Override
    public boolean isNew() {
        return isNew;
    }

    @PrePersist
    @PostLoad
    void markNotNew() {
        this.isNew = false;
    }
}
