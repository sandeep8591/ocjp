package com.cg.tms.util;

@SuppressWarnings("serial")
public class TicketException extends Exception {
	String message;
	public TicketException(String message) {
		this.message=message;
	}
	
	public String getMessage(){
		return message;
	}
}
