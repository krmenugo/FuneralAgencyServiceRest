package com.krmenugo.agency.dto;

import java.sql.Time;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.krmenugo.agency.model.Assistance;
import com.krmenugo.agency.model.FuturePlan;
import com.krmenugo.agency.model.TypeAssistance;
import com.krmenugo.agency.model.Wakefulness;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssistanceDTO {

	@NotNull(message = "The Id parameter is mandatory.")
	private int idAssistance;

	@Size(max = 50, message = "Not valid coordinator name. Must have Maximum 50 chars.")
	@NotNull(message = "The coordinator name parameter is mandatory.")
	private String coordinatorName;

	@NotNull(message = "The hiring date parameter is mandatory.")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	private Date hiringDate;

	@NotNull(message = "The finish date parameter is mandatory.")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	private Date finishDate;

	@Size(max = 50, message = "Not valid deceased name. Must have Maximum 50 chars.")
	@NotNull(message = "The deceased name parameter is mandatory.")
	private String deceasedName;

	@NotNull(message = "The birth date parameter is mandatory.")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	private Date birthDate;

	@NotNull(message = "The death date parameter is mandatory.")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	private Date deathDate;

	@Size(max = 50, message = "Not valid location. Must have Maximum 50 chars.")
	@NotNull(message = "The location parameter is mandatory.")
	private String location;

	@Size(max = 50, message = "Not valid adviser name. Must have Maximum 50 chars.")
	@NotNull(message = "The adviser name parameter is mandatory.")
	private String adviserName;

	@Size(max = 50, message = "Not valid contact person name 1. Must have Maximum 50 chars.")
	@NotNull(message = "The contact person name 1 parameter is mandatory.")
	private String contactPersonName1;

	@Size(max = 50, message = "Not valid contact person name 2. Must have Maximum 50 chars.")
	@NotNull(message = "The contact person name 2 parameter is mandatory.")
	private String contactPersonName2;

	@Size(max = 10, message = "Not valid contact person telephone 1. Must have Maximum 50 chars.")
	@NotNull(message = "The contact person telephone 1 parameter is mandatory.")
	private String contactPersonTelephone1;

	@Size(max = 10, message = "Not valid contact person telephone 2. Must have Maximum 50 chars.")
	@NotNull(message = "The contact person telephone 2 parameter is mandatory.")
	private String contactPersonTelephone2;

	@NotNull(message = "The time religious ceremony parameter is mandatory.")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh:mm")
	private Time timeReligiousCeremony;

	@Size(max = 50, message = "Not valid place religious ceremony. Must have Maximum 50 chars.")
	@NotNull(message = "The place religious ceremony parameter is mandatory.")
	private String placeReligiousCeremony;

	@NotNull(message = "The id Future Plan is mandatory")
	private FuturePlan idFuturePlan;

	@NotNull(message = "The id type assistance is mandatory")
	private TypeAssistance idTypeAssistance;

	@NotNull(message = "The id wakefulness is mandatory")
	private Wakefulness idWakefulness;
	
	@NotNull(message = "The future plan name is mandatory")
	private String futurePlanName;
	
	@NotNull(message = "The type assistance name is mandatory")
	private String typeAssistanceName;
	
	@NotNull(message = "The wakefulness place is mandatory")
	private String wakefulnessPlace;
	
	public String getFuturePlanName() {
		return futurePlanName;
	}

	public void setFuturePlanName(String futurePlanName) {
		this.futurePlanName = futurePlanName;
	}

	public String getTypeAssistanceName() {
		return typeAssistanceName;
	}

	public void setTypeAssistanceName(String typeAssistanceName) {
		this.typeAssistanceName = typeAssistanceName;
	}

	public String getWakefulnessPlace() {
		return wakefulnessPlace;
	}

	public void setWakefulnessPlace(String wakefulnessPlace) {
		this.wakefulnessPlace = wakefulnessPlace;
	}

	public int getIdAssistance() {
		return idAssistance;
	}

	public void setIdAssistance(int idAssistance) {
		this.idAssistance = idAssistance;
	}

	public String getCoordinatorName() {
		return coordinatorName;
	}

	public void setCoordinatorName(String coordinatorName) {
		this.coordinatorName = coordinatorName;
	}

	public Date getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public String getDeceasedName() {
		return deceasedName;
	}

	public void setDeceasedName(String deceasedName) {
		this.deceasedName = deceasedName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAdviserName() {
		return adviserName;
	}

	public void setAdviserName(String adviserName) {
		this.adviserName = adviserName;
	}

	public String getContactPersonName1() {
		return contactPersonName1;
	}

	public void setContactPersonName1(String contactPersonName1) {
		this.contactPersonName1 = contactPersonName1;
	}

	public String getContactPersonName2() {
		return contactPersonName2;
	}

	public void setContactPersonName2(String contactPersonName2) {
		this.contactPersonName2 = contactPersonName2;
	}

	public String getContactPersonTelephone1() {
		return contactPersonTelephone1;
	}

	public void setContactPersonTelephone1(String contactPersonTelephone1) {
		this.contactPersonTelephone1 = contactPersonTelephone1;
	}

	public String getContactPersonTelephone2() {
		return contactPersonTelephone2;
	}

	public void setContactPersonTelephone2(String contactPersonTelephone2) {
		this.contactPersonTelephone2 = contactPersonTelephone2;
	}

	public Time getTimeReligiousCeremony() {
		return timeReligiousCeremony;
	}

	public void setTimeReligiousCeremony(Time timeReligiousCeremony) {
		this.timeReligiousCeremony = timeReligiousCeremony;
	}

	public String getPlaceReligiousCeremony() {
		return placeReligiousCeremony;
	}

	public void setPlaceReligiousCeremony(String placeReligiousCeremony) {
		this.placeReligiousCeremony = placeReligiousCeremony;
	}

	public FuturePlan getIdFuturePlan() {
		return idFuturePlan;
	}

	public void setIdFuturePlan(FuturePlan idFuturePlan) {
		this.idFuturePlan = idFuturePlan;
	}

	public TypeAssistance getIdTypeAssistance() {
		return idTypeAssistance;
	}

	public void setIdTypeAssistance(TypeAssistance idTypeAssistance) {
		this.idTypeAssistance = idTypeAssistance;
	}

	public Wakefulness getIdWakefulness() {
		return idWakefulness;
	}

	public void setIdWakefulness(Wakefulness idWakefulness) {
		this.idWakefulness = idWakefulness;
	}

	public Assistance parseToModel() {
		return new Assistance(idAssistance, coordinatorName, hiringDate, finishDate, deceasedName, birthDate, deathDate,
				location, adviserName, contactPersonName1, contactPersonName2, contactPersonTelephone1,
				contactPersonTelephone2, timeReligiousCeremony, placeReligiousCeremony, idFuturePlan, idTypeAssistance,
				idWakefulness);
	}

	public AssistanceDTO parseToDTO(Assistance assistance) {
		this.setIdAssistance(assistance.getIdAssistance());
		this.setCoordinatorName(assistance.getCoordinatorName());
		this.setHiringDate(assistance.getHiringDate());
		this.setFinishDate(assistance.getFinishDate());
		this.setDeceasedName(assistance.getDeceasedName());
		this.setBirthDate(assistance.getBirthDate());
		this.setDeathDate(assistance.getDeathDate());
		this.setLocation(assistance.getLocation());
		this.setAdviserName(assistance.getAdviserName());
		this.setContactPersonName1(assistance.getContactPersonName1());
		this.setContactPersonName2(assistance.getContactPersonName2());
		this.setContactPersonTelephone1(assistance.getContactPersonTelephone1());
		this.setContactPersonTelephone2(assistance.getContactPersonTelephone2());
		this.setTimeReligiousCeremony(assistance.getTimeReligiousCeremony());
		this.setPlaceReligiousCeremony(assistance.getPlaceReligiousCeremony());
		this.setFuturePlanName(assistance.getIdFuturePlan().getFuturePlanName());
		this.setTypeAssistanceName(assistance.getIdTypeAssistance().getTypeAssistanceName());
		this.setWakefulnessPlace(assistance.getIdWakefulness().getWakefulnessPlace());
		return this;
	}

}
