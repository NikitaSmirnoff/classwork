package CaveExplorer;

public class Inventory {

	private boolean hasMap;
	private String map;
	
	public Inventory() {
		hasMap = true;
		updateMap();
	}
	
	private void updateMap() {
		
		
	}

	public String getDescription() {
		if(hasMap){
			return map;
		}
		else{
			return "There's nothing in your inventory.";
		}
	}
	
	public void setMap(boolean b){
		hasMap = b;
	}
}
