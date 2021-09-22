import com.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dqs
 * @description 用户测试类
 * @dateTime 2021/4/23 16:03
 **/
public class UserTest {

    @Test
    public void demo1() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)app.getBean("user");
        user.say("Hello!");
    }

    @Test
    public void demo2() {
        User user = new User();
        user.say("Hello!");
    }
}
