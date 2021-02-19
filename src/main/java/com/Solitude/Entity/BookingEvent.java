package com.Solitude.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.Solitude.Entity.Location;

// TODO consider adding javax validation annotaions for each field if not already done so on the frontend
@Entity
@Table(name = "BookingEvent")
public class BookingEvent extends AuditModel{
	// should I use auto or identity
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int ID;
	@Column(name = "eventName")
	private String eventName;
	@ManyToOne
	// double check that this is the right column name
	@JoinColumn(name = "location_id", nullable = false)
	private Location location;
	@Column(name = "description")
	private String description;
	@Column(name = "partyNumber")
	private int partyNumber;
	@Column(name = "checkIn")
	private boolean checkedIn;
	@Column(name = "startTime")
	private String startTime;
	@Column(name = "endTime")
	private String endTime;
	@Column(name = "attendeeEmail")
	private String attendeeEmail;

	public BookingEvent() {

	}

	public String getName() {
		return eventName;
	}

	public void setName(String name) {
		this.eventName = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getAttendeeEmail() {
		return attendeeEmail;
	}

	public void setAttendeeEmail(String attendeeEmail) {
		this.attendeeEmail = attendeeEmail;
	}

	public int getPartyNumber() {
		return partyNumber;
	}

	public void setPartyNumber(int partyNumber) {
		this.partyNumber = partyNumber;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public BookingEvent(String name, Location location, String description, int iD, int partyNumber, boolean checkedIn,
			String startTime, String endTime, String attendeeEmail) {
		this.eventName = name;
		this.location = location;
		this.description = description;
		ID = iD;
		this.partyNumber = partyNumber;
		this.checkedIn = checkedIn;
		this.startTime = startTime;
		this.endTime = endTime;
		this.attendeeEmail = attendeeEmail;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "BookingEvent [ID=" + ID + ", attendeeEmail=" + attendeeEmail + ", checkedIn=" + checkedIn
				+ ", description=" + description + ", endTime=" + endTime + ", location=" + location + ", name="
				+ eventName + ", partyNumber=" + partyNumber + ", startTime=" + startTime + "]";
	}
}