package com.config;

import org.springframework.context.annotation.*;

/**
 * @author dqs
 * @description Spring的核心配置类
 * @dateTime 2021/9/18 14:41
 **/
@Configuration
@ComponentScan("com")
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {

}
