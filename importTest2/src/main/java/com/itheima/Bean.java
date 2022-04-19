package com.itheima;

import com.itheima.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Bean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }

    }
}
