package demo2.service.impl;

import demo2.dao.IUserDao;
import demo2.dao.impl.UserDaoImpl;
import demo2.factory.BeanFactory;
import demo2.service.IUserService;

public class UserSerivce implements IUserService {

    IUserDao dao = (IUserDao) BeanFactory.getBean("userDao");

    private int i = 1;

    public void saveUser() {
        System.out.println(i);
        dao.save();

        i++;


    }
}
