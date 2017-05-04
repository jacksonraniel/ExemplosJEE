package br.upe.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.upe.jdbc.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Connexão aberta");
		connection.close();

	}

}
