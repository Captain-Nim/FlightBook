package com.arnab.FlightTicket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.FlightTicket.DTO.FlightBookingAcknowledgementDTO;
import com.arnab.FlightTicket.DTO.FlightBookingDetailsDTO;
import com.arnab.FlightTicket.Service.FlightBookingService;

@RestController
public class FlightBookingController 
{
	
	@Autowired
	private FlightBookingService flightBookingService;
	
	@PostMapping(path = "/bookTicket")
	public FlightBookingAcknowledgementDTO bookFlightTicket(@RequestBody FlightBookingDetailsDTO ticketDetails) throws Exception{
		FlightBookingAcknowledgementDTO ret = flightBookingService.bookFlightTicket(ticketDetails);
		return ret;
	}
}
