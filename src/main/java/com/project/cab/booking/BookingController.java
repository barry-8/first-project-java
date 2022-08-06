package com.project.cab.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
	@Autowired
	private BookingRepo rep;

	@RequestMapping("/list-bookings")
	public Iterable<Booking> getAllBookings() {
		return rep.findAll();

	}

	@RequestMapping("/view-bookings/{bookingNo}")
	public Booking viewBooking(@PathVariable("bookingNo") String bookingNo, Model model) {
		Booking e = rep.findById(bookingNo).get();
		return e;
	}

	@PostMapping("/add-booking")
	public Booking addBooking(@RequestBody Booking booking) {
		return rep.save(booking);
	}

}