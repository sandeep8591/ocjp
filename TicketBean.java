package com.cg.tms.dto;

public class TicketBean {
	private int ticketNo;
	private TicketCategory ticketCategory;
	private String ticketDescription;
	private String ticketPriority;
	private String ticketStatus;
	private String comments;
	
	public TicketBean() {
		// TODO Auto-generated constructor stub
	}

	public TicketBean(TicketCategory ticketCategory,
			String ticketDescription, String ticketPriority,
			String ticketStatus, String comments) {
		super();
		this.ticketCategory = ticketCategory;
		this.ticketDescription = ticketDescription;
		this.ticketPriority = ticketPriority;
		this.ticketStatus = ticketStatus;
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "TicketBean [ticketNo=" + ticketNo + ", ticketCategory="
				+ ticketCategory + ", ticketDescription=" + ticketDescription
				+ ", ticketPriority=" + ticketPriority + ", ticketStatus="
				+ ticketStatus + ", comments=" + comments + "]";
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public TicketCategory getTicketCategory() {
		return ticketCategory;
	}

	public void setTicketCategory(TicketCategory ticketCategory) {
		this.ticketCategory = ticketCategory;
	}

	public String getTicketDescription() {
		return ticketDescription;
	}

	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	public String getTicketPriority() {
		return ticketPriority;
	}

	public void setTicketPriority(String ticketPriority) {
		this.ticketPriority = ticketPriority;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
