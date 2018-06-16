package br.com.ControlProf.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.ControlProf.domain.Colaborador;

public class ColaboradorDao {

	
	@PersistenceContext(name="ControlProfPU")
	private EntityManager entityManager;
	
	/* CRUD METHODS */
	
	@Transactional
	public void createColaborador(Colaborador at) {
		entityManager.persist(at);
		
	}
	
	@Transactional
	public void updateColaborador(Colaborador at) {
		at = entityManager.merge(at);
		entityManager.persist(at);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Colaborador> readColaboradors() {
		Query query = entityManager.createQuery("from Colaborador a");
		return query.getResultList();
		
	}
	
	public Colaborador readColaboradorById(Integer id) {
		return entityManager.find(Colaborador.class,id);
		
	}
	
	@Transactional
	public void deleteColaborador(Integer id) {
		Colaborador rs = readColaboradorById(id);
		entityManager.remove(rs);
		
	}
	
}
