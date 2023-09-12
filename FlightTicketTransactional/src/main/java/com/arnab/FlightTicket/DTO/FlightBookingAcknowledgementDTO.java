package com.arnab.FlightTicket.DTO;

import com.arnab.FlightTicket.Entity.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingAcknowledgementDTO 
{
	private String status;
	private Double totalfare;
	private String pnrNo;
	private PassengerInfo passengerInfo;
}
