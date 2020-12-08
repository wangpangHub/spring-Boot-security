package com.springboot.wangpan.utils;

import org.thymeleaf.util.StringUtils;

/**
 * @author homolo
 * @version 1.0
 * @date 20-8-25 下午3:47
 */
public class RetrunNewsUtils {
	public String code;

	public RetrunNewsUtils(Enum cod, Object object) {
		if (!StringUtils.isEmpty(cod.toString())) {
           this.code=cod.toString();
		}
	}


	@Override
	public String toString() {
		return super.toString();
	}
}
