package ourHotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListRoom {
	private List <Room> roomList;

	private List<Integer>OccupiedRoom;
	private List<Integer>EmptyRoom;

	public List<Integer> getOccupiedRoom() {
		return OccupiedRoom;
	}

	public void setOccupiedRoom(List<Integer> occupiedRoom) {
		OccupiedRoom = occupiedRoom;
	}

	public List<Integer> getEmptyRoom() {
		return EmptyRoom;
	}

	public void setEmptyRoom(List<Integer> emptyRoom) {
		EmptyRoom = emptyRoom;
	}

	public ListRoom() {
		this.roomList = new ArrayList<Room>();
	}

	public void addRoom(Room r) {
		roomList.add(r);
	}

	public Optional<Room> findByroomNum(int roomNum) {
		Optional<Room> room = roomList.stream()
				.filter(r -> r.getNumRoom() == roomNum)
				.findFirst();	
//		System.out.println(room);
		return room;
	}

	public void findByLevel(int level) {
		Optional<Room> room = roomList.stream()
				.filter(r -> r.getLevel() == level)
				.findFirst();	
		System.out.println(room);
	}

	public void findByFloor(int floor) {
		Optional<Room> room = roomList.stream()
				.filter(r -> r.getFloor() == floor)
				.findFirst();	
		System.out.println(room);
	}

	public void allRooms() {
		System.out.println(roomList);
	}
	@Override
	public String toString() {
		return "RoomList:\n" + this.roomList+"\n\n" ;
	}

}
