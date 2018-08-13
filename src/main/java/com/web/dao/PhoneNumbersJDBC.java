package com.web.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.web.dto.PhoneNumbersData;

/**
 * JDBC implementation for phone numbers DAO
 * 
 * @author Muhammad Tariq
 *
 */
@Repository
public class PhoneNumbersJDBC implements PhoneNumbersDao {

	// Currently getting the test data from Test data class, but can change the code to query also from database
	PhoneNumbersTestData PhoneNumbersTestData = new PhoneNumbersTestData();

	@Override
	public PhoneNumbersData getAllPhoneNumbers() {
		PhoneNumbersData phoneNumbers = new PhoneNumbersData();
		phoneNumbers.setDescription("List of all phone numbers");
		phoneNumbers.setResults(PhoneNumbersTestData.getPhoneNumberTestData());
		return phoneNumbers;
	}

	@Override
	public PhoneNumbersData getCustomerPhoneNumbers(int customerId) {
		PhoneNumbersData phoneNumbers = new PhoneNumbersData();
		phoneNumbers.setDescription("List of all phone numbers of single customer");
		List<Map<String, Object>> customerPhoneNumbers = new ArrayList<Map<String, Object>>();

		List<Map<String, Object>> list = PhoneNumbersTestData.getPhoneNumberTestData();
		for (Map<String, Object> map : list) {
			if (map.containsValue(customerId)) {
				customerPhoneNumbers.add(map);
			}
		}

		phoneNumbers.setResults(customerPhoneNumbers);
		return phoneNumbers;
	}

	@Override
	public PhoneNumbersData activatePhoneNumber(String phoneNumber) {
		PhoneNumbersData phoneNumbers = new PhoneNumbersData();
		phoneNumbers.setDescription("Activate a phone number");
		List<Map<String, Object>> customerPhoneNumbers = new ArrayList<Map<String, Object>>();

		List<Map<String, Object>> list = PhoneNumbersTestData.getPhoneNumberTestData();
		for (Map<String, Object> map : list) {
			if (map.containsValue(phoneNumber)) {
				if (map.get("Activate").equals(false)) {
					map.replace("Activate", true);
				}
				customerPhoneNumbers.add(map);
			}
		}
		phoneNumbers.setResults(customerPhoneNumbers);
		return phoneNumbers;
	}
}
