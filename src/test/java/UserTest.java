import lombok.val;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dqs
 * @description 用户测试类
 * @dateTime 2021/4/23 16:03
 **/
public class UserTest {

    @Test
    public void demo1() {
        //???????????????
        val applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)applicationContext.getBean("user");
        user.say("Hello!");
    }

    @Test
    public void demo2() {
        User user = new User();
        user.say("Hello!");
    }
}
