package Dao.UserImp;

import Dao.UserDao;
import Utils.BeanFactory;
import org.junit.Test;

public class UserDaoImp implements UserDao {
    private static  UserDaoImp userDaoImp;
    static {
        try {
           /* userDaoImp= (UserDaoImp) BeanFactory.getBean("userDao");*///单例
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static UserDaoImp GetUserDaoImp(){
        return userDaoImp;
    }
    public void save() {
        System.out.println("Save 方法执行....");
    }

    public void update(Object O) {
    }

    public void delete(Integer integer) {
    }

    public void findAll(Object O) {
    }

    public void findById(Integer integer) {

    }
}
