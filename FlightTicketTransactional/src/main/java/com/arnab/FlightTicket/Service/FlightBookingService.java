package com.arnab.FlightTicket.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arnab.FlightTicket.DTO.FlightBookingAcknowledgementDTO;
import com.arnab.FlightTicket.DTO.FlightBookingDetailsDTO;
import com.arnab.FlightTicket.Entity.PassengerInfo;
import com.arnab.FlightTicket.Entity.PaymentInfo;
import com.arnab.FlightTicket.Exception.InvalidPaymentDetails;
import com.arnab.FlightTicket.Repository.PassengerInfoRepository;
import com.arnab.FlightTicket.Repository.PaymentInfoRepository;
import com.arnab.FlightTicket.Utils.PaymentUtils;

@Service
public class FlightBookingService 
{
	
	@Autowired
	PassengerInfoRepository passengerRepo;
	
	@Autowired
	PaymentInfoRepository paymentRepo;
	
	@Transactional
	public FlightBookingAcknowledgementDTO bookFlightTicket(FlightBookingDetailsDTO ticketDetails) throws Exception {
		
		PassengerInfo passengerInfo = ticketDetails.getPassengerInfo();
		PaymentInfo paymentInfo = ticketDetails.getPaymentInfo();
		
		if(paymentInfo == null)
		{
			throw new InvalidPaymentDetails("Invalid Payment Details");
		}
		
		passengerRepo.save(passengerInfo);
		System.out.println("Account no = "+paymentInfo.getAccountNo());
		System.out.println("Fare = "+passengerInfo.getFare());
		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
		
		paymentInfo.setPassengerId(passengerInfo.getPassengerId());
		paymentInfo.setPaymentAmount(passengerInfo.getFare());
		paymentInfo.setPaymentStatus("Success");
		
		paymentRepo.save(paymentInfo);
		
		return new FlightBookingAcknowledgementDTO("Success",passengerInfo.getFare(), UUID.randomUUID().toString(), passengerInfo);
	}

}
