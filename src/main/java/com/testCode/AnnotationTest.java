package com.testCode;

import com.annotation.MyAnnotation;
import java.lang.reflect.Method;

/**
 * @author dqs
 * @description TODO
 * @dateTime 2021/8/7 11:07
 **/
public class AnnotationTest {

    @MyAnnotation(content = "str")
    public String test() {
        System.out.println("测试注解的解析");
        return "a";
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<AnnotationTest> annClass = AnnotationTest.class;
        Method method = annClass.getMethod("test");

        //判断该方法是否定义了MyAnnotation注解
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.content());
        }
    }
}
