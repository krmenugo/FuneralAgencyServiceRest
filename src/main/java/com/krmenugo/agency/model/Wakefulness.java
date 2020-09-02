package com.krmenugo.agency.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wakefulness {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idWakefulness;
	
	@Column(name="wakefulnessPlace", length=50)
	private String wakefulnessPlace;

	public int getIdWakefulness() {
		return idWakefulness;
	}

	public void setIdWakefulness(int idWakefulness) {
		this.idWakefulness = idWakefulness;
	}

	public String getWakefulnessPlace() {
		return wakefulnessPlace;
	}

	public void setWakefulnessPlace(String wakefulnessPlace) {
		this.wakefulnessPlace = wakefulnessPlace;
	}
	
}
