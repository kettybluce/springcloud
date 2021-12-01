package com.ketty.cloud.dao;

import com.ketty.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangLiQiang
 * @create 2021-11-30 15:39
 */
@Mapper
public interface PaymentDao {
	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);
}
