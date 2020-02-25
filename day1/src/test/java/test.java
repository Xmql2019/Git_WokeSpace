import Dao.UserDao;
import Dao.UserImp.UserDaoImp;
import Service.Service;
import Service.ServiceImp.ServiceImp;
import Utils.BeanFactory;

public class test {
    public static void main(String[] args) throws Exception{
   /*     for (int i = 0; i < 5; i++) { 单例模式
            Service service=ServiceImp.GetServiceImp();
            UserDao userDaoImp = UserDaoImp.GetUserDaoImp();
            System.out.println(service);
            System.out.println(userDaoImp);
            service.save();
        }*/
        for (int i = 0; i < 5; i++) {//多例模式
            Service service=(Service)BeanFactory.getBean("service");
            UserDao userDaoImp = (UserDao)BeanFactory.getBean("userDao");
            System.out.println(service);
            System.out.println(userDaoImp);
            service.save();
        }

              /*  new ServiceImp();*/

    }
}
