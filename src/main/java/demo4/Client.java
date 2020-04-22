package demo4;

import demo4.service.IUserService;
import demo4.service.UseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by kevin.
 *
 * @Date 2020/4/21
 */
public class Client {

    public static void main(String[] args) {



        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        UseUser service = (UseUser) ctx.getBean("useUser");
        service.prite();
        System.out.println(service);

//        ctx.close();

    }

}
