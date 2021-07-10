package Driver;

import java.util.TreeMap;
import java.util.Scanner;

import Tickets.Ticket;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Welcome to the ticket assignment system.");
		System.out.println("Here are your options:");
		System.out.println("1. Issue a ticket");
		System.out.println("2. Scan a ticket");
		System.out.println("3. Delete a ticket");
		System.out.println("4. Quit");

		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		
		TreeMap<String, Ticket> tickets = new TreeMap<>();
		while(select != 4) {
			if (select == 1) {
				System.out.println("Name: ");
				String name = scan.nextLine();
				if (name.length() == 0) {
					name = scan.nextLine();
				}

				String s = Ticket.newTicket();

				tickets.put(s, new Ticket(name));
				System.out.println(s);
			}
			else if (select == 2) {
				System.out.println("Enter ticket to be scanned:");
				String hash = scan.next();
				Ticket t = tickets.get(hash);

				if(!t.used()) {
					t.use();
					System.out.println("SUCCESS");
				}
				else {
					System.out.println("FAIL: Ticket Already Used");
				}

			}
			else if (select == 3) {
				System.out.println("Enter ticket to be deleted:");
				String hash = scan.nextLine();
				tickets.remove(hash);
			}
			else if (select == 4) {
				//write quit code here
			}

			select = scan.nextInt();
		}
	}
}
