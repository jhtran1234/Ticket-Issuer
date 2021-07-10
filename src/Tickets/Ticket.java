package Tickets;

import java.util.Random;

public final class Ticket {
	private String name;
	private boolean used;
	
	public Ticket(String n) {
		name = n;
		used = false;
	}
	
	public void use() {
		used = true;
	}
	
	public boolean used(){
		return used;
	}
	
	public static String newTicket() {
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 20;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();

	    return generatedString;
	}
}
