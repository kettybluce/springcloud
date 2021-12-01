package com.ketty.cloud.controller;

import com.ketty.cloud.entities.CommonResult;
import com.ketty.cloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangLiQiang
 * @create 2021-11-30 17:44
 */
@RestController
public class OrderController {

	public static final String PAYMENT_SRV = "http://CLOUD-PAYMENT-SERVICE";

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/consumer/payment/create") //客户端用浏览器是get请求，但是底层实质发送post调用服务端8001
	public CommonResult create(Payment payment)
	{
		return restTemplate.postForObject(PAYMENT_SRV + "/payment/create",payment,CommonResult.class);
	}


	@GetMapping("/consumer/payment/get/{id}")
	public CommonResult getPayment(@PathVariable Long id)
	{
		return restTemplate.getForObject(PAYMENT_SRV + "/payment/get/"+id, CommonResult.class, id);
	}
}

