package com.ketty.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * 支付类的主启动类
 * </p>
 *
 * @author zhangLiQiang
 * @create 2021-11-30 14:45
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
public class PaymentMain8001 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8001.class, args);
	}
}
