package demo3.dao.impl;

import demo3.dao.IUserDao;

public class UserDaoImpl implements IUserDao {


    public void save() {
        System.out.println("保存了用户信息");
    }
}
