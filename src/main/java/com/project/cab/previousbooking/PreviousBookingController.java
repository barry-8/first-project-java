package com.project.cab.previousbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreviousBookingController {
	@Autowired
	private PreviousBookingRepo rep;

	@RequestMapping("/list-previousbooking")
	public Iterable<PreviousBooking> getAllPreviousBooking() {
		return rep.findAll();

	}

	@RequestMapping("/view-previousbookings/{cDate}")
	public PreviousBooking viewPreviousBooking(@PathVariable("cDate") String cDate, Model model) {
		PreviousBooking e = rep.findById(cDate).get();
		return e;
	}


}
