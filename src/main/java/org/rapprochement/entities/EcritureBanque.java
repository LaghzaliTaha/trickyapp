package org.rapprochement.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Repository;


@Entity
public class EcritureBanque implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long idecriturebc;
    @ManyToOne
    @JoinColumn(name="idbanque")
	private Banque banque = null;
    @ManyToOne
    @JoinColumn(name="idnature")
	private NatureOperation natureoperation = null;
   	private String ecriturebc = null;
	private String sensbc = null;
	private int debut;
	private int fin;
	
	
	public EcritureBanque(Banque banque, NatureOperation nature, String ecriturebc,String sensbc) {
		super();
		this.banque=banque;
		this.natureoperation=nature;
		this.ecriturebc = ecriturebc;
		this.sensbc = sensbc;
	}

	public EcritureBanque(Banque banque,
			NatureOperation natureoperation, String ecriturebc, String sensbc,
			int debut, int fin) {
		super();
		this.banque = banque;
		this.natureoperation = natureoperation;
		this.ecriturebc = ecriturebc;
		this.sensbc = sensbc;
		this.debut = debut;
		this.fin = fin;
	}

	public EcritureBanque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Banque getBanque() {
		return this.banque;
	}

	public void setBanque(final Banque banque) {
		this.banque = banque;
	}

	public NatureOperation getNatureOperation() {
		return this.natureoperation;
	}

	public void setNatureOperation(final NatureOperation natureoperation) {
		this.natureoperation = natureoperation;
	}

	public String getEcriturebc() {
		return this.ecriturebc;
	}

	public void setEcriturebc(String ecriturebc) {
		this.ecriturebc = ecriturebc;
	}

	public String getSensbc() {
		return this.sensbc;
	}

	public void setSensbc(String sensbc) {
		this.sensbc = sensbc;
	}



	public int getDebut() {
		return debut;
	}

	public void setDebut(int debut) {
		this.debut = debut;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public NatureOperation getNatureoperation() {
		return this.natureoperation;
	}

	public void setNatureoperation(NatureOperation natureoperation) {
		this.natureoperation = natureoperation;
	}

	public Long getIdecriturebc() {
		return this.idecriturebc;
	}

	public void setIdecriturebc(Long idecriturebc) {
		this.idecriturebc = idecriturebc;
	}

	
}
