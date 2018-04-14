package com.guzichenko.programm.services.impl;

import com.guzichenko.programm.dao.ContactDao;
import com.guzichenko.programm.model.Contact;
import com.guzichenko.programm.services.ContactService;

public class FSContactServiceImpl implements ContactService {

    /**
     * Реализация ContactService которая использует Файловую Систему для хранения данных.
     */

    private final ContactDao contactDao;

    public FSContactServiceImpl(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    @Override
    public void createContact(String name, int phone) {
        contactDao.saveContact(new Contact(name, phone));
    }

    @Override
    public void deleteContact(String name) {
//		this.contactList.remove(name);
    }

    @Override
    public void showContacts() {
        contactDao.showAll();
//		for (Contact contact : this.contactList.values()) {
//			System.out.println(contact);
//		}
    }

    public void editContact(String name, String newName, int newAge) {
//		Contact contact = this.contactList.get(name);
//		contact.setName(newName);
//		contact.setAge(newAge);
    }

}
