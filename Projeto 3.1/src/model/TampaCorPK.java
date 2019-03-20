package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TampaCorPK implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "TA_NU")
	private Long idTampa;

	@Column(name = "CO_NU")
	private Long idCor;

	public TampaCorPK() {
		super();
	}

	public TampaCorPK(Long idTampa, Long idCor) {
		super();
		this.idTampa = idTampa;
		this.idCor = idCor;
	}

	public Long getIdTampa() {
		return idTampa;
	}

	public void setIdTampa(Long idTampa) {
		this.idTampa = idTampa;
	}

	public Long getIdCor() {
		return idCor;
	}

	public void setIdCor(Long idCor) {
		this.idCor = idCor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTampa == null) ? 0 : idTampa.hashCode());
		result = prime * result + ((idCor == null) ? 0 : idCor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TampaCorPK other = (TampaCorPK) obj;
		if (idTampa == null) {
			if (other.idTampa != null)
				return false;
		} else if (!idTampa.equals(other.idTampa))
			return false;
		if (idCor == null) {
			if (other.idCor != null)
				return false;
		} else if (!idCor.equals(other.idCor))
			return false;
		return true;
	}

}