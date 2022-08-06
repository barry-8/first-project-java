package com.project.cab.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@Autowired
	private AdminRepo repo;

	@RequestMapping("/list-admin")
	public Iterable<Admin> getAllAdmins() {
		return repo.findAll();
	}

	@RequestMapping("/find-admin/{adminId}")
	public Admin viewadmin(@PathVariable("adminId") String adminId, Model model) {
		Admin a = repo.findById(adminId).get();
		return a;
	}

	@PostMapping("/add-admin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return repo.save(admin);

	}

	@RequestMapping("/delete-admin/{adminId}")
	public void viewDelete(@PathVariable("adminId") String adminId) {
		Admin a = repo.findById(adminId).get();
		repo.delete(a);
	}
}