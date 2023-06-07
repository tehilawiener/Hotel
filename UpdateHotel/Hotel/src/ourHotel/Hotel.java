package ourHotel;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Hotel implements Serializable{
	private static Hotel instance;

	private String Name ="The David Citadel";
	private Address address=new Address("Israel", "Jerusalem","Qween Esther", 45);
	private String phoneNumber="02-9865662";
	private ListRoom roomsList;
	private ListGuest  GuestList;
	private ListOrder orderList;



	private Hotel()
	{

	}
	public static Hotel getInstance() {
		if (instance == null) {
			instance = new Hotel();
		}
		return instance;
	}

	//delete an order
	public void deleteOrder(int id) {
		//find the guest
		Guest oldGuest =GuestList.findByID(id).get();
		//delete the order & get the room number for update
		int numRoom=orderList.deleteOrder(oldGuest);
		//deletOrder.getRoom().setActive(false);
		this.roomsList.findByroomNum(numRoom).get().setActive(true);
	}



	//add an order
	public void addOrder(Guest g1,int numRoom,int numDays) {
		Room room1=new Room();

		Optional<Room> optionalRoom = this.roomsList.findByroomNum(numRoom);
		if (optionalRoom.isPresent()) {
			room1 = optionalRoom.get();
			Order newOrder=new Order(g1,room1, LocalDate.now(),numDays);
			this.roomsList.findByroomNum(numRoom).get().setActive(true);
			room1.setActive(true);
			this.orderList.addOrder(newOrder);
			this.GuestList.addGuest(g1);
		}
		else {
			System.out.println("there is no such room");
		}

		//		Order newOrder=new Order(g1,room1, LocalDate.now(),numDays);
		//		room1.setActive(true);
		//		this.orderList.add(newOrder);
		//		this.guestList.addGuest(g1);
	}


}
