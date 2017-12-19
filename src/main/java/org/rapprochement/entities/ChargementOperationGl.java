package org.rapprochement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Repository;

@Entity
public class ChargementOperationGl {
	
	@Id
	@GeneratedValue
	private Long idoperationgl;
	private String libelle;
	@Temporal(TemporalType.DATE)
	private java.util.Date dateOp;
	private String debit;
	private String credit;
    private long debit100;
	private long credit100;
	private String numpiece;
	
	private String nature ;
	private String  identifiant;
	
    private int idnature ;
	private String etat ;
	
	public Long getIdoperationgl() {
		return this.idoperationgl;
	}
	public void setIdoperationgl(Long idoperationgl) {
		this.idoperationgl = idoperationgl;
	}
	public String getLibelle() {
		return this.libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public java.util.Date getDateOp() {
		return this.dateOp;
	}
	public void setDateOp(java.util.Date dateOp) {
		this.dateOp = dateOp;
	}
	public String getDebit() {
		return this.debit;
	}
	public void setDebit(String debit) {
		this.debit = debit;
	}
	public String getCredit() {
		return this.credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public long getDebit100() {
		return this.debit100;
	}
	public void setDebit100(long debit100) {
		this.debit100 = debit100;
	}
	public long getCredit100() {
		return this.credit100;
	}
	public void setCredit100(long credit100) {
		this.credit100 = credit100;
	}
	public String getNumpiece() {
		return this.numpiece;
	}
	public void setNumpiece(String numpiece) {
		this.numpiece = numpiece;
	}
	public String getIdentifiant() {
		return this.identifiant;
	}
	public void setIdentifiant(String numgl) {
		this.identifiant = numgl;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
}
