package com.gl.ttaG4B3.service;

import java.util.List;

import com.gl.ttaG4B3.entity.Ticket;

public interface TicketService {

	List<Ticket> getAllTickets();

	Ticket saveTicket(Ticket ticket);

	Ticket getTicketById(Long id);

	Ticket editTicket(Ticket ticket);

	void deleteTicketById(Long id);

	Ticket viewTicket(Long id);

	List<Ticket> findByKeyword(String query);

}
