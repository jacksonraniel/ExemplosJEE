package br.upe.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try{
			Class.forName("com.mysql.jdbc.Driver");//Para quando o Java não consegue encontrar o driver sozinho
			return DriverManager.getConnection("jdbc:mysql://localhost/crudContatos", "root", "root");
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException();
		}
	}

}
