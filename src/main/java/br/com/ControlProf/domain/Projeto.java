package br.com.ControlProf.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="TB_PROJETO")
@XmlRootElement
public class Projeto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_PROJETO")
	private Integer id;
	
	@Column(name="DS_NOME",nullable=false,length=200)
	private String nome;
	
	
	@Column(name="DT_INICIO")
	private Date dataInicio;
	
	@Column(name="DT_FIM")
	private Date dataFim;
	
	@Column(name="SITUACAO")
	private Integer situacao;
	
	@Column(name="TOTAL_HORAS",nullable=false)
	private Integer quantidadeHoras;
	
	@Column(name="TIPO_EDITAL",nullable=false)
	private String tipoEdital;
	
	@ManyToOne
	@JoinColumn(name="COD_TP", referencedColumnName="COD_TIPO")
	private TipoProjeto tipoProjeto;
	
	@ManyToMany
	@JoinTable(name="TB_PROJETOS_COLABORADOR",
	   joinColumns= @JoinColumn(name="COD_PROJETO"),
       inverseJoinColumns = @JoinColumn(name="COD_COLABORADOR"))
	private List<Colaborador> colaboradores;

	public Projeto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Integer getSituacao() {
		return situacao;
	}

	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
	}

	public Integer getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Integer quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public String getTipoEdital() {
		return tipoEdital;
	}

	public void setTipoEdital(String tipoEdital) {
		this.tipoEdital = tipoEdital;
	}

	public TipoProjeto getTipoProjeto() {
		return tipoProjeto;
	}

	public void setTipoProjeto(TipoProjeto tipoProjeto) {
		this.tipoProjeto = tipoProjeto;
	}

	public List<Colaborador> getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(List<Colaborador> colaboradores) {
		this.colaboradores = colaboradores;
	}

}