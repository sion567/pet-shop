package com.example.pet.shop.common.base.entiry;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.util.Calendar;

@Data
@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BizEntity extends BaseEntity {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_time", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Generated(GenerationTime.INSERT)
    private Calendar createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Generated(GenerationTime.ALWAYS)
    private Calendar updateDate;

    @Column(name = "edit_state", columnDefinition="tinyint default 0")
    private int editState;
}
