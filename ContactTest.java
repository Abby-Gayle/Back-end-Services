package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void passContactTest() {
		Contact contact = new Contact("123456789", "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
		
		assertEquals("123456789", contact.getContactId());
		assertEquals("Abigail", contact.getFirstName());
		assertEquals("Gutierrez", contact.getLastName());
		assertEquals("9454561234", contact.getPhoneNumber());
		assertEquals("564 Cherry Lane", contact.getAddress());
	}
	
	@Test
	void setValidTest() {
	    Contact contact = new Contact("1234", "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
	    contact.setFirstName("Adam");
	    assertEquals("Adam", contact.getFirstName());
	    contact.setLastName("lalal");
	    assertEquals("lalal", contact.getLastName());
	    contact.setPhoneNumber("5552564894");
	    assertEquals("5552564894", contact.getPhoneNumber());
	    contact.setAddress("555 Harbor Dr");
	    assertEquals("555 Harbor Dr", contact.getAddress());
	    
	}
	
	//Too long
	@Test
	void IdTooLongTest() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	        		"123456789123",  "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane"
	        );
	    });
	}
	
	@Test
	void FNameTooLongTest() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	        		"12345", "Christianna", "Gutierrez", "9454561234", "564 Cherry Lane"
	        );
	    });
	}
	
	@Test
	void LNameTooLongTest() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	        		"123456", "Christ", "Fitzpatrick", "9454561234", "564 Cherry Lane"
	        );
	    });
	}
	
	@Test
	void PhoneTooLongTest() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	        		"1234", "Abigail", "Gutierrez", "94545456465466123412", "564 Cherry Lane"
	        );
	    });
	}
	
	@Test
	void AddressTooLongTest() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	        		"1234", "Abigail", "Gutierrez", "9454561234", "1234567890123456789012345678901123"
	        );
	    });
	}
	
	@Test
	void FNameSetTooLongTest() {
	    Contact contact = new Contact ("1234",  "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
	    assertThrows(IllegalArgumentException.class, () -> {
	       contact.setFirstName("Christianna");
	    });

	}
	
	@Test
	void LNameSetTooLongTest() {
	    Contact contact = new Contact ("1234",  "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
	    assertThrows(IllegalArgumentException.class, () -> {
	       contact.setLastName("Fitzpatrickok");
	    });

	}
	
	@Test
	void phoneSetTooLongTest() {
	    Contact contact = new Contact ("1234",  "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
	    assertThrows(IllegalArgumentException.class, () -> {
	       contact.setPhoneNumber("1234567890123456789012345678901123");
	    });

	}
	
	@Test
	void addressSetTooLongTest() {
	    Contact contact = new Contact ("1234",  "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
	    assertThrows(IllegalArgumentException.class, () -> {
	       contact.setAddress("1234567890123456789012345678901123");
	    });

	}
	
	//nulls
	@Test
	void idNullTest(){
		assertThrows(IllegalArgumentException.class,()->{
			new Contact(
					null, "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
		});
	}
	
	@Test
	void firstNameNullTest(){
		assertThrows(IllegalArgumentException.class,()->{
			new Contact(
					"123", null, "Gutierrez", "9454561234", "564 Cherry Lane");
		});
	}

	@Test
	void LNameNullTest(){
		assertThrows(IllegalArgumentException.class,()->{
			new Contact(
					"123", "Abigail", null, "9454561234", "564 Cherry Lane");
		});
	}
	
	@Test
	void phoneNullTest(){
		assertThrows(IllegalArgumentException.class,()->{
			new Contact(
					"123", "Abigail", "Gutierrez", null, "564 Cherry Lane");
		});
	}
	
	@Test
	void addressNullTest(){
		assertThrows(IllegalArgumentException.class,()->{
			new Contact(
					"123", "Abigail", "Gutierrez", "9454561234", null);
		});
	}
	
	@Test
	void FNameSetNullTest(){
	    Contact contact = new Contact ("1234",  "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
	    assertThrows(IllegalArgumentException.class, () -> {
	       contact.setFirstName(null);
	    });
	}
	
	@Test
	void LNameSetNullTest(){
	    Contact contact = new Contact ("1234",  "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
	    assertThrows(IllegalArgumentException.class, () -> {
	       contact.setLastName(null);
	    });
	}

	@Test
	void phoneSetNullTest(){
	    Contact contact = new Contact ("1234",  "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
	    assertThrows(IllegalArgumentException.class, () -> {
	       contact.setPhoneNumber(null);
	    });
	}
	
	@Test
	void addressSetNullTest(){
	    Contact contact = new Contact ("1234",  "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");
	    assertThrows(IllegalArgumentException.class, () -> {
	       contact.setAddress(null);
	    });
	}
	
	//too short
	@Test
	void PhoneTooShortTest() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("1234", "Abigail", "Gutierrez", "12345", "564 Cherry Lane");
	    });
	}
	
	@Test
	void phoneSetTooShortTest() {
	    Contact contact = new Contact("1234", "Abigail", "Gutierrez", "9454561234", "564 Cherry Lane");

	    assertThrows(IllegalArgumentException.class, () -> {
	       contact.setPhoneNumber("12345");
	    });
	}

}//end method tests