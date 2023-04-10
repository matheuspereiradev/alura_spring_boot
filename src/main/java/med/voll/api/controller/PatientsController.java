package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import med.voll.api.patient.CreatePatientData;

@RestController()
@RequestMapping("patients")
public class PatientsController {
	
	@PostMapping()
	public void create(@RequestBody CreatePatientData json) {
		System.out.println("Criando paciente "+json);
	}

}
