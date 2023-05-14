package com.luxurydecor.SolveException;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class APIException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7200702759039508585L;
	private String msg = "bad request, please check it again";

}
