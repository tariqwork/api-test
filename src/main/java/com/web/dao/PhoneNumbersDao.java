package com.web.dao;

import com.web.dto.PhoneNumbersData;

/**
 * Interface for DAO, which Query the phone numbers
 * 
 * @author Muhammad Tariq
 *
 */

public interface PhoneNumbersDao {
	
	/**
	 * Returns the list of all phone numbers.
	 * @return PhoneNumbersData object
	 */
	PhoneNumbersData getAllPhoneNumbers();

	/**
	 * Returns the list of all phone numbers of a single customer
	 * @param customerId as a Int
	 * @return PhoneNumbersData object
	 */
	PhoneNumbersData getCustomerPhoneNumbers(int customerId);

	/**
	 * Activate a give phone number
	 * @param phoneNumber as String
	 * @return PhoneNumbersData object
	 */
	PhoneNumbersData activatePhoneNumber(String phoneNumber);
}
