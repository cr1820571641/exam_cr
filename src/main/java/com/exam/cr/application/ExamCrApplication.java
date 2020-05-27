package com.exam.cr.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.exam.cr")
@MapperScan(basePackages = "com.exam.cr.dao")
public class ExamCrApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamCrApplication.class, args);
    }

}
