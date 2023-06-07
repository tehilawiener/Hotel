package ourHotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListOrder {

	private ListRoom roomList;
	private ListGuest guestList;
	private List<Order>orderList;

	//לא לשכוח לשנות כך שיחזיר שכפול של הרשימה ולא 
	public List<Order> getOrderList() {
		return orderList;
	}

	//	public void setArrayOrder(Order[] arrayOrder) {
	//		ArrayOrder = arrayOrder;
	//	}

	public ListOrder(ListRoom rm, ListGuest gl) {
		this.orderList = new ArrayList<Order>();
		this.roomList=rm;
		this.guestList=gl;
	}



	@Override
	public String toString() {
		return "ListOrder:\n" +  this.orderList + "\n";
		//this.roomList +""+ this.guestList+ ""+
	}

	//add an order
	public void addOrder(Order newOrder) {
		this.orderList.add(newOrder);
		
	}
	
	
//remove order by guest
	public int deleteOrder(Guest guest) {
		Order delOrder=this.findByGuest(guest).get();
		this.orderList.remove(delOrder);
		return delOrder.getRoom().getNumRoom();
	}

	
	
	public Optional<Order> findByGuest(Guest g) {
		Optional<Order> orderGuest = orderList.stream()
				.filter(o -> o.getGuest().getPerson().getId() == g.getPerson().getId())
				.findFirst();	

		return orderGuest;
	}

	public Optional<Order> findByRoom(int roomNum) {
		Optional<Order> OrderRoom = orderList.stream()
				.filter(o -> o.getRoom().getNumRoom()== roomNum)
				.findFirst();	

		return OrderRoom;
	}
	



}
