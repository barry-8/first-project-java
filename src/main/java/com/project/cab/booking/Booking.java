package com.project.cab.booking;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	@Id
	private String bookingNo;
	private String pickupFrom;
	private String dropAt;
	private String customerId;
	private String vehicleNo;
	private String driverId;
	private double fare;

	public Booking() {
		super();
// TODO Auto-generated constructor stub
	}

	public Booking(String bookingNo, String pickupFrom, String dropAt, String customerId, String vehicleNo,
			String driverId, double fare) {
		super();
		this.bookingNo = bookingNo;
		this.pickupFrom = pickupFrom;
		this.dropAt = dropAt;
		this.customerId = customerId;
		this.vehicleNo = vehicleNo;
		this.driverId = driverId;
		this.fare = fare;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookingNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return Objects.equals(bookingNo, other.bookingNo);
	}

	@Override
	public String toString() {
		return "Booking [bookingNo=" + bookingNo + ", pickupFrom=" + pickupFrom + ", dropAt=" + dropAt + ", customerId="
				+ customerId + ", vehicleNo=" + vehicleNo + ", driverId=" + driverId + ", fare=" + fare + "]";
	}

	public String getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;
	}

	public String getPickupFrom() {
		return pickupFrom;
	}

	public void setPickupFrom(String pickupFrom) {
		this.pickupFrom = pickupFrom;
	}

	public String getDropAt() {
		return dropAt;
	}

	public void setDropAt(String dropAt) {
		this.dropAt = dropAt;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}
}