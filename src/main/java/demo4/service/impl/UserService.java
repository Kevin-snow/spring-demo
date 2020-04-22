package demo4.service.impl;

import demo4.dao.IUserDao;
import demo4.service.IUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 曾经XML的配置：
 *  <bean id="userService" class="demo3.service.impl.UserService"
 *         init-method="init" destroy-method="destroy"/>
 *
 * 用于创建对象的
 *      他们的作用就和在xml配置文件中编写一个<bean>标签实现的功能是一样的
 *      Component:
 *          作用: 用于将当前类对象存入Spring容器
 *          属性: value, 用于指定bean的id, 当我们不写时，它的默认值是当前的类名，且首字母小写
 *
 * 用于注入数据的
 *      他们的作用就和在<bean>标签中写一个<property>标签的作用是一样的
 * 用于改变作用范围的
 *      他们的作用就和在<bean>标签的属性scope的作用是一样的
 * 和生命周期相关的
 *      他们的作用就和在<bean>标签里使用init-method、destroy-method的作用是一样的
 */
@Service(value = "userService1")
public class UserService implements IUserService {
    //private IUserDao dao;
    public void saveUser() {
        System.out.println("保存用户");
        //dao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println(" init 方法执行了");
    }

    @PreDestroy
    public void destroy(){
        System.out.printf(" 销毁了");
    }
}
