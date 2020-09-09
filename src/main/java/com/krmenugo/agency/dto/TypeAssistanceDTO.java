package com.krmenugo.agency.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.krmenugo.agency.model.TypeAssistance;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeAssistanceDTO {
	
	@NotNull(message = "The Id parameter is mandatory.")
	private int idTypeAssistance;
	
	@Size(max = 20, message = "Not valid type assistance name. Must have Maximum 50 chars.")
	@NotNull(message = "The type assistance name parameter is mandatory.")
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
	
	public TypeAssistance parseToModel() {
		return new TypeAssistance(idTypeAssistance, typeAssistanceName);
	}
	
	public TypeAssistanceDTO parseToDTO(TypeAssistance typeAssistance) {
		this.setIdTypeAssistance(typeAssistance.getIdTypeAssistance());
		this.setTypeAssistanceName(typeAssistance.getTypeAssistanceName());
		return this;
	}

}
