package com.guzichenko.programm.veiw.imlp;

import com.guzichenko.programm.services.ContactService;
import com.guzichenko.programm.veiw.CmdLineService;

public class CmdLineServiceImpl implements CmdLineService {

	private ContactService contactService;

	public CmdLineServiceImpl(ContactService contactService) {
		this.contactService = contactService;
	}

	@Override
	public void showMenu() {
		System.out.println("Menu");
	}
}
