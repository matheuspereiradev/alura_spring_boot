package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.doctor.CreateDoctorData;

@RestController()
@RequestMapping("doctors")
public class DoctorsController {

	@PostMapping()
	public void create(@RequestBody CreateDoctorData json) {
		System.out.println(json);
	}
}
