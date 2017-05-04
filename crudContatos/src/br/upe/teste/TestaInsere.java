package br.upe.teste;

import java.util.Calendar;

import br.upe.jdbc.dao.ContatoDAO;
import br.upe.jdbc.modelo.Contato;


public class TestaInsere {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("rua x");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO dao = new ContatoDAO();
		
		dao.adiciona(contato);
		System.out.println("Gravado!");

	}

}
