package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @author liwuxin
 *
 */
@SpringBootApplication
@MapperScan("com.liwuxin.mayday.mapper")
@EnableTransactionManagement
@EnableCaching
public class Application {
	public static void main(String[] args) { 
		SpringApplication.run(Application.class, args);
	}
}
