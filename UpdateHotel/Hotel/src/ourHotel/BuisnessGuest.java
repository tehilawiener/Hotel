package ourHotel;

import java.io.Serializable;

//v
public class BuisnessGuest extends Guest implements Serializable {

	
	public static double getDisCountPrecent() {
		return DisCountPrecent;
	}
	public static void setDisCountPrecent(double disCountPrecent) {
		DisCountPrecent = disCountPrecent;
	}
	
	
	private int BuisnessGuestCode=0; 
	private static double DisCountPrecent;
	
	public BuisnessGuest(Person person, int numVisit) {
		super(person, numVisit);
		BuisnessGuestCode ++;
	}
	@Override
	public String toString() {
		return "BuisnessGuest: \nBuisnessGuestCode:" + BuisnessGuestCode + " \nperson:" + getPerson()
				+ " \nNumVisit()=" + getNumVisit() + "\nDisCountPrecent:"+DisCountPrecent+"\n";
	}
	
	

}
