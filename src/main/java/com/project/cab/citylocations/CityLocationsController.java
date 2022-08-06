package com.project.cab.citylocations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CityLocationsController {
	@Autowired
	private CityLocationsRepo repo;
	@RequestMapping("/all-CityLocations")
	public Iterable< CityLocations> getAllCityLocations() {
		return repo.findAll();
	}
	
	 @PostMapping("/add-fromCity")
	    public CityLocations addfromCity(@RequestBody CityLocations cityLocations) {
	    	return repo.save(cityLocations);
	    }
	 @PostMapping("/add-toCity")
	    public CityLocations addtoCity(@RequestBody CityLocations cityLocations) {
	    	return repo.save(cityLocations);
	    }
}
