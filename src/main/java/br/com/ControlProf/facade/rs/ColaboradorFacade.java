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

import br.com.ControlProf.dao.ColaboradorDao;
import br.com.ControlProf.domain.Colaborador;



/*
 * To debug
 * localhost:8080/ControlProf/rs/colaborador
 */

@Path(value="/colaborador")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ColaboradorFacade {
	
	/* ATTRIBUTES */
	
	@Inject
	private ColaboradorDao ColaboradorDao;
	
	/* CRUD METHODS */
	
	@POST
	public void rsCreateColaborador(Colaborador rs) {
		ColaboradorDao.createColaborador(rs);
		
	}
	
	@GET
	public List<Colaborador> rsReadColaboradors() {
		List<Colaborador> Colaboradors = ColaboradorDao.readColaboradors();
		for (Colaborador p: Colaboradors) {
			p.setProjetos(null);
			p.setProjetos(null);
		}
		return Colaboradors;
		
	}
	
	@GET
	@Path("/{codigo}")
	public Colaborador rsReadColaboradorById(@PathParam(value="codigo") Integer id) {
		
		Colaborador r = ColaboradorDao.readColaboradorById(id);
		if (r != null) {
			r.setProjetos(null);
			r.setProjetos(null);
		}
		return r;
		
	}
	
	@PUT
	public void rsUpdateColaborador(Colaborador rs) {
		ColaboradorDao.updateColaborador(rs);
		
	}
	
	@DELETE
	@Path("/{codigo}")
	public void rsDeleteColaborador(@PathParam(value="codigo") Integer id) {
		ColaboradorDao.deleteColaborador(id);
		
	}

}
