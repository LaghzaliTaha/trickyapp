package org.rapprochement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Repository;


@Entity
public class NatureOperation {

	@Id
	@GeneratedValue
	private Long idnature;
	private String code;
	private String nom;
	

	
	@OneToMany(mappedBy="natureoperation",cascade = { CascadeType.ALL })
	
    private java.util.Collection<EcritureBanque> ecriturebanque;



	private String moderapprochement;
	private String ecrituregl;
	private String typeExtract;
	private String valeur;
	private String sensgl;
	private int debut;
	private int fin;

	
	public String getNom() {
		return this.nom;
	}

	public NatureOperation(Long idnature, String ecrituregl) {
		super();
		this.idnature = idnature;
		this.ecrituregl = ecrituregl;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public NatureOperation() {
	}

	public String getSensgl() {
		return this.sensgl;
	}

	public void setSensgl(String sensgl) {
		this.sensgl = sensgl;
	}

	public String getTypeExtract() {
		return this.typeExtract;
	}

	public void setTypeExtract(String typeExtract) {
		this.typeExtract = typeExtract;
	}

	public String getValeur() {
		return this.valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public int getDebut() {
		return this.debut;
	}

	public void setDebut(int debut) {
		this.debut = debut;
	}

	public int getFin() {
		return this.fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	



	public Long getIdnature() {
		return this.idnature;
	}

	

	public void setIdnature(Long idnature) {
		this.idnature = idnature;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getModerapprochement() {
		return this.moderapprochement;
	}

	public void setModerapprochement(String moderapprochement) {
		this.moderapprochement = moderapprochement;
	}

	public String getEcrituregl() {
		return this.ecrituregl;
	}

	public void setEcrituregl(String ecrituregl) {
		this.ecrituregl = ecrituregl;
	}

	
	public java.util.Collection<EcritureBanque> getEcriturebanque() {
		return this.ecriturebanque;
	}

	public void setEcriturebanque(
			java.util.Collection<EcritureBanque> ecriturebanque) {
		this.ecriturebanque = ecriturebanque;
	}


	/*
	 * public void setOutBanque(java.util.Collection<OutBanque> newOutBanque) {
	 * removeAllOutBanque(); for (java.util.Iterator iter =
	 * newOutBanque.iterator(); iter.hasNext();)
	 * addOutBanque((OutBanque)iter.next()); }
	 * 
	 * 
	 * /* public void addOutBanque(OutBanque newOutBanque) { if (newOutBanque ==
	 * null) return; if (this.outBanque == null) this.outBanque = new
	 * java.util.HashSet<OutBanque>(); if
	 * (!this.outBanque.contains(newOutBanque)) {
	 * this.outBanque.add(newOutBanque); newOutBanque.setNatureOperation(this);
	 * } }
	 * 
	 * public void removeOutBanque(OutBanque oldOutBanque) { if (oldOutBanque ==
	 * null) return; if (this.outBanque != null) if
	 * (this.outBanque.contains(oldOutBanque)) {
	 * this.outBanque.remove(oldOutBanque);
	 * oldOutBanque.setNatureOperation((NatureOperation)null); } }
	 * 
	 * public void removeAllOutBanque() { if (outBanque != null) { OutBanque
	 * oldOutBanque; for (java.util.Iterator iter = getIteratorOutBanque();
	 * iter.hasNext();) { oldOutBanque = (OutBanque)iter.next(); iter.remove();
	 * oldOutBanque.setNatureOperation((NatureOperation)null); } } }
	 */



	/*
	 * public void setOutGrandLivre(java.util.Collection<OutGrandLivre>
	 * newOutGrandLivre) { removeAllOutGrandLivre(); for (java.util.Iterator
	 * iter = newOutGrandLivre.iterator(); iter.hasNext();)
	 * addOutGrandLivre((OutGrandLivre)iter.next()); }
	 * 
	 * /* public void addOutGrandLivre(OutGrandLivre newOutGrandLivre) { if
	 * (newOutGrandLivre == null) return; if (this.outGrandLivre == null)
	 * this.outGrandLivre = new java.util.HashSet<OutGrandLivre>(); if
	 * (!this.outGrandLivre.contains(newOutGrandLivre)) {
	 * this.outGrandLivre.add(newOutGrandLivre);
	 * newOutGrandLivre.setNatureOperation(this); } }
	 * 
	 * public void removeOutGrandLivre(OutGrandLivre oldOutGrandLivre) { if
	 * (oldOutGrandLivre == null) return; if (this.outGrandLivre != null) if
	 * (this.outGrandLivre.contains(oldOutGrandLivre)) {
	 * this.outGrandLivre.remove(oldOutGrandLivre);
	 * oldOutGrandLivre.setNatureOperation((NatureOperation)null); } }
	 * 
	 * 
	 * public void removeAllOutGrandLivre() { if (outGrandLivre != null) {
	 * OutGrandLivre oldOutGrandLivre; for (java.util.Iterator iter =
	 * getIteratorOutGrandLivre(); iter.hasNext();) { oldOutGrandLivre =
	 * (OutGrandLivre)iter.next(); iter.remove();
	 * oldOutGrandLivre.setNatureOperation((NatureOperation)null); } } }
	 */

}
