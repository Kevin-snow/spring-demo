# Spring笔记-Spring基于注解的注入

### *曾经XML的配置*：

*  <bean id="userService" class="demo3.service.impl.UserService" init-method="init" destroy-method="destroy"/>
*  用于创建对象的
   *      他们的作用就和在xml配置文件中编写一个<bean>标签实现的功能是一样的
*  用于注入数据的
   *      他们的作用就和在<bean>标签中写一个<property>标签的作用是一样的
*  用于改变作用范围的
   *      他们的作用就和在<bean>标签的属性scope的作用是一样的
*  和生命周期相关的
   *      他们的作用就和在<bean>标签里使用init-method、destroy-method的作用是一样的

**当我们使用注解的方式进行依赖注入时，需要使用带有<context:component-scan base-backage="demo4"/>的标签进行配置。base-backage表示要扫描的包路径**。

### 用于创建对象的注解

***@Component***

*  作用: 用于将当前类对象存入Spring容器
*  属性: value, 用于指定bean的id, 当我们不写时，它的默认值是当前的类名，且首字母小写

***@Controller、@Service、@Repository***

以上三个注解与@Component的作用是一模一样的。它们是Spring为我们提供的基于三层使用的注解。使我们对三层的对象更加清晰。

### 用于注入对象数据的注解

***@Autowired***

​	作用：自动按照类型进行注入，只要容器中有唯一的一个Bean对象类型和要注入的变量类型匹配，就可以注入成功。

​	位置:  可以是变量，也可以是方法。

​	细节：在使用注解注入时，set方法就不是必须的了。

***@Qualifier***

​	作用：在按照类型注入的基础之上再按照名称注入。它在给类成员变量注解时，不能单独使用。但是在给方法参数注入时可以单独使用。

​	属性：value，用于指定注入bean的id.

***@Resource***

​	作用：直接按照Bean的id注入，它可以独立使用。

​	属性：name，用于指定bean的id.

**以上三个注解都用于注入其他Bean类型的数据，而非基本类型和String类型**。

**例子：**

```java
@Autowired
@Qualifier(value = "personService")
private IUserService userService;

public void prite(){
    userService.saveUser();
}
```

***@Value***

​	作用：用于注入基本类型和String类型的数据。

​	属性：value，用于指定数据的值。它可以使用Spring中的SPEL（也就是Spring的EL表达式）

​		SpEL的写法（${表达式}）

### 用于改变作用范围的注解

***@Scope***

​	作用：用于指定Bean的作用范围

​	属性：value，指定范围的取值，常用的为singleton，prototype

### 和生命周期相关

@PostContruct

​	作用：用于初始化方法

@PreDestroy

​	作用：用于销毁方法