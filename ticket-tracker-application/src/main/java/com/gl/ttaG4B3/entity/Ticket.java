package com.gl.ttaG4B3.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tickets")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ticket_title", nullable = false)
	private String ticketTitle;

	@Column(name = "ticket_short_description", nullable = false)
	private String ticketShortDescription;

	@Column(name = "ticket_content", nullable = false)
	private String ticketContent;

	@Column(name = "ticket_created_on", nullable = false)
	private String ticketCreatedOn;

	public Ticket() {

	}

	public Ticket(String ticketTitle, String ticketShortDescription, String ticketContent, String ticketCreatedOn) {
		super();
		this.ticketTitle = ticketTitle;
		this.ticketShortDescription = ticketShortDescription;
		this.ticketContent = ticketContent;
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("DD MM YYYY");
		String strDate = dateFormat.format(date);
		this.ticketCreatedOn = strDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTicketTitle() {
		return ticketTitle;
	}

	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public String getTicketContent() {
		return ticketContent;
	}

	public void setTicketContent(String ticketContent) {
		this.ticketContent = ticketContent;
	}

	public String getTicketShortDescription() {
		return ticketShortDescription;
	}

	public void setTicketShortDescription(String ticketShortDescription) {
		this.ticketShortDescription = ticketShortDescription;
	}

	public String getTicketCreatedOn() {
		return ticketCreatedOn;
	}

	public void setTicketCreatedOn(String ticketCreatedOn) {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("DD MM YYYY");
		String strDate = dateFormat.format(date);
		this.ticketCreatedOn = strDate;
	}

}
