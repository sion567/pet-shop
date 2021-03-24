package com.example.pet.shop.model;

import com.example.pet.shop.common.base.entiry.BizEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "T_ACCOUNT")
public class Account extends BizEntity {
    @Column(length = 64)
    private String username;
    @Column(length = 64)
    @JsonIgnore
    private String password;
    @Column
    private String salt;
    @Column
    private String roles;
    @Column(length = 64)
    private String email;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getCredentialsSalt() {
        return username + salt;
    }

    public List<String> getRoleIds() {
        if (StringUtils.isEmpty(roles)){
            return new ArrayList<>();
        }
        return Splitter.on(",").splitToList(roles);
    }

    public void setRoleIds(List<String> list) {
        if(CollectionUtils.isEmpty(list)) {
            this.roles = "";
        }
        this.roles = Joiner.on(",").join(list);
    }
}
