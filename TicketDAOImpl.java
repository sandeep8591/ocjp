package com.cg.tms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.TicketException;
import com.cg.tms.util.Util;

public class TicketDAOImpl implements TicketDAO {

	static HashMap<String, String> ticketCategory = new HashMap<String, String>(
			Util.getTicketCategoryEntries());
	static HashMap<Integer, TicketBean> ticketLog = new HashMap<Integer, TicketBean>();


	TicketBean ticketBean = new TicketBean();

	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) throws TicketException {
		int ticketNo = (int) (Math.random() * 120);//
		this.ticketBean.setTicketNo(ticketNo);
//		ticketLog.put(ticketNo, ticketBean);
//		return true;
		if (ticketLog.put(ticketNo, ticketBean) != null)
			return true;
		else
			throw new TicketException("Ticket could not be raised");
	}

	@Override
	public List<TicketCategory> listTicketCategory() {
		return null;
	}

}
