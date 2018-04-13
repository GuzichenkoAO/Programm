package com.guzichenko.programm.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.guzichenko.programm.dao.ContactDao;
import com.guzichenko.programm.model.Contact;

public class FileSystemContactDaoImpl implements ContactDao {

	private static final File FILE = new File("data");

	private List<Contact> list;

	public FileSystemContactDaoImpl() {
	}

	private void init(){

	}

	@Override
	public void saveContact(Contact contact) {
		try (PrintWriter writer = new PrintWriter(
				new BufferedWriter(new FileWriter(FILE)))) {
			writer.println(contact);
			writer.flush();
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeContact() {

	}

	@Override
	public void showAll() {
		try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {

			while (true) {
				String line = reader.readLine();
				if (line == null) break;
				System.out.println(line);
			}

		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
