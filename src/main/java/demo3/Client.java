package demo3;

import demo3.dao.IUserDao;
import demo3.dto.User;
import demo3.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    /**
     * 获取SpringIOC容器几种方式：
     *  ClassPathXmlApplicationContext, 它可以加载类路径下的Spring配置文件，要求配置文件必须在类路径下.
     *  FileSystemXmlApplicationContext, 它可以加载任意路径下的Spring配置文件，但要求必须有路径的访问权限.
     *  AnnotationConfigApplicationContext, 它读取注解的方式实例化对象.
     *
     * SpringIOC容器引发的问题：
     *  ApplicationContext, 创建对象采取的策略是立即加载的方式。也就是说，配置文件一加载完，就立刻创建对象。
     *  BeanFactory, 创建对象采取的策略是延迟加载的方式。也就是说，什么时候根据id获取对象，什么时候就创建对象.
     *
     * SpringBean对象创建的几种方式
     *
     *  1.第一种方式，spring使用默认的构造函数.当没有构造函数时就不能创建。
     *
     *  2.第二种获取方式，使用factoryBean的方式获取
     *
     *  3.第二种获取方式，使用factoryBean的静态方法方式获取
     *
     * SpringBean对象的生命周期
     *  单例对象：
     *      出生：spring容器创建时，对象创建
     *      活着：spring容器存在时，对象一直存在
     *      死亡：spring容器销毁时，对象销毁
     *  多例对象：
     *      出生：当我们使用对象时，Spring框架为我们创建
     *      活着：对象只要在使用过程中，就一直存活
     *      死亡：当对象长时间不使用时，java的回收器将其回收
     * @param args
     */


    public static void main(String[] args) {


//        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

//        IUserDao userDao = (IUserDao) ctx.getBean("userDao");
//
//        IUserService userService = ctx.getBean("userService", IUserService.class);
//
//        System.out.println(userDao);
//        System.out.println(userService);

//        ctx.close();

        User user = (User) ctx.getBean("user");
        System.out.println(user.toString());
    }

}
