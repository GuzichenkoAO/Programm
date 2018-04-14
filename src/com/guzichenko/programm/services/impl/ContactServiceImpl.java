package com.guzichenko.programm.services.impl;

import com.guzichenko.programm.model.Contact;
import com.guzichenko.programm.services.ContactService;

import java.util.HashMap;
import java.util.Map;

public class ContactServiceImpl implements ContactService {

    /**
     * Реализация ContactService которая использует Map для хранения данных.
     */

    private final Map<String, Contact> contactList;


    public ContactServiceImpl() {
        this.contactList = new HashMap<>();
    }

    @Override
    public void createContact(String name, int phone) {
        contactList.put(name, new Contact(name, phone));
    }

    @Override
    public void deleteContact(String name) {
        contactList.remove(name);
    }

    @Override
    public void showContacts() {
        for (Contact contact : contactList.values()) {
            System.out.println(contact);
        }
    }

    @Override
    public void editContact(String name, String newName, int newAge) {
        Contact contact = contactList.get(name);
        contact.setName(newName);
        contact.setAge(newAge);
    }
}