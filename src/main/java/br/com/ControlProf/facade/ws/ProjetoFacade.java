package br.com.ControlProf.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.ControlProf.dao.ProjetoDao;
import br.com.ControlProf.domain.Projeto;


/* To debug
 * http://localhost:8080/ControlProf/ws/Projeto?wsdl
 */

@WebService(serviceName="ws/Projeto")
public class ProjetoFacade {
	

	@Inject
	private ProjetoDao ProjetoDao;
	
	/* CRUD METHODS */
	
	@WebMethod
	public void wsCreateProjeto(@WebParam(name="Projeto") Projeto rs) {
		ProjetoDao.createProjeto(rs);
		
	}
	
	@WebMethod
	public List<Projeto> wsReadProjetos() {
		List<Projeto> Projetoes = ProjetoDao.readProjetos();
		for (Projeto a: Projetoes) {
			a.setColaboradores(null);
			a.getTipoProjeto().setTiposProjetos(null);
		}
		return Projetoes;
		
	}	
	
	@WebMethod
	public Projeto wsReadProjetoById(@WebParam(name="codProjeto") Integer id) {
		Projeto a = ProjetoDao.readProjetoById(id);
		if (a != null) {
			a.setColaboradores(null);
			a.getTipoProjeto().setTiposProjetos(null);
		}
		return a;
		
	}
	
	@WebMethod
	public void wsUpdateProjeto(@WebParam(name="Projeto") Projeto rs) {
		ProjetoDao.updateProjeto(rs);
		
	}
	
	@WebMethod
	public void wsDeleteProjeto(@WebParam(name="codProjeto") Integer id) {
		ProjetoDao.deleteProjeto(id);
		
	}
	
}
