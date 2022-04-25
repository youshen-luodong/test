package com.hs.tz;

import com.hs.tz.bean.EnableAutoImport;
import com.hs.tz.bean.FirstClass;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableAutoImport
public class TzApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(TzApplication.class, args);
        FirstClass fc = ca.getBean(FirstClass.class);
    }

}
