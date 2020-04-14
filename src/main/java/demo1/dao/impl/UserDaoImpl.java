package demo1.dao.impl;

import demo1.dao.IUserDao;

public class UserDaoImpl implements IUserDao {
    public void save() {
        System.out.println("保存了用户信息");
    }
}
