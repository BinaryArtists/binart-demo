package com.binart.binartgroup.entity;

import com.binart.binartcommon.base.BaseEntity;

/**
 * 机构
 *
 * 区别：机构（Org）和集团（Group）的区别是，机构可以表示多级关系，集团（Group）只能和公司（Company）组合
 */
public class Org extends BaseEntity {
    private Long id;
    private Long parentId;
    private String name;
    /** 排序 */
    private Integer orderNum;
    /** 是否启用 */
    private Integer active;
    private Integer deleted;
}
