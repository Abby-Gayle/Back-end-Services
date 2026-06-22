package contact;
import java.util.HashMap;
import java.util.Map;

public class ContactService {
	//HashMap for sting keys and HashMap values
	private Map<String, Contact> contacts = new HashMap<>();
	
	/*
	 *	Method: adds information to the map contacts
	 */
	public void addContact(Contact contact) {	//object contact grabs from class Contact
		
		//checks contacts ids exists
		if(contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact ID already exists");
		}
		
		contacts.put(contact.getContactId(), contact);	//adds object information to contacts map
	}
	
	/*
	 * Deletes information based on id
	 */
	public void deleteContact(String contactId) {
		
		if(!contacts.containsKey(contactId)) {				//check if the key is not in table
			throw new IllegalArgumentException("Id doesn't exist");
		}	
		contacts.remove(contactId);
	}
	
	/*
	 * Updates information based on id
	 */
	public void updateContact(String contactId, String firstName, String lastName, String number, String address) {
		//if id doesn't exists 
	    if(contacts.get(contactId) == null) {
	        throw new IllegalArgumentException("Contact ID not found");
	    }
	    //update other wise
			contacts.get(contactId).setFirstName(firstName);
			contacts.get(contactId).setLastName(lastName);
			contacts.get(contactId).setPhoneNumber(number);
			contacts.get(contactId).setAddress(address);
		
	}
	
	/*
	 * verify the data works 
	 */
	Contact checkContact(String contactId) {
		return contacts.get(contactId);
	}
}

