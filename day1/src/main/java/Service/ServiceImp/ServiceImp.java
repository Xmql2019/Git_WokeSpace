package Service.ServiceImp;

import Dao.UserDao;
import Dao.UserImp.UserDaoImp;
import Service.Service;
import org.junit.Test;
import Utils.BeanFactory;
import java.lang.reflect.Method;
public  class ServiceImp  implements Service {
   /* private  UserDao userDao=UserDaoImp.GetUserDaoImp();*///单例
   private  UserDao userDao=new UserDaoImp();
    private static ServiceImp serviceImp;
    static {
        try {
            serviceImp= (ServiceImp) BeanFactory.getBean("service");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static ServiceImp GetServiceImp(){
        return serviceImp;
    }
    public  ServiceImp() throws Exception { }
    public void save() {
        int i=1;
        userDao.save();
        System.out.println(i);i++;
    /*    userDao.update(15);*/
    }
@Test
    public  void demo1() {
        this.save();
    }
}
