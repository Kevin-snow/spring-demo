package demo2;

import demo2.factory.BeanFactory;
import demo2.service.IUserService;

public class Client {

    public static void main(String[] args) {

//        IUserService service = (IUserService) BeanFactory.getBean("userService");
//
//        service.saveUser();


        for (int i = 0; i < 5; i++) {
            IUserService service = (IUserService) BeanFactory.getBean("userService");

            service.saveUser();

        }
    }

}
