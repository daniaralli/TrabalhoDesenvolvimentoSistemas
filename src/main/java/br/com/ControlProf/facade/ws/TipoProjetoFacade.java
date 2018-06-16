package br.com.ControlProf.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.ControlProf.dao.TipoProjetoDao;
import br.com.ControlProf.domain.TipoProjeto;


/* To debug
 * http://localhost:8080/ControlProf/ws/TipoProjeto?wsdl
 */

@WebService(serviceName="ws/TipoProjeto")
public class TipoProjetoFacade {
	

	@Inject
	private TipoProjetoDao TipoProjetoDao;
	
	/* CRUD METHODS */
	
	@WebMethod
	public void wsCreateTipoProjeto(@WebParam(name="TipoProjeto") TipoProjeto rs) {
		TipoProjetoDao.createTipoProjeto(rs);
		
	}
	
	@WebMethod
	public List<TipoProjeto> wsReadTipoProjetos() {
		List<TipoProjeto> TipoProjetoes = TipoProjetoDao.readTipoProjetos();
		for (TipoProjeto a: TipoProjetoes) {
			a.setTiposProjetos(null);
		}
		return TipoProjetoes;
		
	}	
	
	@WebMethod
	public TipoProjeto wsReadTipoProjetoById(@WebParam(name="codTipoProjeto") Integer id) {
		TipoProjeto a = TipoProjetoDao.readTipoProjetoById(id);
		if (a != null) {
			a.setTiposProjetos(null);
		}
		return a;
		
	}
	
	@WebMethod
	public void wsUpdateTipoProjeto(@WebParam(name="TipoProjeto") TipoProjeto rs) {
		TipoProjetoDao.updateTipoProjeto(rs);
		
	}
	
	@WebMethod
	public void wsDeleteTipoProjeto(@WebParam(name="codTipoProjeto") Integer id) {
		TipoProjetoDao.deleteTipoProjeto(id);
		
	}
	
}
