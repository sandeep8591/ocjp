package com.cg.tms.ui;

import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketCategory;

public class Test {

	public static void main(String[] args) {
		
		TicketCategory tc=new TicketCategory();
		TicketDAOImpl dao=new TicketDAOImpl();
		
		System.out.println(tc.getCategoryName());
		System.out.println(tc.getTicketCategoryId());

	}

}
