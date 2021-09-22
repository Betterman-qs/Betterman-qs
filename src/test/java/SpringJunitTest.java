import com.config.SpringConfiguration;
import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dqs
 * @description SpringJunit测试
 * @dateTime 2021/9/22 20:18
 **/
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration(classes = SpringConfiguration.class)
public class SpringJunitTest {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.save();
    }
}
