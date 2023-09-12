package com.arnab.FlightTicket.DTO;

import com.arnab.FlightTicket.Entity.PassengerInfo;
import com.arnab.FlightTicket.Entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingDetailsDTO 
{
	private PaymentInfo paymentInfo;
	private PassengerInfo passengerInfo;
}
