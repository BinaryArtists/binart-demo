package com.binart.binartperm.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="t_menu")
public class Menu implements Serializable {
    private static final long serialVersionUID = 7187628714679791771L;
    public static final String TYPE_MENU = "0";
    public static final String TYPE_BUTTON = "1";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // 主键
    private String name; // 菜单名字
    private String path; // 地址
    private String com; // 对应Vue组件
    private String perms; // 权限
    private String icon; // 图标
    private String type; // 类型
    private Double orderNum; // 排序

    @Column(unique = true)
    private Long parentId; // 父级菜单

    private Date createTime;
    private Date modifyTime;

    private transient String createTimeFrom;
    private transient String createTimeTo;
}
