package demo4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * create by kevin.
 *
 * @Date 2020/4/22
 */
@Component
public class UseUser {


    private IUserService userService;

    @Autowired
    @Qualifier(value = "personService")
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public void prite(){
        userService.saveUser();
    }

}
