package com.guzichenko.programm.veiw.imlp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.guzichenko.programm.services.ContactService;
import com.guzichenko.programm.veiw.CmdLineService;

public class CmdLineServiceImpl implements CmdLineService {

	private ContactService contactService;
	private BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

	public CmdLineServiceImpl(ContactService contactService) {
		this.contactService = contactService;
	}

	@Override
	public void runMenu() throws IOException {
		boolean isRunning = true;
		while (isRunning) {
			showMenu();
			String line = br.readLine();
			switch (line) {
				case "1": {
					createContact();
					break;
				}
				case "2": {
					deleteContact();
					break;
				}
				case "0": {
					isRunning = false;
					break;
				}
				default:
					System.out.println("Repeat");
			}
		}
	}

	private static void showMenu() {
		System.out.println("1. Create Contact");
		System.out.println("2. Delete Contact");
		System.out.println("0. Exit");
	}

	private void createContact() throws IOException {
		System.out.println("Enter name");
		String name = br.readLine();
		System.out.println("Enter age");
		int age = Integer.parseInt(br.readLine());
		this.contactService.createContact(name, age);
	}

	private void deleteContact() {
		System.out.println("Delete Contact");
	}
}
