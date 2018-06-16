package br.com.ControlProf.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="TB_TIPOPROJETO")
@XmlRootElement
public class TipoProjeto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_TIPO")
	private Integer id;
	
	@Column(name="DESC_PROJETO",nullable=false,length=200)
	private String descricao;
	
	@OneToMany(mappedBy="tipoProjeto")
	private List<Projeto> tiposProjetos;

	public TipoProjeto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Projeto> getTiposProjetos() {
		return tiposProjetos;
	}

	public void setTiposProjetos(List<Projeto> tiposProjetos) {
		this.tiposProjetos = tiposProjetos;
	}

}
