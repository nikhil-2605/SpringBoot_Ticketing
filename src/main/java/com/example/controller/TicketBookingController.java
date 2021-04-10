package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Ticket;
import com.example.service.TicketBookingService;

@Controller
@RestController
@RequestMapping(value="com/example")
public class TicketBookingController {


@Autowired
private TicketBookingService ticketbookingservice;	
	
@PostMapping(value="createticket")
public Ticket createTicket(@RequestBody Ticket ticket)
{
	return ticketbookingservice.createTicket(ticket);
}

@GetMapping(value="viewone/{ticketId}")
public Optional<Ticket> getTicketbyID(@PathVariable("ticketId")Integer ticketId)
{
	return ticketbookingservice.getTicketbyID(ticketId);
}

@GetMapping(value="viewall")
public Iterable <Ticket> getAllTickets()
{
	return ticketbookingservice.getAllTickets();
}

@DeleteMapping(value="delete/{ticketId}")
public void deleteTicket(@PathVariable("ticketId")Integer ticketId)
{
	 ticketbookingservice.deleteTicket(ticketId);
}

@PutMapping(value="update/{ticketId}/{newEmail:.+}")
public Ticket updateEmail(@PathVariable("ticketId")Integer ticketId,@PathVariable("newEmail") String newEmail)
{
	return ticketbookingservice.updateEmail(ticketId,newEmail);
}
}
