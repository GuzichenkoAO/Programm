package com.guzichenko.programm.services.impl;

import java.util.HashMap;
import java.util.Map;

import com.guzichenko.programm.model.Contact;
import com.guzichenko.programm.services.ContactService;

public class ContactServiceImpl implements ContactService {

	private Map<String, Contact> contactList = new HashMap<>();

	@Override
	public void createContact(String name, int phone) {
		this.contactList.put(name, new Contact(name, phone));
	}

	@Override
	public void deleteContact(String name) {
		this.contactList.remove(name);
	}

	@Override
	public void showContacts() {
		for (Contact contact : this.contactList.values()) {
			System.out.println(contact);
		}
	}

	public void editContact(String name, String newName, int newAge) {
		Contact contact = this.contactList.get(name);
		contact.setName(newName);
		contact.setAge(newAge);
	}
}