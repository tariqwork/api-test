package com.web.dto;

import java.util.List;
import java.util.Map;

/**
 * This class contains data and meta information about phone numbers.
 * It relates to the data object in the Google JSON Style Guide.
 * 
 * @author Muhammad Tariq
 *
 */
public class PhoneNumbersData {
	/**
	 * Description of the response
	 */
	private String description;
	
	/**
	 * List of resulted phone numbers
	 */
	private List<Map<String,Object>> results;

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Map<String, Object>> getResults() {
		return results;
	}

	public void setResults(List<Map<String, Object>> results) {
		this.results = results;
	}
}
