package com.guzichenko.programm.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.guzichenko.programm.dao.ContactDao;
import com.guzichenko.programm.model.Contact;

public class DBContactDao implements ContactDao {

	private static final String DB_URL = "jdbc:h2:tcp://localhost/~/Program";
	private static final String USER = "Test";
	private static final String PASSWORD = "";

	public DBContactDao(){
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Can't connect to DB");
		}
		try (Connection connection = DriverManager
				.getConnection(DB_URL, "Test", "");
		Statement st = connection.createStatement()){
			st.execute("CREATE TABLE CLIENT(ID INT AUTO_INCREMENT PRIMARY KEY, NAME VARCHAR(255), AGE INT);");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void saveContact(Contact contact) {
		try (Connection connection = DriverManager
				.getConnection(DB_URL, "Test", "");
				PreparedStatement st =
						connection.prepareStatement("INSERT INTO CLIENT(NAME, AGE) VALUES(?, ?);")){

			st.setString(1, contact.getName());
			st.setInt(2, contact.getAge());

			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeContact() {

	}

	@Override
	public void showAll() {

	}
}
