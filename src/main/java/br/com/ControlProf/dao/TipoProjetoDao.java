package br.com.ControlProf.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.ControlProf.domain.TipoProjeto;

public class TipoProjetoDao {

	
	@PersistenceContext(name="ControlProfPU")
	private EntityManager entityManager;
	
	/* CRUD METHODS */
	
	@Transactional
	public void createTipoProjeto(TipoProjeto at) {
		entityManager.persist(at);
		
	}
	
	@Transactional
	public void updateTipoProjeto(TipoProjeto at) {
		at = entityManager.merge(at);
		entityManager.persist(at);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoProjeto> readTipoProjetos() {
		Query query = entityManager.createQuery("from TipoProjeto a");
		return query.getResultList();
		
	}
	
	public TipoProjeto readTipoProjetoById(Integer id) {
		return entityManager.find(TipoProjeto.class,id);
		
	}
	
	@Transactional
	public void deleteTipoProjeto(Integer id) {
		TipoProjeto rs = readTipoProjetoById(id);
		entityManager.remove(rs);
		
	}
	
}
