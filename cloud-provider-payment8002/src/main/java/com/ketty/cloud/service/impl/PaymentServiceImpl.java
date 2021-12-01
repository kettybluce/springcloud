package com.ketty.cloud.service.impl;

import com.ketty.cloud.dao.PaymentDao;
import com.ketty.cloud.entities.Payment;
import com.ketty.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * <p>
 *
 * </p>
 *
 * @author zhangLiQiang
 * @create 2021-11-30 15:48
 */
@Service
public class PaymentServiceImpl implements PaymentService {
	@Resource
	private PaymentDao paymentDao;


	@Override
	public int create(Payment payment) {
		return paymentDao.create(payment);
	}

	@Override
	public Payment getPaymentById(Long id) {
		return paymentDao.getPaymentById(id);
	}
}

