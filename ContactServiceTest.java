package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService services = new ContactService();
		Contact contact = new Contact("123456789", "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
		
		services.addContact(contact);
		assertNotNull(services.checkContact("123456789"));//checks not empty should be added
	}
	
	@Test
	void testDeleteContact() {
		ContactService services = new ContactService();	//object to grab from other page
		Contact contact = new Contact("123456789", "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");	//object has data ready to be added to database
		services.addContact(contact);	//added data
		assertNotNull(services.checkContact("123456789"));//checks not empty should be added
		services.deleteContact("123456789");	//deletes data by id
		assertNull(services.checkContact("123456789"));//should be empty aka not exsist
	}
	
	@Test
	void testDeleteContactIdUnkown() {
		ContactService services = new ContactService();	//object to grab from other page
		Contact contact = new Contact("123456789", "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");	//object has data ready to be added to database
		services.addContact(contact);	//added data
		assertThrows(IllegalArgumentException.class, () -> {
			services.deleteContact("468789");	//cant find id
		});
	}
	
	@Test
	void testUpdateContact() {
		ContactService services = new ContactService();	//object to grab from other page
		Contact contact = new Contact("123456789", "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");	//object has data ready to be added to database
		services.addContact(contact);	//added data
		assertNotNull(services.checkContact("123456789"));//checks not empty should be added
		services.updateContact("123456789", "Ally", "Gutierrez", "9454561234", "564 Cherry Lane");	//updated name
		assertEquals("Ally", contact.getFirstName());	//check if name is updated or the same passed
	}
	
	@Test
	void testUpdateContactNull() {
		ContactService services = new ContactService();	//object to grab from other page
		Contact contact = new Contact("123456789", "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");	//object has data ready to be added to database
		services.addContact(contact);	//added data
		assertThrows(IllegalArgumentException.class, () -> {
			services.updateContact("12349", "Ally", "Gutierrez", "9454561234", "564 Cherry Lane");	//updated name
		});
	}
	
	@Test
	void testDuplicateContactId() {
	    ContactService services = new ContactService();
	    Contact contact1 = new Contact("123456789", "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
	    Contact contact2 = new Contact("123456789", "Ally", "Smith", "5555555555", "123 Main St");
	    services.addContact(contact1);
	    assertThrows(IllegalArgumentException.class, () -> {
	        services.addContact(contact2);
	    });
	}
	
	
	
}
