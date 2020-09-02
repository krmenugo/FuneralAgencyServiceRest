package com.krmenugo.agency.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Assistance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAssistance;
	
	@Column(name = "coordinatorName", length = 50)
	private String coordinatorName;
	
	@Column(name = "hiringDate")
	private Date hiringDate;
	
	@Column(name = "finishDate")
	private Date finishDate;
	
	@Column(name = "deceasedName", length = 50)
	private String deceasedName;
	
	@Column(name = "birthDate")
	private Date birthDate;
	
	@Column(name = "deathDate")
	private Date deathDate;
	
	@Column(name = "location", length = 50)
	private String location;
	
	@Column(name = "adviserName", length = 50)
	private String adviserName;
	
	@Column(name = "contactPersonName1", length = 50)
	private String contactPersonName1;
	
	@Column(name = "contactPersonName2", length = 50)
	private String contactPersonName2;
	
	@Column(name = "contactPersonTelephone1", length = 10)
	private String contactPersonTelephone1;
	
	@Column(name = "contactPersonTelephone2", length = 10)
	private String contactPersonTelephone2;
	
	@Column(name = "timeReligiousCeremony", length = 10)
	private Time timeReligiousCeremony;
	
	@Column(name = "placeReligiousCeremony", length = 50)
	private String placeReligiousCeremony;

	@OneToOne//(cascade = CascadeType.ALL)
    @JoinColumn(name = "idFuturePlan", referencedColumnName = "idFuturePlan")
    private FuturePlan idFuturePlan;
	
	@OneToOne//(cascade = CascadeType.ALL)
    @JoinColumn(name = "idTypeAssistance", referencedColumnName = "idTypeAssistance")
    private TypeAssistance idTypeAssistance;

	@OneToOne//(cascade = CascadeType.ALL)
    @JoinColumn(name = "idWakefulness", referencedColumnName = "idWakefulness")
    private Wakefulness idWakefulness;

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
	
}