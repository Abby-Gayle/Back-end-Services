package contact;

public class Contact {
	
	private final String CONTACT_ID;	//holds contact_id and it can't be changed
	
	//holds name phone number and address
	private String firstName, lastName, phoneNumber, address;
	
	/*
	 * Constructor to create contact ID, name, phone number, and address
	 */
	public Contact(String contact_ID, String firstName, String lastName, String phoneNumber, String address) {
		//Makes sure contact id is not null or more then 10 length
		if	(contact_ID == null || contact_ID.length() > 10) {
			throw new IllegalArgumentException("Error: Invalid Contact ID");
		}
		//Makes sure first name isn't too long
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Error: Invalid first name");
		}
		//Makes sure last name isn't too long
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Error: Invalid last name");
		}
		//Makes sure phone number isn't too long
		if(phoneNumber == null || phoneNumber.length() > 10 || phoneNumber.length() < 10 ) {
			throw new IllegalArgumentException("Error: Invalid Phone Number");
		}
		//Makes sure address isn't too long
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Error: Invalid Address");
		}
		
		//saves the variable in contractor to variable outside
		this.CONTACT_ID = contact_ID;	//saves the contact_ID into the CONTACT_ID
		this.firstName = firstName;		//saves the firstName into firstName
		this.lastName = lastName;		//saves the lastName into lastName
		this.phoneNumber = phoneNumber;	//saves the phoneNumber into phoneNumber
		this.address = address;			//saves the address into address
	}
	
	/*
	 *	Sets the first name to the private first name 
	 */
	public void setFirstName(String firstName) {
		//Makes sure first name isn't too long
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Error: Invalid first name");
		}
		this.firstName = firstName;
	}
	
	/*
	 *	Sets the last name to the private last name 
	 */
	public void setLastName(String lastName) {
		//Makes sure last name isn't too long
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Error: Invalid last name");
		}
		this.lastName = lastName;
	}
	
	/*
	 *	Sets the phone number to the private phone number 
	 */
	public void setPhoneNumber(String phoneNumber) {
		//Makes sure phone number isn't too long
		if(phoneNumber == null || phoneNumber.length() > 10 || phoneNumber.length() < 10) {
			throw new IllegalArgumentException("Error: Invalid Phone Number");
		}
		this.phoneNumber = phoneNumber;
	}
	
	/*
	 *	Sets the address to the private address
	 */
	public void setAddress(String address) {
		//Makes sure address isn't too long
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Error: Invalid Address");
		}
		this.address = address;
	}
	
	/*
	 * Method: Getter this helps grab the private first name 
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/*
	 * Method: Getter this helps grab the private last name 
	 */
	public String getLastName() {
		return lastName;
	}
	
	/*
	 * Method: Getter this helps grab the private phone number 
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/*
	 * Method: Getter this helps grab the private address 
	 */
	public String getAddress() {
		return address;
	}
	
	/*
	 * Method: Getter this helps grab the contact ID 
	 */
	public String getContactId() {
		return CONTACT_ID;
	}

	
}
