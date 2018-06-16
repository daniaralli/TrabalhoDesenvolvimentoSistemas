package br.com.ControlProf.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.ControlProf.dao.ColaboradorDao;
import br.com.ControlProf.domain.Colaborador;



/* To debug
 * http://localhost:8080/ControlProf/ws/Colaborador?wsdl
 */

@WebService(serviceName="ws/Colaborador")
public class ColaboradorFacade {
	

	@Inject
	private ColaboradorDao ColaboradorDao;
	
	/* CRUD METHODS */
	
	@WebMethod
	public void wsCreateColaborador(@WebParam(name="Colaborador") Colaborador rs) {
		ColaboradorDao.createColaborador(rs);
		
	}
	
	@WebMethod
	public List<Colaborador> wsReadColaboradors() {
		List<Colaborador> Colaboradores = ColaboradorDao.readColaboradors();
		for (Colaborador a: Colaboradores) {
			a.setProjetos(null);
		}
		return Colaboradores;
		
	}	
	
	@WebMethod
	public Colaborador wsReadColaboradorById(@WebParam(name="codColaborador") Integer id) {
		Colaborador a = ColaboradorDao.readColaboradorById(id);
		if (a != null) {
			a.setProjetos(null);
		}
		return a;
		
	}
	
	@WebMethod
	public void wsUpdateColaborador(@WebParam(name="Colaborador") Colaborador rs) {
		ColaboradorDao.updateColaborador(rs);
		
	}
	
	@WebMethod
	public void wsDeleteColaborador(@WebParam(name="codColaborador") Integer id) {
		ColaboradorDao.deleteColaborador(id);
		
	}

}
