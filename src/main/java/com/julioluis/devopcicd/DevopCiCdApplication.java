package com.julioluis.devopcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopCiCdApplication {

    public static void main(String[] args) {
        Object object = null;
        System.out.println(object.hashCode());
        SpringApplication.run(DevopCiCdApplication.class, args);
    }

}
