package ourHotel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListGuest implements Serializable {
	private List<Guest> guestList;
	
	private List<Order> orderList;
	
	static String filePath = "C:guests report.txt";
	
	//BufferedWriter writer;
	File f=new File(filePath);
	FileOutputStream fos ;
	ObjectOutputStream oos; 
//	private ListOrder orderList;

	public ListGuest(List<Order> ol) {
		this.guestList = new ArrayList<Guest>();
		this.orderList=ol;
		 try {
			 // writer = new BufferedWriter(new FileWriter(filePath));
			 fos=new FileOutputStream(filePath);
			 oos= new ObjectOutputStream(fos);
			 }
		  catch(IOException e) {
			  System.out.println("path is not fount");
			  }
	}
	
	@Override
	public String toString() {
		return "ListGuest:" + guestList ;
	}

//v
	public void addGuest(Guest g1) {
		guestList.add(g1);
	}
//v
	public Optional<Guest> findByID(int id) {
		Optional<Guest> guest = guestList.stream()
				.filter(g -> g.getPerson().getId() == id)
				.findFirst();	
		return guest;
	}
//v
	public Optional<Guest> findByName(String name) {
		Optional<Guest> guest = guestList.stream()
				.filter(g -> g.getPerson().getName() == name)
				.findFirst();	
		return guest;
	}
//v
	public Optional<Guest> findByPhone(String phone) {
		Optional<Guest> guest = guestList.stream()
				.filter(g -> g.getPerson().getPhone() == phone)
				.findFirst();	
		return guest;
	}
	
	
	//delete guess
	//vvvv
	public void deleteGuess(Guest oldGuest) {
		int size=this.orderList.size();
		int i=0;
		 for(i=0;i<size && !oldGuest.equals(this.orderList.get(i).getGuest());i++);
		 if(i<size)
			 System.out.println("delete was failed, this gust has an order");
			 else
			 this.guestList.remove(oldGuest);
 
	}
	//v
	public void printGuestByID(int id) {

		Optional<Guest> guest = guestList.stream()
				.filter(g -> g.getPerson().getId() == id)
				.findFirst();	

		System.out.println(guest);
	}
//v
	public void printGuestByName(String name) {
	
		Optional<Guest> guest = guestList.stream()
				.filter(g -> g.getPerson().getName() == name)
				.findFirst();	

		System.out.println(guest);
	}
	
	
	 
	public void guestsReport() {
		
		for(int i=0;i<guestList.size();i++) {
			int j=i;
			Optional<Order> order = orderList.stream()
					.filter(o -> o.getGuest().equals(guestList.get(j)))
					.findFirst();
			
			if(order!=null) {
				try {
					//writer.write("kjk");
					 oos.writeObject(order.get().getGuest());
					System.out.println("sucsses to write");
		        //    writer.newLine(); // Writing a new line
				}
				
				 catch(IOException e) {
					 System.out.println("failed to write to field");
				 }
				}
			
				
			}
		}
		
		
	}
   

