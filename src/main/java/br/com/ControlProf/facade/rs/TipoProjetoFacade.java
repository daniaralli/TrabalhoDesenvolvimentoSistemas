package br.com.ControlProf.facade.rs;


import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.ControlProf.dao.TipoProjetoDao;
import br.com.ControlProf.domain.TipoProjeto;



/*
 * To debug
 * localhost:8080/ControlProf/rs/tipoProjeto
 */

@Path(value="/tipoProjeto")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class TipoProjetoFacade {
	
	/* ATTRIBUTES */
	
	@Inject
	private TipoProjetoDao TipoProjetoDao;
	
	/* CRUD METHODS */
	
	@POST
	public void rsCreateTipoProjeto(TipoProjeto rs) {
		TipoProjetoDao.createTipoProjeto(rs);
		
	}
	
	@GET
	public List<TipoProjeto> rsReadTipoProjetos() {
		List<TipoProjeto> TipoProjetos = TipoProjetoDao.readTipoProjetos();
		for (TipoProjeto p: TipoProjetos) {
			p.setTiposProjetos(null);
		}
		return TipoProjetos;
		
	}
	
	@GET
	@Path("/{codigo}")
	public TipoProjeto rsReadTipoProjetoById(@PathParam(value="codigo") Integer id) {
		
		TipoProjeto r = TipoProjetoDao.readTipoProjetoById(id);
		if (r != null) {
			r.setTiposProjetos(null);
		}
		return r;
		
	}
	
	@PUT
	public void rsUpdateTipoProjeto(TipoProjeto rs) {
		TipoProjetoDao.updateTipoProjeto(rs);
		
	}
	
	@DELETE
	@Path("/{codigo}")
	public void rsDeleteTipoProjeto(@PathParam(value="codigo") Integer id) {
		TipoProjetoDao.deleteTipoProjeto(id);
		
	}

}
