package com.fiap.smarticities.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.fiap.smarticities.dao.ClienteDAO;
import com.fiap.smarticities.entity.Cliente;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("smartcities-dao").createEntityManager();

		ClienteDAO clienteDao = new ClienteDAO(em);

		Cliente cliente = new Cliente();
		cliente.setNome("cadu");
		clienteDao.atualizar(cliente);

		try {
			clienteDao.commit(em);
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<Cliente> listaCliente = clienteDao.listar();
		for (Cliente cliente1 : listaCliente) {
			System.out.println(cliente1.getId() + " " + cliente1.getNome());
		}

	}

}
