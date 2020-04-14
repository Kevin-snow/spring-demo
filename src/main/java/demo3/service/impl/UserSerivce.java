package demo3.service.impl;

import demo2.factory.BeanFactory;
import demo3.dao.IUserDao;
import demo3.service.IUserService;

public class UserSerivce implements IUserService {

    IUserDao dao;

    public void setDao(IUserDao dao){
        this.dao = dao;
    }

    private int i = 1;

    public void saveUser() {
        System.out.println(i);
        dao.save();

        i++;


    }
}
