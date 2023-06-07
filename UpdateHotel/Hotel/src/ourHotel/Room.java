package ourHotel;

import java.io.Serializable;

public class Room implements Serializable{

	public int getNumRoom() {
		return numRoom;
	}
	public void setNumRoom(int numRoom) {
		this.numRoom = numRoom;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public  Double getStartPrice() {
		return startPrice;
	}
	public  void setStartPrice(Double startPrice) {
		this.startPrice = startPrice;
	}
	private int numRoom;
	private int floor;
	private int level;
	private boolean isActive;
	private  double startPrice;

	public Room(int numRoom, int floor, int level, boolean isActive, double startPrice) {
		this.numRoom = numRoom;
		this.floor = floor;
		this.level = level;
		this.isActive = isActive;
		this.startPrice = startPrice;
	}
	//to change
	public Room() {
		
	}
	@Override
	public String toString() {
		return "\nnumRoom:" + numRoom + "\nfloor=" + floor + "\nlevel=" + level + "\nisActive=" + isActive + "\n";
	}

	//	@Override
//	public String toString() {
//		return "Guest: \nperson:" + person + " \nNumVisit:" + NumVisit + "\n";
//	}

}
