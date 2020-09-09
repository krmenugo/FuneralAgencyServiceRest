package com.krmenugo.agency.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeAssistance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTypeAssistance;
	
	@Column(name="typeAssistanceName", length=20)
	private String typeAssistanceName;

	public int getIdTypeAssistance() {
		return idTypeAssistance;
	}

	public void setIdTypeAssistance(int idTypeAssistance) {
		this.idTypeAssistance = idTypeAssistance;
	}

	public String getTypeAssistanceName() {
		return typeAssistanceName;
	}

	public void setTypeAssistanceName(String typeAssistanceName) {
		this.typeAssistanceName = typeAssistanceName;
	}

	public TypeAssistance() {
		super();
	}

	public TypeAssistance(int idTypeAssistance, String typeAssistanceName) {
		super();
		this.idTypeAssistance = idTypeAssistance;
		this.typeAssistanceName = typeAssistanceName;
	}
	
}
