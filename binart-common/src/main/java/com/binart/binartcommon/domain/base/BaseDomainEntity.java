package com.binart.binartcommon.domain.base;

import com.binart.binartcommon.domain.anotations.DomainEntity;

import java.io.Serializable;

@DomainEntity
public interface BaseDomainEntity<K extends Serializable> extends BaseModel {
    /**
     * get entity id
     *
     * @return entity id
     */
    public K getId();
}