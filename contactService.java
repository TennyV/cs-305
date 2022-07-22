package Contact;
import java.util.ArrayList;
import java.util.UUID;
import java.util.List;



public class contactService {
	
	

	public static UUID uniqueID;
		
	private List<Contact> contactList = new ArrayList<>();
	
	private void addContact(Contact contact) {
		contactList.add(contact);
}
	
	private void removeContactbyID(String contactID) {
		for(Contact contact: contactList) {
			if(contact.getContactID().equals(contactID))
			contactList.remove(contact);
		}
		showContactList();
}

	private void showContactList() {
	for(Contact contact: contactList ) {
		System.out.println(contact.getContactID() + " " + contact.getFirstName());
	}
	}
	private void updateContactFieldbyID(String contactID) {
		for(Contact contact: contactList) {
			if(contact.getContactID().equals(contactID)) {
				
				System.out.println("Update Contact Fields");
			contactList.remove(contact);
			Contact contact1 = new Contact("9874565278","Johnny","Rockets","4565213521","2513 Paupauwela St");
			contactList.add(contact1);
			}
			
		}
		
	}
	public static void main(String[] args) {
		contactService contact = new contactService();
		
		Contact contact1 = new Contact("1234567891", "Siriwat", "Tenny", "1867530922", "8910 MerryWood");
		Contact contact2 = new Contact("9876543215", "Sawywer", "Stallone", "8887879879","5085 Tiguex");
		
		
		contact.addContact(contact1);
		contact.addContact(contact2);
		
		contact.showContactList();
		
		contact.removeContactbyID("1234567891");
		
		contact.updateContactFieldbyID("9876543215");
	}
}
