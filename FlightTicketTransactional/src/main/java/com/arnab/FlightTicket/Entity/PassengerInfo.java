package com.arnab.FlightTicket.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PassengerDetails")
public class PassengerInfo 
{
	@Id
	@GeneratedValue
	private Long passengerId;
	private String passengerName;
	private Double fare;
	
}
