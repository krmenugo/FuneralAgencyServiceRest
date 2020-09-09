package com.krmenugo.agency.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.krmenugo.agency.model.FuturePlan;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FuturePlanDTO {

	@NotNull(message = "The id future plan parameter is mandatory.")
	private int idFuturePlan;
	
	@Size(max = 20, message = "Not valid future plan name. Must have Maximum 20 chars.")
	@NotNull(message = "The future plan name parameter is mandatory.")
	private String futurePlanName;
	
	@NotNull(message = "The cost parameter is mandatory.")
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
	
	public FuturePlan parseToModel() {
		return new FuturePlan(idFuturePlan, futurePlanName, cost);
	}
	
	public FuturePlanDTO parseToDTO(FuturePlan futurePlan) {
		this.setIdFuturePlan(futurePlan.getIdFuturePlan());
		this.setFuturePlanName(futurePlan.getFuturePlanName());
		this.setCost(futurePlan.getCost());
		return this;
	}
	
}
