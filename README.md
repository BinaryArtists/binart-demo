# jv-examples

* main
* port
* account
* user
* perm

[放弃JitPack，发布Android Library到Bintray、JCenter](https://www.jianshu.com/p/9f81d5b5a451)

## 思想

### OO

* OOA 面向对象分析
* OOD 面向对象设计
* OOP 面向对象编程

### CUR

每一层都分别有描述数据、逻辑的对象

* 数据访问层：Entity、Repo
* 业务逻辑层：Service、Bo
* 接口层：Controller、Vo（属于DTO）

### DDD

* Application：提供域内接口
* Aggregate：域内聚合
* Entity：
* Factory：创建Entity
* Repository：操作Entity
* Service: 负责与Repository交互，将Entity转化为Domain，依赖Domain完成部分业务逻辑，然后持久化
* Specification：业务规则
* ValueObject：
* Event：事件、事件处理

## 工具

### JPA
    
[继承jpa Repository 写自定义方法查询](https://blog.csdn.net/bird_tp/article/details/83651651)


### 有关 springBoot

* [spring-boot-starter-parent](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-parent)

[org.springframework.boot](https://mvnrepository.com/artifact/org.springframework.boot)

* spring-boot-starter-parent 是一个特殊的 starter，提供相关的 Maven 默认依赖

*pom.xml*

```
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.1.5.RELEASE</version>
    <relativePath/>
</parent>
```

使用它之后，常用的包依赖可以省去 version 标签，当我们搭建web应用的时候，可以像下面这样添加spring-boot-starter-web依赖：

```
<!-- Quartz定时任务 -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-quartz</artifactId>
</dependency>
```   