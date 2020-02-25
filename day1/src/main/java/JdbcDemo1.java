import org.junit.Test;

import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo1 {
    @Test
    public void Demo1() throws SQLException, ClassNotFoundException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
      //  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //获取连接
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test","root","root");
        //获取操作数据库的预处理对象
        PreparedStatement ps = connection.prepareStatement("select * from user");
        //执行SQL 得到结果集
        ResultSet rs = ps.executeQuery();
        //便利结果及
        while (rs.next()){
            System.out.println(rs.getString("username"));
        }
        //释放资源
        rs.close();
        ps.close();
        connection.close();
    }
    @Test
    public  void Demo2()throws  Exception{
        List<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(1);arrayList.add(2);
        Class<?> aClass = Class.forName("java.util.ArrayList");
        Method method = aClass.getMethod("add", Object.class);
        method.invoke(arrayList,"String类型");
        System.out.println(arrayList);
        for (Object a:arrayList){
            System.out.println(a);
        }
    }
}
