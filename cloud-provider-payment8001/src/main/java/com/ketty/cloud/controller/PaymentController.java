package com.ketty.cloud.controller;

import com.ketty.cloud.entities.CommonResult;
import com.ketty.cloud.entities.Payment;
import com.ketty.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.*;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangLiQiang
 * @create 2021-11-30 15:58
 */
@RestController
@Slf4j
public class PaymentController {
	@Resource
	private PaymentService paymentService;

	@PostMapping(value = "/payment/create")
	public CommonResult create(@RequestBody Payment payment) {
		int result = paymentService.create(payment);
		log.info("*****插入操作返回结果:" + result);
		int a=10;
		System.out.println(a);

		if (result > 0) {
			return new CommonResult(200, "插入数据库成功", result);
		} else {
			return new CommonResult(444, "插入数据库失败", null);
		}
	}

	@GetMapping(value = "/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
		Payment payment = paymentService.getPaymentById(id);
		log.info("*****查询结果:{}", payment);
		if (payment != null) {
			return new CommonResult(200, "查询成功", payment);
		} else {
			return new CommonResult(444, "没有对应记录,查询ID: " + id, null);
		}
	}
}



