import com.wzj.config.MyConfig;
import com.wzj.pojo.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog.name);
    }
}
