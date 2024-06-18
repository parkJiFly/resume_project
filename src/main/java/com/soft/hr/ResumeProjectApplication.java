package com.soft.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = "com.soft.hr")
@EnableAsync
@MapperScan("com.soft.hr.mapper")
public class ResumeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeProjectApplication.class, args);
	}

}
