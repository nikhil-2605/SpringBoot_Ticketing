package com.example.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.TicketBookingDao;
import com.example.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketbookingdao;
	
	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketbookingdao.save(ticket);
	}

	public Optional<Ticket> getTicketbyID(Integer ticketId) {
		// TODO Auto-generated method stub
		return ticketbookingdao.findById(ticketId);
	}

	public Iterable<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketbookingdao.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		 ticketbookingdao.deleteById(ticketId);
	}

	public Ticket updateEmail(Integer ticketId, String newEmail) {
		
		Optional<Ticket> tik=ticketbookingdao.findById(ticketId);
		
		tik.get().setEmail(newEmail);
		
		Ticket tik2=ticketbookingdao.save(tik.get());
		
		return tik2;
	}

}
