package ehospital.nic.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.web.bind.annotation.*;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@RestController
@RequestMapping("/api")
@EnableSwagger2
public class PatientResource {
	
	ConcurrentMap<String, Patient> patients= new ConcurrentHashMap<>();
	
	@GetMapping("/{id}")
	public Patient getPatient(@PathVariable String id)
	{
		return patients.get(id);
		
	}
	
	@GetMapping("/")
	public List<Patient> getAllPatients()
	{
		return new ArrayList<Patient>(patients.values());
	}
	
	@PostMapping("/")
	public Patient addPatient(@RequestBody Patient patient)
	{
		patients.put(patient.getId(),patient);
		return patient;
	}

}
