package com.ketty.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangLiQiang
 * @create 2021-11-30 14:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
	private Long id;
	private String serial;
}

