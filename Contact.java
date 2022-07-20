package Contact;

public class Contact {

    private String contactID; // unique can't be null 
    private String firstName; // first name can't be loner than 10 digits
    private String lastName; // last name can't be longer than 10 char
    private String phone; // number must be exactly 10
    private String address; // address must be less than 30 chars not these can be null

    
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
    	
    	this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        
    if (contactID.length()>10 || contactID == null) {
            throw new IllegalArgumentException ("contactId cannot be null or longer than 10 characters");
        }

        if (firstName.length () > 10 || firstName == null) {
            throw new IllegalArgumentException ("firstName cannot be null or longer than 10 characters");
        }
        if (lastName.length () > 10 || lastName == null) {
            throw new IllegalArgumentException ("lastName cannot be null or longer than 10 characters");

        }
        if (phone == null) {
            throw new IllegalArgumentException ("phone cannot be null");

        }
        if (phone.length () > 10) {
            throw new IllegalArgumentException ("phone number has to be exactly 10 digits");
        }
        if (address.length () > 30 || address == null) {
            throw new IllegalArgumentException ("Address can't be null or over 30 characters");
        }
        
    }

    
	public String getContactID() {
        return  contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}