package com.example.pet.shop.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "T_MEMBER")
public class Member extends Account {
    /**
     * 昵称
     */
    @Column(length = 64)
    private String nickname;
    /**
     * 手机号码
     */
    @Column(length = 20)
    private String mobile;

    /**
     * 头像
     */
    @Column(length = 500)
    private String header;
    /**
     * 性别
     */
    @Column(columnDefinition="tinyint")
    private int gender;
    /**
     * 生日
     */
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar birth;

    @OneToMany(mappedBy = "member", cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<MemberReceiveAddress> addresses = new ArrayList<>();

    @ManyToMany(cascade = { CascadeType.MERGE })
    @JoinTable(name = "T_MEMBER_SPUINFO", joinColumns = { @JoinColumn(name = "member_id") }, inverseJoinColumns = {
            @JoinColumn(name = "spu_id") })
    @Fetch(FetchMode.SUBSELECT)
    @OrderBy("id ASC")
    private List<SpuInfo> spuList = new ArrayList();
}
