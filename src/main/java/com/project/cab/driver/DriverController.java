package com.project.cab.driver;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {
	@Autowired
	private DriverRepo rep;


	// get all drivers
	@RequestMapping("/allDriver")
	public Iterable<Driver> getAllDriver() {
		return rep.findAll();
	}

	// create driver rest api
	@RequestMapping("/find-driver/{id}")
	public Driver findDriver(@PathVariable("id") String id, Model model) {
		Driver c = rep.findById(id).get();
		return c;
	}

	@PostMapping("/add-driver")
	public Driver addDriver(@RequestBody Driver driver) {
		return rep.save( driver);
	}

	@DeleteMapping("/delete-driver/id")
	public String deleteDriver(@PathVariable String id) {
		rep.deleteById(id);
		return "driver Deleted Succesfully";
	}
	// update driver rest api

		@PostMapping("/update-driver/{id}")
		public ResponseEntity<Driver> updateDriver(@PathVariable String id, @RequestBody Driver driverDetails) {
			Driver driver = rep.findById(id).orElseThrow();
			driver.setDriverName(driverDetails.getDriverName());
			driver.setGender(driverDetails.getGender());
			driver.setAge(driverDetails.getAge());

			Driver updateDriver = rep.save(driver);
			return ResponseEntity.ok(updateDriver);
		}
	
	
}
