package com.cg.tms.util;

import java.util.HashMap;
import java.util.Map;

public class Util {
	private static Map<String, String> ticketCategory = new HashMap<String, String>();

	public static Map<String, String> getTicketCategoryEntries() {
		ticketCategory.put("tc001", "software installatio;n");
		ticketCategory.put("tc002", "mailbox creation");
		ticketCategory.put("tc003", "mailbox issues");
		return ticketCategory;
	}

}
