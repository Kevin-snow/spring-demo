package demo1;

import demo1.service.IUserService;
import demo1.service.impl.UserSerivce;

public class Client {

    public static void main(String[] args) {
        IUserService service = new UserSerivce();
        service.saveUser();
    }

}
