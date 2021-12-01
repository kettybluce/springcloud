package com.ketty.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangLiQiang
 * @create 2021-11-30 17:36
 */
@SpringBootApplication
@EnableEurekaClient
public class MainApp80
{
	public static void main(String[] args)
	{
		SpringApplication.run(MainApp80.class,args);
	}
}

