package demo3.dto;

import java.util.*;

/**
 * create by kevin.
 *
 * @Date 2020/4/21
 */
public class User {
//    private String name;
//
//    private String nikeName;
//
//    private int age;
//
//    private Date birthday;





//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setNikeName(String nikeName) {
//        this.nikeName = nikeName;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    //    public User(String name, String nikeName, int age, Date birthday) {
////        this.name = name;
////        this.nikeName = nikeName;
////        this.age = age;
////        this.birthday = birthday;
////    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", nikeName='" + nikeName + '\'' +
//                ", age=" + age +
//                ", birthday=" + birthday +
//                '}';
//    }


    String[] names;
    List<Integer> ages;
    Set<String> nickname;

    Map<String,String> map;

    Properties properties;

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setAges(List<Integer> ages) {
        this.ages = ages;
    }

    public void setNickname(Set<String> nickname) {
        this.nickname = nickname;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void printCollect(){
        System.out.println(Arrays.toString(names));
        System.out.println(ages);
        System.out.println(nickname);
        System.out.println(map);
        System.out.println(properties);
    }
}
