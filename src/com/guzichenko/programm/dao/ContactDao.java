package com.guzichenko.programm.dao;

import java.io.IOException;

import com.guzichenko.programm.model.Contact;

public interface ContactDao {

	void saveContact(Contact contact);

	void removeContact();

	void showAll();
}
