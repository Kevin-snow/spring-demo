package demo1.service.impl;

import demo1.dao.IUserDao;
import demo1.dao.impl.UserDaoImpl;
import demo1.service.IUserService;

public class UserSerivce implements IUserService {

    // 引用dao，这种方式就是类与类之间的强耦合关系。
    IUserDao dao = new UserDaoImpl();

    public void saveUser() {
        dao.save();
    }
}
