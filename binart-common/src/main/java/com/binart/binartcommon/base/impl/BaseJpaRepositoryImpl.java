package com.binart.binartcommon.base.impl;

import com.binart.binartcommon.base.BaseJpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaMetamodelEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public class BaseJpaRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>
        implements BaseJpaRepository<T, ID> {

    private final EntityManager entityManager;
    private final JpaEntityInformation entityInformation;
    private final Class<T> clazz;


    public BaseJpaRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
        this.entityInformation = entityInformation;
        this.clazz = entityInformation.getJavaType();
    }

    @Override
    public List<Object[]> listBySQL(String sql) {
        System.out.println(sql);
        return null;
    }
}

//@SpringBootApplication
//@EnableJpaRepositories(repositoryBaseClass = BaseJpaRepositoryImpl.class)
//public class FileserviceApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(FileserviceApplication.class, args);
//    }
//}
