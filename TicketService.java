package com.cg.tms.service;

import java.util.List;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.TicketException;

public interface TicketService {
	boolean raiseNewTicket(TicketBean ticketBean) throws TicketException;

	List<TicketCategory> listTicketCategory();

}
