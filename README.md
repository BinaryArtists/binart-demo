# jv-examples

## 多模块

* main
* port
* account
* user
* perm

## 有关 springBoot

### [spring-boot-starter-parent](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-parent)

[org.springframework.boot](https://mvnrepository.com/artifact/org.springframework.boot)

#### spring-boot-starter-parent 是一个特殊的 starter，提供相关的 Maven 默认依赖

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