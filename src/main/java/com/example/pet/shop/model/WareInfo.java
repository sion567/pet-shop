package com.example.pet.shop.model;


import com.example.pet.shop.common.base.entiry.BizEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "T_WARE_INFO")
public class WareInfo extends BizEntity {
    /**
     * 仓库名
     */
    private String name;
    /**
     * 仓库地址
     */
    private String address;
    /**
     * 区域编码
     */
    private String areaCode;

    @OneToMany(mappedBy = "ware", cascade= CascadeType.ALL,fetch= FetchType.LAZY)
    private List<WareSku> comments = new ArrayList<>();
}
