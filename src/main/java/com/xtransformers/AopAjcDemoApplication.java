package com.xtransformers;

import com.xtransformers.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AopAjcDemoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(AopAjcDemoApplication.class);

    public static void main(String[] args) {
        // ConfigurableApplicationContext context = SpringApplication.run(AopAjcDemoApplication.class, args);
        //
        // MyService myService = context.getBean(MyService.class);
        // LOGGER.info("MyService {}", myService.getClass());
        //
        // myService.foo();
        //
        // context.close();

        MyService myService = new MyService();
        LOGGER.info("MyService {}", myService.getClass());
        myService.foo();
    }
}
