package com.example;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.entities.Ticket;
import com.example.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner{
	@Autowired  
	TicketBookingService ticketBookingService;
	
		@Autowired
		private DataSource datasource;
	public static void main(String[] args) {
	SpringApplication.run(TicketBookingApplication.class, args);
	//  TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);
	  
	}

	@Override
	public void run(String... args) throws Exception {
		Ticket t1=new Ticket(); t1.setBookingDate(new Date());
		  t1.setDestination("blore"); t1.setSource("bhilai");
		  t1.setPassengerName("nik"); t1.setEmail("niksin@gmail.com");
		   
		  ticketBookingService.createTicket(t1);
		  
		  System.out.println("Datasource ->"+datasource);
		
	}

}
 