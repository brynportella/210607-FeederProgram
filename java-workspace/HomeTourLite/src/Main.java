import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Set up rooms 
		//set up player 
		RoomManager rm = new RoomManager(); 
		rm.init(); 
		
		Room currentRoom = rm.startingRoom; 
		boolean quit = false; 
		while(!quit) {
			System.out.println(currentRoom);
			System.out.println("Where do you want to go? Left or right?"
					+ "\nOr do you want to quit?");
			String input = scan.next(); 
			if (input.trim().toLowerCase().equals("quit")) {
				quit = true; 
				continue; 
			}
			Room nextRoom = null; 
			if(input.equals("left")) {
				nextRoom = currentRoom.getLeftExit(); 
			}else if (input.equals("right")) {
				nextRoom = currentRoom.getRightExit(); 
			}
			
			if(nextRoom != null) {
				currentRoom = nextRoom; 
			}
		}
		
	}
}
