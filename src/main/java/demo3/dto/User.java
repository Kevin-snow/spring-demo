package demo3.dto;

import java.util.Date;

/**
 * create by kevin.
 *
 * @Date 2020/4/21
 */
public class User {
    private String name;

    private String nikeName;

    private int age;

    private Date birthday;

    public User(String name, String nikeName, int age, Date birthday) {
        this.name = name;
        this.nikeName = nikeName;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", nikeName='" + nikeName + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
