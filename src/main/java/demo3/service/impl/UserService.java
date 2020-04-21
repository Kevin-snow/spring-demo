package demo3.service.impl;

import demo2.factory.BeanFactory;
import demo3.dao.IUserDao;
import demo3.service.IUserService;

public class UserService implements IUserService {

    private IUserDao dao;

    public void setDao(IUserDao dao){
        this.dao = dao;
    }

    private int i = 1;

    public void saveUser() {
        System.out.println(i);
        dao.save();
        i++;
    }

    public void init(){
        System.out.println(" init 方法被调用了");
    }

    public void destroy(){
        System.out.println(" destroy 方法被调用了");
    }
}
