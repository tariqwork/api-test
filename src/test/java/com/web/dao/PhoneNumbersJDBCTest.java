package com.web.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.web.dao.PhoneNumbersJDBC;

/**
 * Unit test class for PhoneNumbersJDBC class.
 * 
 * @author Muhammad Tariq
 *
 */
public class PhoneNumbersJDBCTest{
	
	private PhoneNumbersJDBC objJDBC = new PhoneNumbersJDBC();
	
	@Test
	public void testGetAllPhoneNumbers() {
		assertEquals(7, objJDBC.getAllPhoneNumbers().getResults().size());
	}
	
	@Test
	public void getCustomerPhoneNumbers() {
		assertEquals(3, objJDBC.getCustomerPhoneNumbers(101).getResults().size());
		assertEquals(2, objJDBC.getCustomerPhoneNumbers(102).getResults().size());
		assertEquals(1, objJDBC.getCustomerPhoneNumbers(103).getResults().size());
		assertEquals(1, objJDBC.getCustomerPhoneNumbers(104).getResults().size());
		
		assertEquals(0, objJDBC.getCustomerPhoneNumbers(105).getResults().size());
	}
	
	@Test
	public void activatePhoneNumber() {
		assertTrue(objJDBC.activatePhoneNumber("01611235557").getResults().get(0).get("Activate").toString(),true);
		assertFalse(objJDBC.activatePhoneNumber("016112399999").getResults().get(0).get("Activate").toString(),false);
		
		assertEquals(0,objJDBC.activatePhoneNumber("0160000000000").getResults().size());
	}
}
