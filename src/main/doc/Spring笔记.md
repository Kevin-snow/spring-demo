# Spring笔记



### 1、获取SpringIOC的几种方式：

ApplicationContext的三种常用实现类：

		1. ClassPathXmlApplicationContext，它可以加载类路径下的Spring配置文件，要求配置文件必须在类路径下。
  		2. FileSystemXmlApplicationContext，它可以加载任意路径下的Spring配置文件，但要求必须有路径的访问权限。
  		3. AnnotationConfigApplicationContext，它读取注解的方式实例化对象。

**ClassPathXmlApplicationContext**和**FileSystemXmlApplicationContext**都实现了**ApplicationContext**接口。



### 2、SpringIOC容器引发的问题：

ApplicationContext与BeanFactory的区别。

```java
ApplicationContext, 创建对象采取的策略是立即加载的方式。也就是说，配置文件一加载完，就立刻创建对象。
```

```java
BeanFactory, 创建对象采取的策略是延迟加载的方式。也就是说，什么时候根据id获取对象，什么时候就创建对象。
```



### 3、SpringBean对象创建的几种方式

1.第一种方式，spring使用默认的构造函数.当没有构造函数时就不能创建。

2.第二种获取方式，使用factoryBean的方式获取

3.第二种获取方式，使用factoryBean的静态方法方式获取

### 4、SpringBean的作用范围

***scope的取值***：

​	singleton、prototype、request、session、global-session

​	singleton表示单例对象

​	prototype表示多利对象

​	request表示作用在web项目中，一次请求的

​	session表示作用在web项目中，一次回话的

​	global-session表示作用在web项目中，集群环境下，当非集群环境时，就蜕变成了session.

### 5、Bean对象的生命周期

***单例对象的生命周期***：

​		出生：当spring容器创建时，对象出生。

​		活着：只要容器还在，对象一直在。

​		死亡：当容器销毁时，对象消亡

​		总结：单例对象的生命周期和容器一样

***多例对象的生命周期***：

​		出生：当我们使用对象时，Spring框架为我们创建

​		活着：当对象在使用过程中就一直存在

​		死亡：当对象长时间不使用时，java的回收器将其回收

### 6、Bean的依赖注入方式：

***构造器注入***：

- ​	构造器注入时，在<Bean>标签里，加入<constructor-arg>标签。

- ​	<constructor-arg>标签有以下属性：

​		1、type: 表示构造函数参数中参数的类型

​		2、index: 表示构造函数中参数的索引，默认从0开始

​		3、name: 表示构造函数参数的名称

​		4、value: 给构造函数的参数赋值，Spring xml中配置的所有数据均为String类型，Spring会进行转换

​		5、ref: 用于引用外部对象，非基本类型时使用

- ​	通过构造器注入时，当没有提供默认的构造函数，且没有在bean标签中配置<constructor-arg>标签，启动程序时报错。报错为没有找到默认的构造函数

- 当在配置<construct-arg>标签内容时，如果配错属性，也会导致启动程序异常。

- 正确的配置如下：

- ```java
  <!-- 构造函数的配置方式-->
  <bean id="user" class="demo3.dto.User">
      <constructor-arg name="age" value="18"/>
      <constructor-arg name="name" value="张三"/>
      <constructor-arg name="nikeName" value="小花猫"/>
      <constructor-arg name="birthday" ref="time"/>
  </bean>
  
  <!-- 外部Bean-->
  <bean id="time" class="java.util.Date" />
  ```

