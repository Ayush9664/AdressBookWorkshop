package bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook {
public static void main(String[] args) {
	AddressBook addressbook=new AddressBook();
	addressbook.createConatct();
}
public void createConatct() {
	Contacts contacts=new Contacts();
	contacts.setFirstname("Ayush");
	contacts.setLastname("sharma");
	contacts.setAddress("e-12 pratap nagar");
	contacts.setCity("Jaipur");
	contacts.setState("Rajasthan");
	contacts.setZip(302016);
	contacts.setPhonenumber(966419996);
	contacts.setEmail("as8985719@gmail.com");
}
}