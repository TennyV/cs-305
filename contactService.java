package Contact;
import java.util.ArrayList;
import java.util.UUID;



public class contactService {
	
	static String uniqueID;
	public String firstName;
	
	
	static ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public contactService() {
		
		UUID uuid = UUID.randomUUID();
		String uuidAsString = uuid.toString().substring(0, Math.min(uuidAsString.length(),10));
			if (contactList.isEmpty()) {
				uniqueID = uuidAsString;
			}
			
	else {
		int arraySize = contactList.size();
		uniqueID = contactList.get(arraySize-1).getContactID();
	}
	return;
	}  //creation of contact object and adding to the arraylist
	public static void addContact(String firstName, String lastName, String phone, String address) {
		Contact contact1 = new Contact(uniqueID, firstName, lastName, phone, address);
		contactList.add(contact1);
	}
	
	// testing purposes
	public static void addContact(Contact newContact) {
		for (int i = 0; i < contactList.size();i++) {
			if(newContact.equals(contactList.get(i).getContactID())) {
				throw new IllegalArgumentException("Contact ID must be unique");
			}
		}
		contactList.add(newContact);
	}
	public static void updateFirstName(String uniqueID, String firstName) {
		for (int i = 0; i < contactList.size();i++) {
			if(uniqueID.compareTo(contactList.get(i).getContactID())==0) {
				contactList.get(i).getFirstName(firstName);
			}
		}
		}
	public static void updateLastName(String uniqueID, String lastName) {
				for (int i = 0; i < contactList.size();i++) {
					if(uniqueID.compareTo(contactList.get(i).getContactID())==0) {
						contactList.get(i).getLastName(lastName);
		}
	}
	}
}

