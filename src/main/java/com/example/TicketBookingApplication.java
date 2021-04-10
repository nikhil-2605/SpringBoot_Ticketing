package com.example;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.entities.Ticket;
import com.example.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingApplication {
	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingApplication.class, args);
	//  TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);
		  
	TicketBookingService ticketBookingService = applicationContext.getBean(TicketBookingService.class);
	
	Ticket t1=new Ticket(); t1.setBookingDate(new Date());
	  t1.setDestination("blore"); t1.setSource("bhilai");
	  t1.setPassengerName("nik"); t1.setEmail("niksin@gmail.com");
	   
	  ticketBookingService.createTicket(t1);
	  
	}

}
 