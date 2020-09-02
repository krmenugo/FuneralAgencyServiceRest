package com.krmenugo.agency.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FuturePlan {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFuturePlan;
	
	@Column(name="futurePlanName", length=20)
	private String futurePlanName;
	
	@Column(name="cost")
	private float cost;

	public int getIdFuturePlan() {
		return idFuturePlan;
	}

	public void setIdFuturePlan(int idFuturePlan) {
		this.idFuturePlan = idFuturePlan;
	}

	public String getFuturePlanName() {
		return futurePlanName;
	}

	public void setFuturePlanName(String futurePlanName) {
		this.futurePlanName = futurePlanName;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
