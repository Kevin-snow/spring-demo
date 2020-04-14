package demo3;

import demo3.dao.IUserDao;
import demo3.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

        IUserDao userDao = (IUserDao) ctx.getBean("userDao");

        IUserService userService = ctx.getBean("userService", IUserService.class);

        System.out.println(userDao);
        System.out.println(userService);

    }

}
