package com.project.cab.car;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")

public class Car {
	@Id
	private String vehicleNo;
	private String vehicleModel;
	private String vehicleType;
	private String vehicleColor;

	public Car() {
		super();
	}

	public Car(String vehicleNo, String vehicleModel, String vehicleType, String vehicleColor) {
		super();
		this.vehicleNo = vehicleNo;
		this.vehicleModel = vehicleModel;
		this.vehicleType = vehicleType;
		this.vehicleColor = vehicleColor;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	@Override
	public String toString() {
		return "Car [vehicleNo=" + vehicleNo + ", vehicleModel=" + vehicleModel + ", vehicleType=" + vehicleType
				+ ", vehicleColor=" + vehicleColor + "]";
	}

}
