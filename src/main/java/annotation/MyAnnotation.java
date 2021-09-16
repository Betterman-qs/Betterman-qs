package annotation;

import java.lang.annotation.*;

/**
 * @author dqs
 * @description 自定义注解练习
 * @dateTime 2021/8/6 15:45
 **/
@Documented
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotation {
    String content() default "yy";
}
