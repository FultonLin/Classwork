package CaveExplorer;

public class NewRoom extends CaveRoomPd8 {

	public NewRoom(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}
	
	public void interpretAction(String input) {
		while(!isValid(input)){
			CaveExplorer.print("Please enter 'w','a','s', or 'd'");
			input = CaveExplorer.in.nextLine().toLowerCase();
		}
		String[] keys = {"w","d","s","a"};
		int indexFound = -1;
		for(int i = 0; i < keys.length; i++){
			if(keys[i].equals(input)){
				indexFound = i;
				break;
			}
		}
		goToRoom(indexFound);
	}
	
	public void goToRoom(int indexFound){
				if(borderingRooms[indexFound] != null && doors[indexFound] != null && doors[indexFound].isOpen()){
			CaveExplorer.currentRoom.leave();
			CaveExplorer.currentRoom = borderingRooms[indexFound];
			CaveExplorer.currentRoom.enter();
			CaveExplorer.inventory.updateMap();
		}
	}
	
	private static boolean isValid(String input) {
		String[] validKeys = {"w","a","s","d"};
		for(String key: validKeys){
			if(input.toLowerCase().equals(key)){
				return true;
			}
		}
		return false;
	}
}
