package com.project.cab.previousbooking;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "previousbooking")
public class PreviousBooking {
	@Id
	private String cDate;
	private String cPickupPoint;
	private String cDestination;
	private String cCartype;
	private String cFare;

	public PreviousBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreviousBooking(String cDate, String cPickupPoint, String cDestination, String cCartype, String cFare) {
		super();
		this.cDate = cDate;
		this.cPickupPoint = cPickupPoint;
		this.cDestination = cDestination;
		this.cCartype = cCartype;
		this.cFare = cFare;
	}

	public String getcDate() {
		return cDate;
	}

	public void setcDate(String cDate) {
		this.cDate = cDate;
	}

	public String getcPickupPoint() {
		return cPickupPoint;
	}

	public void setcPickupPoint(String cPickupPoint) {
		this.cPickupPoint = cPickupPoint;
	}

	public String getcDestination() {
		return cDestination;
	}

	public void setcDestination(String cDestination) {
		this.cDestination = cDestination;
	}

	public String getcCartype() {
		return cCartype;
	}

	public void setcCartype(String cCartype) {
		this.cCartype = cCartype;
	}

	public String getcFare() {
		return cFare;
	}

	public void setcFare(String cFare) {
		this.cFare = cFare;
	}

	@Override
	public String toString() {
		return "PreviousBooking [cDate=" + cDate + ", cPickupPoint=" + cPickupPoint + ", cDestination=" + cDestination
				+ ", cCartype=" + cCartype + ", cFare=" + cFare + "]";
	}

}
