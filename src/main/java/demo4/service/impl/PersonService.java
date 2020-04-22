package demo4.service.impl;

import demo4.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * create by kevin.
 *
 * @Date 2020/4/22
 */
@Service("personService")
public class PersonService implements IUserService {
    public void saveUser() {
        System.out.println("保存了人");
    }
}
