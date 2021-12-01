package com.ketty.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangLiQiang
 * @create 2021-11-30 17:45
 */
@Configuration
public class ApplicationContextConfig {
	@Bean
	@LoadBalanced //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
