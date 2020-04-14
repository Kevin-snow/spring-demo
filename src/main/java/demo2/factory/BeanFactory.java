package demo2.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 一个创建Bean对象的工厂
 *      bean: 在计算机语言中，有可重用组件的含义
 *      javaBean: 用java语言编写的可重用组件
 *          javaBean > 实体类
 *
 *      它就是创建我们需要的service和dao的
 *
 *      第一个，需要一个配置文件，配置出我们需要的service和dao
 *      第二个，读取配置文件，反射出类的实例
 */
public class BeanFactory {
    // 定义一个Properties对象
    private static Properties props;

    // 声明一个Map,用于缓存实例化对象
    private static Map<String, Object> beanMaps;

    // 使用静态代码块为properties对象赋值
    static {
        try {
            //实例化对象
            props = new Properties();

            beanMaps = new HashMap<String, Object>();

            // 获取properties文件的流对象。此处不能使用FileInputStream,因为你根本不能确定在服务器上一定会存在C、D、E盘等等
            // 此处使用类的加载器进行加载文件
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);

            Enumeration keys = props.keys();
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String beanPath = props.getProperty(key);

                Object obj = null;
                try {
                    obj = Class.forName(beanPath).newInstance();
                    beanMaps.put(key, obj);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }

    public static Object getBean(String beanName){
//        Object obj = null;
//        try {
//            String beanPath = props.getProperty(beanName);
//            obj = Class.forName(beanPath).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        return beanMaps.get(beanName);
    }

}
