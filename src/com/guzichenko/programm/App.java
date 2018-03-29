package com.guzichenko.programm;

import java.io.IOException;

import com.guzichenko.programm.services.impl.ContactServiceImpl;
import com.guzichenko.programm.veiw.CmdLineService;
import com.guzichenko.programm.veiw.imlp.CmdLineServiceImpl;

public class App {

	public static void main(String[] args) throws IOException {
		CmdLineService cmd = new CmdLineServiceImpl(new ContactServiceImpl());
		cmd.runMenu();
	}
}
