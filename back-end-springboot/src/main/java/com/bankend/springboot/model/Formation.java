package com.bankend.springboot.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "list_formation")
public class Formation {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")
	@Column(name="id")
    private long id;
	
	@Column(name="formation_title")
	private String formationTitle; 
	
	@Column(name="objectifs")
	private String objectifs; 
	
	@Column(name="pre_requis")
	private String preRequis; 
	
	@Column(name="etabli")
	private String etabli;
	
	@Column(name="nombre_max")
	private int nombreMax; 
	
	@Basic(optional = false)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created", insertable = false, updatable = false)
	private Date dateCreated;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFormationTitle() {
		return formationTitle;
	}

	public void setFormationTitle(String formationTitle) {
		this.formationTitle = formationTitle;
	}

	public String getObjectifs() {
		return objectifs;
	}

	public void setObjectifs(String objectifs) {
		this.objectifs = objectifs;
	}

	public String getPreRequis() {
		return preRequis;
	}

	public void setPreRequis(String preRequis) {
		this.preRequis = preRequis;
	}

	public String getEtabli() {
		return etabli;
	}

	public void setEtabli(String etabli) {
		this.etabli = etabli;
	}

	public int getNombreMax() {
		return nombreMax;
	}

	public void setNombreMax(int nombreMax) {
		this.nombreMax = nombreMax;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String toString() {
		return null;
	}

	public Object getFId() {
		// TODO Auto-generated method stub
		return formationTitle;
	}
	
}
