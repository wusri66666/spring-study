import com.wzj.mapper.UserMapper;
import com.wzj.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession session = build.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        for (User user : userMapper.getUsers()) {
            System.out.println(user);
        }
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        for (User user : userMapper.getUsers()) {
            System.out.println(user);
        }
    }
}
