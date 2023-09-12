package com.arnab.FlightTicket.Exception;

import net.bytebuddy.implementation.bind.annotation.Super;

public class InsufficientFundException extends RuntimeException 
{

	public InsufficientFundException(String msg) {
		super(msg);
	}
	
}
