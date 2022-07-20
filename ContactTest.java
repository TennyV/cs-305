package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("8675309", "Michael", "Shultz", "1567321321","8910 MerryWood Drive");
		assertTrue(contact.getContactID().equals("8675309"));
		assertTrue(contact.getFirstName().equals("Michael"));
		assertTrue(contact.getLastName().equals("Shultz"));
		assertTrue(contact.getPhone().equals("1567321321"));
		assertTrue(contact.getAddress().equals("8910 MerryWood Drive"));
		
	}
	
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("21088209471", "Michael", "Shultz", "1567321321","8910 MerryWood Drive, Universal City, TX 78148");
		}); 
	}
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("21088209471", "MichaelShultz", "Shultz", "1567321321","8910 MerryWood Drive, Universal City, TX 78148");
		}); 
	}
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("21088209471", "Michael", "MichaelShultz", "1567321321","8910 MerryWood Drive, Universal City, TX 78148");
		}); 
	}
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("21088209471", "12345", "Shultz", "15673213211","8910 MerryWood Drive, Universal City, TX 78148");
		}); 
	}
	@Test
	void testContactPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("21088209471", "12345", "Shultz", "1","8910 MerryWood Drive, Universal City, TX 78148");
		}); 
	}
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("21088209471", "12345", "Shultz", "1567321321","8910 MerryWood Drive, Universal City, TX 78148");
		}); 
	}
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("", "Michael", "Shultz", "1567321321","8910 MerryWood Drive, Universal City, TX 78148");
		}); 
	}
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("2108820947", "", "Shultz", "1567321321","8910 MerryWood Drive, Universal City, TX 78148");
		}); 
	}
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("21088209471", "Michael", "", "1567321321","8910 MerryWood Drive, Universal City, TX 78148");
		}); 
	}
	@Test
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("21088209471", "12345", "Shultz", "","8910 MerryWood Drive, Universal City, TX 78148");
		}); 
	}
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("21088209471", "12345", "Shultz", "1567321321","");
		}); 
	}

}
