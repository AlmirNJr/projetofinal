package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import enums.SituacaoEnum;


@Entity
public class TampaCor implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TampaCorPK id;

	@ManyToOne
	@JoinColumn(name = "TA_NU", referencedColumnName = "TA_NU", insertable = false, updatable = false)
	private Tampa tampa;

	@ManyToOne
	@JoinColumn(name = "CO_NU", referencedColumnName = "CO_NU", insertable = false, updatable = false)
	private Cor cor;

	@Column(name = "CC_SIT")
	@Enumerated(EnumType.STRING)
	private SituacaoEnum situacao;

	public TampaCor() {
		super();
	}

	public TampaCor(Tampa tampa, Cor cor, SituacaoEnum situacao) {
		super();
		this.id = new TampaCorPK(tampa.getId(), cor.getId());
		this.tampa = tampa;
		this.cor = cor;
		this.situacao = situacao;
	}

	public TampaCorPK getId() {
		return id;
	}

	public void setId(TampaCorPK id) {
		this.id = id;
	}

	public Tampa getTampa() {
		return tampa;
	}

	public void setTampa(Tampa tampa) {
		this.tampa = tampa;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public SituacaoEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoEnum situacao) {
		this.situacao = situacao;
	}


}
