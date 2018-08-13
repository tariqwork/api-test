package com.web.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Class contain test data of phone numbers
 * 
 * @author Muhammad Tariq
 *
 */
public class PhoneNumbersTestData {

	private List<Map<String, Object>> phoneNumberTestData;

	public List<Map<String, Object>> getPhoneNumberTestData() {
		return phoneNumberTestData;
	}

	public void setPhoneNumberTestData(List<Map<String, Object>> PhoneNumberTestData) {
		this.phoneNumberTestData = PhoneNumberTestData;
	}

	public PhoneNumbersTestData() {
		phoneNumberTestData = new ArrayList<Map<String, Object>>();

		Map<String, Object> entry = new LinkedHashMap<String, Object>();
		entry.put("CustomerID", 101);
		entry.put("Phone_Number", "01611235557");
		entry.put("Activate", false);
		phoneNumberTestData.add(entry);

		entry = new LinkedHashMap<String, Object>();
		entry.put("CustomerID", 101);
		entry.put("Phone_Number", "01611235558");
		entry.put("Activate", false);
		phoneNumberTestData.add(entry);

		entry = new LinkedHashMap<String, Object>();
		entry.put("CustomerID", 101);
		entry.put("Phone_Number", "01611235559");
		entry.put("Activate", false);
		phoneNumberTestData.add(entry);

		entry = new LinkedHashMap<String, Object>();
		entry.put("CustomerID", 102);
		entry.put("Phone_Number", "01611237777");
		entry.put("Activate", false);
		phoneNumberTestData.add(entry);

		entry = new LinkedHashMap<String, Object>();
		entry.put("CustomerID", 102);
		entry.put("Phone_Number", "01611237778");
		entry.put("Activate", false);
		phoneNumberTestData.add(entry);

		entry = new LinkedHashMap<String, Object>();
		entry.put("CustomerID", 103);
		entry.put("Phone_Number", "01611238888");
		entry.put("Activate", false);
		phoneNumberTestData.add(entry);

		entry = new LinkedHashMap<String, Object>();
		entry.put("CustomerID", 104);
		entry.put("Phone_Number", "016112399999");
		entry.put("Activate", true);
		phoneNumberTestData.add(entry);
	}

}
