package com.fiap.smarticities.dao;

import javax.persistence.EntityManager;

import com.fiap.smarticities.entity.Estabelecimento;

public class EstabelecimentoDAO extends GenericDAO<Estabelecimento, Integer>{

	public EstabelecimentoDAO(EntityManager em) {
		super(em);
	}
	
	
}
