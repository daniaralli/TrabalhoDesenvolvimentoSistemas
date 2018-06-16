package br.com.ControlProf.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.ControlProf.domain.Projeto;

public class ProjetoDao {

	
	@PersistenceContext(name="ControlProfPU")
	private EntityManager entityManager;
	
	/* CRUD METHODS */
	
	@Transactional
	public void createProjeto(Projeto at) {
		entityManager.persist(at);
		
	}
	
	@Transactional
	public void updateProjeto(Projeto at) {
		at = entityManager.merge(at);
		entityManager.persist(at);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Projeto> readProjetos() {
		Query query = entityManager.createQuery("from Projeto a");
		return query.getResultList();
		
	}
	
	public Projeto readProjetoById(Integer id) {
		return entityManager.find(Projeto.class,id);
		
	}
	
	@Transactional
	public void deleteProjeto(Integer id) {
		Projeto rs = readProjetoById(id);
		entityManager.remove(rs);
		
	}
	
}
