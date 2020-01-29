package com.binart.binartcommon.domain.base;

import com.binart.binartcommon.domain.anotations.DomainAggregate;

import java.io.Serializable;

@DomainAggregate
public abstract class BaseDomainAggregate<K extends Serializable> implements BaseModel {
    /**
     * get aggregate root
     *
     * @return root object
     */
    public abstract K getRoot();

    /**
     * get entity id
     *
     * @return entity id
     */
    public K getId() {
        return getRoot();
    }
}
