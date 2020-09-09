package com.krmenugo.agency.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.krmenugo.agency.model.Wakefulness;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WakefulnessDTO {
	
	@NotNull(message = "The id wakefulness parameter is mandatory.")
	private int idWakefulness;
	
	@Size(max = 50, message = "Not valid wakefulness place. Must have Maximum 50 chars.")
	@NotNull(message = "The wakefulness place parameter is mandatory.")
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
	
	public Wakefulness parseToModel() {
		return new Wakefulness(idWakefulness, wakefulnessPlace);
	}

	public WakefulnessDTO parseToDTO(Wakefulness wakefulness) {
		this.setIdWakefulness(wakefulness.getIdWakefulness());
		this.setWakefulnessPlace(wakefulness.getWakefulnessPlace());
		return this;
	}
	
}
