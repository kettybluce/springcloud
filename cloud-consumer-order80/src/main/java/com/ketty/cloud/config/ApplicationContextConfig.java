package com.ketty.cloud.config;

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
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
