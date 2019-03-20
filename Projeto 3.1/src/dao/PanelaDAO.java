package dao;

import java.util.List;

import javax.persistence.EntityManager;

import projeto3.1.util.HibernateUtil;

import Panela;


public class PanelaDAO {

	EntityManager entityManager = HibernateUtil.getEntityManager();
	
	public List<Panela> findAll() {
		return entityManager.createQuery("select distinct d from Panela d left join d.panelas", Panela.class).getResultList();
	}

}