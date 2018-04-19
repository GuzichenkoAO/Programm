package com.guzichenko.programm;

import com.guzichenko.programm.dao.ContactDao;
import com.guzichenko.programm.dao.impl.DBContactDao;
import com.guzichenko.programm.dao.impl.FileSystemContactDaoImpl;
import com.guzichenko.programm.services.ContactService;
import com.guzichenko.programm.services.impl.FSContactServiceImpl;
import com.guzichenko.programm.veiw.CmdLineService;
import com.guzichenko.programm.veiw.imlp.CmdLineServiceImpl;

import java.io.IOException;

public class App {

    /**
     * Начало программы. Тут запускается программа, создаются все сервиса и устанавливаются связи между ними.
     */

    public static void main(String[] args) throws IOException {

        ContactDao contactDao = new DBContactDao();

        ContactService contactService = new FSContactServiceImpl(contactDao);

        CmdLineService cmd = new CmdLineServiceImpl(contactService);

        cmd.runMenu();
    }
}
