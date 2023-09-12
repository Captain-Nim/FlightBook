package com.arnab.FlightTicket.Utils;

import java.util.HashMap;

import com.arnab.FlightTicket.Exception.InsufficientFundException;

public class PaymentUtils 
{
	private static HashMap<String, Double> paymentMap = new HashMap<>();
	
	static {
		paymentMap.put("Arnab", 8000.0);
		paymentMap.put("Aditi", 10000.0);
		
	}
	
	public static boolean validateCreditLimit(String accNo, Double paidAmount)
	{
		System.out.println("AccountNo in utils = "+accNo);
		System.out.println("Paid Amount in Utils = "+paidAmount);
		System.out.println("Credit limit for Accunt -> "+accNo+ " is = "+paymentMap.get(accNo));
		if(paidAmount > paymentMap.get(accNo))
		{
			throw new InsufficientFundException("InsufficientFund...!!");
		}
		else {
			return true;
		}
	}
}
