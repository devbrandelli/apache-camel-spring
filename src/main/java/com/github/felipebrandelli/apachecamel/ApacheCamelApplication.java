package com.github.felipebrandelli.apachecamel;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ApacheCamelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApacheCamelApplication.class, args);
    }

}
