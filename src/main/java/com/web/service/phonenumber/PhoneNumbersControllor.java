package com.web.service.phonenumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.dao.PhoneNumbersDao;
import com.web.dto.PhoneNumbersData;


/**
 * Rest Controller of Spring Boot for phone number page.
 * Responsible for all requests, which comes from phone number page.
 * 
 * @author Muhammad Tariq
 *
 */
@RestController
@RequestMapping("api/")
public class PhoneNumbersControllor {

	@Autowired
	private PhoneNumbersDao phoneNumbersDao;

	
	@GetMapping("/test")
	public void test() {
		System.out.println("TEST");
	}
	
	@GetMapping("/allPhoneNumbers")
	public PhoneNumbersData getAllPhoneNumbers() {
		return phoneNumbersDao.getAllPhoneNumbers();
	}

	@GetMapping("/cutomerPhoneNumbers/{customerId}")
	public PhoneNumbersData getCustomerPhoneNumbers(@PathVariable int customerId) {
		return phoneNumbersDao.getCustomerPhoneNumbers(customerId);
	}

	@PostMapping("/activatePhoneNumber/{phoneNumber}")
	public PhoneNumbersData activatePhoneNumber(@PathVariable String phoneNumber) {
		return phoneNumbersDao.activatePhoneNumber(phoneNumber);
	}

}
