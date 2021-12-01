package com.ketty.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 *  注册中心
 * </p>
 *
 * @author zhangLiQiang
 * @create 2021-12-01 14:23
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001
{
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaMain7001.class,args);
	}
}
