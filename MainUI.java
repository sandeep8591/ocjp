package com.cg.tms.ui;

import java.io.ObjectInputStream.GetField;
import java.util.List;
import java.util.Scanner;

import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.service.TicketService;
import com.cg.tms.service.TicketServiceImpl;
import com.cg.tms.util.TicketException;

public class MainUI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice, categoryChoice, ticketPriority;
		String description, ticketPriorityString, ticketStatus,comments;

		TicketService service = new TicketServiceImpl();
		TicketCategory ticket = new TicketCategory();
		// TicketCategory tc=new TicketCategory();
		TicketDAOImpl dao;

		System.out.println("Welcome to ITICS Help Desk");
		System.out.println();
		do {
			System.out.println("Select your Option");
			System.out.println("1 to Raise a Ticket");
			System.out.println("2 to Exit from the system");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Select Ticket Category form below List");
				System.out.println("1:SoftWare Installation");
				System.out.println("2:Mailbox creation");
				System.out.println("3:network issues");

				categoryChoice = sc.nextInt();

				if (categoryChoice == 1) {
					ticket.setTicketCategoryId("tc001");
					ticket.setCategoryName("software installation");
//					ticket = new TicketCategory(ticket.getTicketCategoryId(),
//							ticket.getCategoryName());
				}
				// ticket= new TicketCategory("tc001", "software installation");
				else if (categoryChoice == 2) {
					ticket.setTicketCategoryId("tc002");
					ticket.setCategoryName("mailbox creation");
//					ticket = new TicketCategory(ticket.getTicketCategoryId(),
//							ticket.getCategoryName());
				}
				// ticket=new TicketCategory("tc002", "mailbox creation");
				else if (categoryChoice == 3) {
					ticket.setTicketCategoryId("tc003");
					ticket.setCategoryName("mailbox issues");
//					ticket = new TicketCategory(ticket.getTicketCategoryId(),
//							ticket.getCategoryName());
				}
				// ticket=new TicketCategory("tc003", "mailbox issues");

				switch (categoryChoice) {
				case 1:
					System.out
							.println("Enter Description related to issue(one line seperated by comma)");
					description = sc.next();

					while (true) {
						System.out.println("Enter Priority");
						System.out.println("1.low");
						System.out.println("2.medium");
						System.out.println("3.high");
						ticketPriority = sc.nextInt();
						if (ticketPriority == 1) {
							ticketPriorityString = "low";
							break;
						} else if (ticketPriority == 2) {
							ticketPriorityString = "medium";
							break;
						} else if (ticketPriority == 3) {
							ticketPriorityString = "high";
							break;
						} else
							System.out.println("Invalid priority try again");
					}

					ticketStatus = "New";
					comments = "Comments";

					try {
						TicketBean tb = new TicketBean(null, description,
								ticketPriorityString, ticketStatus, comments);
						if(service.raiseNewTicket(tb))
							System.out.println();
					} catch (TicketException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					break;
					
				case 2:
					System.out
					.println("Enter Description related to issue(one line seperated by comma)");
			description = sc.next();

			while (true) {
				System.out.println("Enter Priority");
				System.out.println("1.low");
				System.out.println("2.medium");
				System.out.println("3.high");
				ticketPriority = sc.nextInt();
				if (ticketPriority == 1) {
					ticketPriorityString = "low";
					break;
				} else if (ticketPriority == 2) {
					ticketPriorityString = "medium";
					break;
				} else if (ticketPriority == 3) {
					ticketPriorityString = "high";
					break;
				} else
					System.out.println("Invalid priority try again");
			}

			ticketStatus = "New";
			comments = "Comments";
			
			break;
			
				case 3:
					System.out
					.println("Enter Description related to issue(one line seperated by comma)");
			description = sc.next();

			while (true) {
				System.out.println("Enter Priority");
				System.out.println("1.low");
				System.out.println("2.medium");
				System.out.println("3.high");
				ticketPriority = sc.nextInt();
				if (ticketPriority == 1) {
					ticketPriorityString = "low";
					break;
				} else if (ticketPriority == 2) {
					ticketPriorityString = "medium";
					break;
				} else if (ticketPriority == 3) {
					ticketPriorityString = "high";
					break;
				} else
					System.out.println("Invalid priority try again");
			}

			ticketStatus = "New";
			comments = "Comments";

				}
				break;
			case 2:
				System.out.println("Exitting");

			}
		} while (choice != 2);
		
		sc.close();

	}
}
