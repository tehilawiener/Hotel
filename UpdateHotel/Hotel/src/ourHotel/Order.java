package ourHotel;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Order implements Serializable{
	private int numOrder;
	private Guest guest;
	private Room room;
	private LocalDate OrderDate;
	private int numDays;
	public int getNumOrder() {
		return numOrder=0;
	}
	//public void setNumOrder(int numOrder) {
	//	this.numOrder = numOrder;
	//}
	public Guest getGuest() {
		return guest;
	}

	public Order( Guest guest, Room room, LocalDate orderDate, int numDays) {
		this.numOrder ++;
		this.guest = guest;
		this.room = room;
		OrderDate = orderDate;
		this.numDays = numDays;
	}
	public void setGuest(Guest guest) {
		this.guest = guest;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public LocalDate getOrdeDate() {
		return OrderDate;
	}
	public void setOrdeDate(LocalDate ordeDate) {
		OrderDate = ordeDate;
	}

	public int getNumDays() {
		return numDays;
	}
	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}
	
	
	@Override
	public String toString() {
		return "Order:\nnumOrder:" + numOrder + " \nguest=" + guest + " \nroom=" + room + " \nOrderDate=" + OrderDate
				+ " \nnumDays=" + numDays ;
	}
	public Double calcPrice() {
		Double price;
		BuisnessGuest bg;
		if(this.guest instanceof BuisnessGuest) {
			bg=(BuisnessGuest)this.guest;
			price=this.numDays*this.room.getStartPrice()*(100/bg.getDisCountPrecent());
		}
		else
			price=this.numDays*this.room.getStartPrice();
		return price;

	}
	


}
