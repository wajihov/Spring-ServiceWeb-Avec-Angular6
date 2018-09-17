package org.siid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SuppressWarnings("serial")
public class Personne implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 80)
	private String nom;
	@Column(length = 80)
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateNAissance;
	@Column(length = 80)
	private String email;
	private long tel;
	@Column(length = 80)
	private String photo;

	public Personne() {
		super();
	}

	public Personne(String nom, String prenom, Date dateNAissance, String email, long tel, String photo) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNAissance = dateNAissance;
		this.email = email;
		this.tel = tel;
		this.photo = photo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNAissance() {
		return dateNAissance;
	}

	public void setDateNAissance(Date dateNAissance) {
		this.dateNAissance = dateNAissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}