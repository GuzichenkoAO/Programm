package com.guzichenko.programm.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.guzichenko.programm.model.Contact;
import com.guzichenko.programm.services.ContactService;

public class ContactServiceImpl implements ContactService {

	private List<Contact> contactList = new ArrayList<>();

	@Override
	public void createContact(String name, int age) {
		this.contactList.add(new Contact(name, age));

		for (Contact contact : this.contactList) {
			System.out.println(contact);
		}

	}

	@Override
	public void deleteContact() {

	}
}
