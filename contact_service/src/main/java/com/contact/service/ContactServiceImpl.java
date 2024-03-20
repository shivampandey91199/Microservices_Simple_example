package com.contact.service;

import java.util.List;	
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list = List.of(
			new Contact(1L, "shivam@Gmail.com", "Shivam", 1312L),
			new Contact(2L, "amrit@Gmail.com", "Amrit", 1313L), 
			new Contact(3L, "prince@Gmail.com", "Prince", 1314L),
			new Contact(4L, "krunal@Gmail.com", "Krunal", 1315L)
			);

	@Override
	public List<Contact> getContactOfUser(Long userId) {
   
		return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
