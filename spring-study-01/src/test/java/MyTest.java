import com.wzj.Service.UserServiceImpl;
import com.wzj.dao.UserDaoImpl;
import com.wzj.dao.UserDaoMysqlImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.getUser();
    }

    @Test
    public void test_set(){
        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoMysqlImpl());
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
    }

    @Test
    public void test_ioc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        userServiceImpl.getUser();
    }
}
