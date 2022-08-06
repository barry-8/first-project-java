package com.project.cab.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	@Autowired
	private CarRepo rep;

	@RequestMapping("/allCar")
	public Iterable<Car> getAllCar() {
		return rep.findAll();
	}

	@RequestMapping("/find-Car/{id}")
	public Car viewCar(@PathVariable("id") String vehicleNo, Model model) {
		Car d = rep.findById(vehicleNo).get();
		return d;

	}

	@PostMapping("/add-car")
	public Car addCar(@RequestBody Car car) {
		return rep.save(car);

	}
}