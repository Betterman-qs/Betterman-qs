import com.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.UserService;

/**
 * @author dqs
 * @description TODO
 * @dateTime 2021/8/5 17:06
 **/
public class Application {

    public static void main(String[] args) {
//        ApplicationContext app =
//        new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService) app.getBean("userService");
//        userService.save();

        //通过配置Spring核心注解配置类，实现注入
        ApplicationContext app =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = app.getBean(UserService.class);

        userService.save();
    }
}
