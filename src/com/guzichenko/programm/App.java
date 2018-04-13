package com.guzichenko.programm;

import java.io.IOException;

import com.guzichenko.programm.dao.ContactDao;
import com.guzichenko.programm.dao.impl.FileSystemContactDaoImpl;
import com.guzichenko.programm.services.ContactService;
import com.guzichenko.programm.services.impl.ContactServiceImpl;
import com.guzichenko.programm.veiw.CmdLineService;
import com.guzichenko.programm.veiw.imlp.CmdLineServiceImpl;

public class App {

	public static void main(String[] args) throws IOException {
		ContactDao contactDao = new FileSystemContactDaoImpl();
		ContactService contactService = new ContactServiceImpl(contactDao);
		CmdLineService cmd = new CmdLineServiceImpl(contactService);
		cmd.runMenu();
	}
}
