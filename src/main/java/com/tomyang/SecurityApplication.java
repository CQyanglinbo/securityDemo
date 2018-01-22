package com.tomyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot启动类
 * @author yc
 * @date 2018/1/16
 */
@ComponentScan(value = "com.tomyang")
@SpringBootApplication
public class SecurityApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	/**
	 * 打成war
	 * @param builder
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SecurityApplication.class);
	}
}