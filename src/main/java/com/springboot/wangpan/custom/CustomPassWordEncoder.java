package com.springboot.wangpan.custom;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

/**
 * 重写spring security 默认的PasswordEncoder.
 *
 * @author homolo
 * @version 1.0
 * @date 21-1-19 下午3:30
 */
public class CustomPassWordEncoder implements PasswordEncoder {

	@Override
	public String encode(CharSequence passWord) {
		return DigestUtils.md5DigestAsHex(passWord.toString().getBytes(StandardCharsets.UTF_8));
	}

	/**
	 * 重写spring security 验证方法
	 *
	 * @param charSequence
	 * @param s
	 * @return
	 */
	@Override
	public boolean matches(CharSequence charSequence, String s) {
		return encode(charSequence).equals(s);
	}
}
