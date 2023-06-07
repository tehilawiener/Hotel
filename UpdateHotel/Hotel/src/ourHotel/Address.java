package ourHotel;

public class Address {
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public int getHouseNumber() {
		return HouseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		HouseNumber = houseNumber;
	}
	private String Country;
	private String City;
	private String Street;
	private int HouseNumber;
	@Override
	public String toString() {
		return "Address: \nCountry:" + Country + " \nCity:" + City + " \nStreet:" + Street + " \nHouseNumber:" + HouseNumber+"\n";
	}
	public Address(String country, String city, String street, int houseNumber) {
		super();
		Country = country;
		City = city;
		Street = street;
		HouseNumber = houseNumber;
	}
	

}
