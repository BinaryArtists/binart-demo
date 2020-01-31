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