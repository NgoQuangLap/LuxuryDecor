package com.luxuryshop;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneratePassword {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(5);
		String result = encoder.encode("123456Quan");
		System.out.println(result);
	}
}
