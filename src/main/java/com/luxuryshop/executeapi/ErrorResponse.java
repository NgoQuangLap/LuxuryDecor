package com.luxuryshop.executeapi;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ErrorResponse {
	
	private LocalDateTime time;
	private String message;

	public ErrorResponse(String message) {
		this.time = LocalDateTime.now();
		this.message = message;
	}
	
}
