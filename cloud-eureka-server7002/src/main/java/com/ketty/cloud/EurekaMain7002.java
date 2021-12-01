package com.ketty.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangLiQiang
 * @create 2021-12-01 14:51
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002
{
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaMain7002.class,args);
	}
}
