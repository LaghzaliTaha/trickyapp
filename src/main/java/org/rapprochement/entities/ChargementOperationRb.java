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
public class ChargementOperationRb {

	@Id
	@GeneratedValue
	  private Long idoperationrb;
		private String libelle;
		
		 @Temporal(TemporalType.DATE)
		   private java.util.Date dateOp;
		  
		   private String solde;
		   
		   private long solde100;
		  
		   private String identifiant;

		   private String debit;
		  
		   private long difference;
		   private int idbanque;
		   
		   private int idnature ;
		   private String nature ;
		 
		   private long debit100 ;
		   private String etat ;
		   
		 
		public long getDebit100() {
			return debit100;
		}
		public void setDebit100(long debit100) {
			this.debit100 = debit100;
		}
		public String getNature() {
			return nature;
		}
		public void setNature(String nature) {
			this.nature = nature;
		}
		public int getIdnature() {
			return idnature;
		}
		public void setIdnature(int idnature) {
			this.idnature = idnature;
		}
		public Long getIdoperationrb() {
			return idoperationrb;
		}
		public void setIdoperationrb(Long idoperationrb) {
			this.idoperationrb = idoperationrb;
		}
		public String getLibelle() {
			return libelle;
		}
		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}
		public java.util.Date getDateOp() {
			return dateOp;
		}
		public void setDateOp(java.util.Date dateOp) {
			this.dateOp = dateOp;
		}
		public String getSolde() {
			return solde;
		}
		public void setSolde(String solde) {
			this.solde = solde;
		}
		public long getSolde100() {
			return solde100;
		}
		public void setSolde100(long solde100) {
			this.solde100 = solde100;
		}
		public String getIdentifiant() {
			return identifiant;
		}
		public void setIdentifiant(String identifiant) {
			this.identifiant = identifiant;
		}
		public String getDebit() {
			return debit;
		}
		public void setDebit(String debit) {
			this.debit = debit;
		}
		
		public int getIdbanque() {
			return idbanque;
		}
		public void setIdbanque(int numrb) {
			this.idbanque = idbanque;
		}
		public String getEtat() {
			return etat;
		}
		public void setEtat(String etat) {
			this.etat = etat;
		}
		public long getDifference() {
			return difference;
		}
		public void setDifference(long difference) {
			this.difference = difference;
		}
}
