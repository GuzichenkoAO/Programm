package com.guzichenko.programm.services;

public interface ContactService {

	void createContact(String name, int phone);
	void deleteContact(String name);
	void showContacts();
	void editContact(String oldName, String newName, int newAge);

}
