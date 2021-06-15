
public class RoomManager {
	Room startingRoom; 
	Room[] allRooms; 
	
	public void init() {
		Room kit = new Room("kit");
		Room lr = new Room("lr");
		
		allRooms = new Room[2]; 
		allRooms[0] = kit; 
		allRooms[1] = lr;
		
		lr.setRightExit(kit);
		
		kit.setLeftExit(lr); 
		
		startingRoom = lr; 
	}
}
