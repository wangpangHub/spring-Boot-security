package com.springboot.wangpan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.springboot.wangpan")
@SpringBootApplication
public class WangpanApplication {

	public static void main(String[] args) {
		SpringApplication.run(WangpanApplication.class, args);
	}

}
