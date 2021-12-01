package com.ketty.cloud.service;

import com.ketty.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangLiQiang
 * @create 2021-11-30 15:47
 */
public interface PaymentService {
	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);
}
