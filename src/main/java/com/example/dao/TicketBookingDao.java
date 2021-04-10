package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket,Integer> {

}
