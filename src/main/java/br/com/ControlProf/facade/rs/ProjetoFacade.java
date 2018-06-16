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

import br.com.ControlProf.dao.ProjetoDao;
import br.com.ControlProf.domain.Projeto;



/*
 * To debug
 * localhost:8080/ControlProf/rs/Projeto
 */

@Path(value="/Projeto")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ProjetoFacade {
	
	/* ATTRIBUTES */
	
	@Inject
	private ProjetoDao ProjetoDao;
	
	/* CRUD METHODS */
	
	@POST
	public void rsCreateProjeto(Projeto rs) {
		ProjetoDao.createProjeto(rs);
		
	}
	
	@GET
	public List<Projeto> rsReadProjetos() {
		List<Projeto> Projetos = ProjetoDao.readProjetos();
		for (Projeto p: Projetos) {
			p.setColaboradores(null);
			p.getTipoProjeto().setTiposProjetos(null);
		}
		return Projetos;
		
	}
	
	@GET
	@Path("/{codigo}")
	public Projeto rsReadProjetoById(@PathParam(value="codigo") Integer id) {
		
		Projeto r = ProjetoDao.readProjetoById(id);
		if (r != null) {
			r.setColaboradores(null);
			r.getTipoProjeto().setTiposProjetos(null);
		}
		return r;
		
	}
	
	@PUT
	public void rsUpdateProjeto(Projeto rs) {
		ProjetoDao.updateProjeto(rs);
		
	}
	
	@DELETE
	@Path("/{codigo}")
	public void rsDeleteProjeto(@PathParam(value="codigo") Integer id) {
		ProjetoDao.deleteProjeto(id);
		
	}

}
