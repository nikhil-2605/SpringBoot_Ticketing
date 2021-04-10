package com.example.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class Ticket {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="ticket_Id")
	private Integer ticketid;
@Column(name="passenger_name")
	private String passengerName;
@Column(name="src")
	private String source;
@Column(name="dest")
	private String destination;
@Column(name="booking_date")
	private Date bookingDate;
@Column(name="email_Id")
	private String email;
public Integer getTicketid() {
	return ticketid;
}
public void setTicketid(Integer ticketid) {
	this.ticketid = ticketid;
}
public String getPassengerName() {
	return passengerName;
}
public void setPassengerName(String passengerName) {
	this.passengerName = passengerName;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public Date getBookingDate() {
	return bookingDate;
}
public void setBookingDate(Date bookingDate) {
	this.bookingDate = bookingDate;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
	
	
}
