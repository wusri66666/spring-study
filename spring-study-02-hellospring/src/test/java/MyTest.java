import com.wzj.pojo.Hello;
import com.wzj.pojo.Person;
import com.wzj.pojo.Student;
import com.wzj.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.show();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("allBeans.xml");
        Person person = (Person) context.getBean("person3");
        person.show();
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("allBeans.xml");
        Student student = (Student) context.getBean("student");
        student.show();
    }
}
