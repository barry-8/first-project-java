package com.project.cab.citylocations;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city_locations")
public class CityLocations {
	@Id
	private String fromCity;
	private String toCity;
	private int distance;

	public CityLocations() {

	}

	public CityLocations(String fromCity, String toCity, int distance) {
		super();
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.distance = distance;
	}

	public String getFromCity() {
		return fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public int getDistance() {
		return distance;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "CityLocations [fromCity=" + fromCity + ", toCity=" + toCity + ", distance=" + distance + "]";
	}

}
