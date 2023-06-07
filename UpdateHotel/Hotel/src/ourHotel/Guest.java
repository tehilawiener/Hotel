package ourHotel;
import java.io.Serializable;
//v
import java.util.Objects;

public class Guest implements Serializable{
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getNumVisit() {
		return NumVisit;
	}
	public void setNumVisit(int numVisit) {
		NumVisit = numVisit;
	}
	
	
	public Guest(Person person, int numVisit) {
		this.person = person;
		NumVisit = numVisit;
	}


	private Person person;
	private int NumVisit;
	
	@Override
	public String toString() {
		return "\nperson:" + person + " \nNumVisit:" + NumVisit + "\n\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(person);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guest other = (Guest) obj;
		return Objects.equals(person, other.person);
	}
	
	
}
	
	


