import lombok.Data;

/**
 * @author dqs
 * @description TODO
 * @dateTime 2021/4/23 15:33
 **/
@Data
public class User {
    String userId;
    String userName;

    public String say(String context) {
        System.out.println(context);
        return context;
    }
}
