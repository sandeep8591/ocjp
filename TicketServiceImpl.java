package com.cg.tms.service;

import java.util.List;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.TicketException;

public class TicketServiceImpl implements TicketService {

	TicketDAO dao;
	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) throws TicketException {
		// TODO Auto-generated method stub
		return dao.raiseNewTicket(ticketBean);
	}

	@Override
	public List<TicketCategory> listTicketCategory() {
		// TODO Auto-generated method stub
		return null;
	}

}
