package org.rapprochement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Repository;


@Entity
public class Banque {
 
	@Id
	@GeneratedValue
	private Long idbanque;
	private String libelle; 
	

	@OneToMany(mappedBy="banque",cascade = { CascadeType.ALL })
    private java.util.Collection<EcritureBanque> ecriturebanque;
	
	public Long getIdbanque() {
		return this.idbanque;
	}

	public void setIdbanque(Long idbanque) {
		this.idbanque = idbanque;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
	public java.util.Collection<EcritureBanque> getEcriturebanque() {
		return this.ecriturebanque;
	}

	public void setEcriturebanque(
			java.util.Collection<EcritureBanque> ecriturebanque) {
		this.ecriturebanque = ecriturebanque;
	}
	@Override
	   public boolean equals(Object obj) {
	      if (obj == null)
	         return false;
	      if (!(obj instanceof Banque))
	         return false;

	      return ((Banque) obj).getIdbanque() == this.getIdbanque();
	   }

	@Override
	   public int hashCode() {
	      int hash = 1;
	      return hash * 31 + this.libelle.hashCode();
	   }

	   @Override
	   public String toString() {
	      return this.libelle;
	   }
	

	
}
