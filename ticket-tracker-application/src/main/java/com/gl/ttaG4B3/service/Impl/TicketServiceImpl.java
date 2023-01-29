package com.gl.ttaG4B3.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.ttaG4B3.entity.Ticket;
import com.gl.ttaG4B3.repository.TicketRepository;
import com.gl.ttaG4B3.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	private TicketRepository ticketRepository;

	public TicketServiceImpl(TicketRepository ticketRepository) {
		super();
		this.ticketRepository = ticketRepository;
	}

	@Override
	public List<Ticket> getAllTickets() {
		return ticketRepository.findAll();
	}

	@Override
	public Ticket saveTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@Override
	public Ticket getTicketById(Long id) {
		return ticketRepository.findById(id).get();
	}

	@Override
	public Ticket editTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@Override
	public void deleteTicketById(Long id) {
		ticketRepository.deleteById(id);
	}

	@Override
	public Ticket viewTicket(Long id) {
		return ticketRepository.findById(id).get();
	}

	@Override
	public List<Ticket> findByKeyword(String query) {
		return ticketRepository.findByKeyword(query);
	}

}
