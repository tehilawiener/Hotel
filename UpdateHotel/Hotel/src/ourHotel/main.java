package ourHotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {

	public static void main(String[] args) {
		LocalDate currentDate =LocalDate.now(); 
		//person
		Person p1=new Person(325565273,"edrftgyh","029932586");
		Person p2=new Person(315166695,"yael","0527656069");
		Person p3=new Person(325565273,"tehila","052765608");
		Person p4=new Person(123456,"renana","052765608");
		//order
		Order o1=new Order(new Guest(p1,5), new Room(122, 40, 5, false, 2500), currentDate, 3);
		Order o2=new Order(new Guest(p2, 2), new Room(965, 651, 5, true, 2500), currentDate, 6);
		Order o3=new Order(new Guest(p2, 2), new Room(6853, 40, 5, true, 1500), currentDate, 5);
		
		
		
		
		//guest list
		List<Guest> GL=new ArrayList<Guest>();
				GL.add(new Guest(p1, 2));
				GL.add(new Guest(p2, 3));
				GL.add(new Guest(p3, 2));
				
		
				//order list
				List<Order>orderList=new ArrayList<Order>(); 
				orderList.add(o1);
				orderList.add(o2);
				orderList.add(o3); 
			//	System.out.println(orderList.get(1));
//				ListGuest ggg=new ListGuest(orderList);
				
			
				
				
				ListRoom rrr=new ListRoom();
				rrr.addRoom(new Room(45,54,2500,false,652.3));
				rrr.addRoom(new Room(741,54,2500,false,652.3));
				rrr.addRoom(new Room(999,54,2500,true,652.3));
				
				
				
				
				Guest g1=new Guest(p2, 2);
				Guest g2=new Guest(p3, 20);
				Guest g4=new Guest(p4, 23);
				Guest g5=new Guest(new Person(12, "mmmm", "054845454"), 45);
		ListGuest l=new ListGuest(orderList);
		l.addGuest(g1);
		l.addGuest(g2);
		l.addGuest(g4);
	//	System.out.println(l);
	//	l.deleteGuess(g4);
		//l.guestsReport();
		
		
		ListOrder lr=new ListOrder(rrr,l);
		lr.addOrder(g1, 45, 10);
		lr.addOrder(g2,741, 4);
		lr.addOrder(g4, 999, 3);
		System.out.println("------------before------------");
		System.out.println(lr);
	
		lr.deleteOrder(325565273);
		lr.addOrder(g5,45, 10);
		//System.out.println("t6retdtytrytdh"+l);
		System.out.println("------------after------------");
		System.out.println(lr);
		
////		System.out.println(l);
////		System.out.println("good"+l.findByPhone("052765608"));;
////		System.out.println("_______________");
////		l.printGuestByID(325565273);
////		System.out.println("_______________");
////		l.printGuestByName("yael");
//		//6666//
////		System.out.println(l.findByPhone("052765608"));
////		System.out.println("----------");
////		System.out.println("heyyyyyyy"+GL);
////	l.deleteGuess(new Guest(p3, 1));
////	System.out.println("heyyyyyyy2"+GL);
	

	}

}
