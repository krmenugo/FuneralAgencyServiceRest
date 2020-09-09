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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value = { "createdAt", "updatedAt", "hibernateLazyInitializer", "handler" })
public class Assistance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAssistance;
	
	@Column(name = "coordinatorName", length = 50, nullable =false)
	private String coordinatorName;
	
	@Column(name = "hiringDate", nullable =false)
	private Date hiringDate;
	
	@Column(name = "finishDate", nullable =false)
	private Date finishDate;
	
	@Column(name = "deceasedName", length = 50, nullable =false)
	private String deceasedName;
	
	@Column(name = "birthDate", nullable =false)
	private Date birthDate;
	
	@Column(name = "deathDate", nullable =false)
	private Date deathDate;
	
	@Column(name = "location", length = 50, nullable =false)
	private String location;
	
	@Column(name = "adviserName", length = 50, nullable =true)
	private String adviserName;
	
	@Column(name = "contactPersonName1", length = 50, nullable =false)
	private String contactPersonName1;
	
	@Column(name = "contactPersonName2", length = 50, nullable =false)
	private String contactPersonName2;
	
	@Column(name = "contactPersonTelephone1", length = 10, nullable =false)
	private String contactPersonTelephone1;
	
	@Column(name = "contactPersonTelephone2", length = 10, nullable =false)
	private String contactPersonTelephone2;
	
	@Column(name = "timeReligiousCeremony", length = 10, nullable =false)
	private Time timeReligiousCeremony;
	
	@Column(name = "placeReligiousCeremony", length = 50, nullable =false)
	private String placeReligiousCeremony;

	@OneToOne
    @JoinColumn(name = "idFuturePlan", referencedColumnName = "idFuturePlan", nullable =false)
    private FuturePlan idFuturePlan;
	
	@OneToOne
    @JoinColumn(name = "idTypeAssistance", referencedColumnName = "idTypeAssistance", nullable =false)
    private TypeAssistance idTypeAssistance;

	@OneToOne
    @JoinColumn(name = "idWakefulness", referencedColumnName = "idWakefulness", nullable =false)
    private Wakefulness idWakefulness;
	
	public Assistance() {
		super();
	}

	public Assistance(int idAssistance, String coordinatorName, Date hiringDate, Date finishDate, String deceasedName,
			Date birthDate, Date deathDate, String location, String adviserName, String contactPersonName1,
			String contactPersonName2, String contactPersonTelephone1, String contactPersonTelephone2,
			Time timeReligiousCeremony, String placeReligiousCeremony) {
		super();
		this.idAssistance = idAssistance;
		this.coordinatorName = coordinatorName;
		this.hiringDate = hiringDate;
		this.finishDate = finishDate;
		this.deceasedName = deceasedName;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
		this.location = location;
		this.adviserName = adviserName;
		this.contactPersonName1 = contactPersonName1;
		this.contactPersonName2 = contactPersonName2;
		this.contactPersonTelephone1 = contactPersonTelephone1;
		this.contactPersonTelephone2 = contactPersonTelephone2;
		this.timeReligiousCeremony = timeReligiousCeremony;
		this.placeReligiousCeremony = placeReligiousCeremony;
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
	
}