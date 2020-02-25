package Utils;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    private static Properties pro;
    private static Map<String,Object> beans;
    static {
        try {
            //实例化对象
            pro=new Properties();
            //获取properties文件的流对象
            InputStream in=BeanFactory.class.getClassLoader().getResourceAsStream(
                    "Properties/bean.properties");
            pro.load(in);
            //实例化容器
            beans=new HashMap<String, Object>();
            //取出配置文件properties中所有的的key
            Enumeration<Object> keys = pro.keys();
            //遍历枚举
            while(keys.hasMoreElements()){
                //获取key
                String key=keys.nextElement().toString();
                //通过key获取value
                String beanPath=pro.getProperty(key);
                //通过反射创建对象
                Object value = Class.forName(beanPath).newInstance();
                //把key value 存入容器中
                beans.put(key,value);
            }

        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化异常");
        }
    }
    public static Object getBean(String  beanName)throws Exception{
        return beans.get(beanName);//根据beanName key 获取反射对象
    }
/*    public static Object getBean(String  beanName)throws Exception{
        Object bean;
        String  beanPath=pro.getProperty(beanName);
        bean = Class.forName(beanPath).newInstance();
        return bean;
    }*/
}
