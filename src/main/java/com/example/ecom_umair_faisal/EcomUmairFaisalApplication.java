package com.example.ecom_umair_faisal;

import com.example.ecom_umair_faisal.beans.Category;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EcomUmairFaisalApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context= SpringApplication.run(EcomUmairFaisalApplication.class, args);
        context.getBean(Category.class).method();

    }

}
