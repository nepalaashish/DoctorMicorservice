package stl.tech.Doctor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import stl.tech.Doctor.entity.Doctor;
import stl.tech.Doctor.service.DoctorService;

@RestController
public class DoctorController 
{
	
	
	@Autowired
	private DoctorService doctorservice;
	
	
	
	@GetMapping("/doctors")
	public List <Doctor> getalldoctor() 
	{
	
		 return doctorservice.getalldoctor();
	}
	
	 @PostMapping("/doctors")
		public Doctor adddoctor(@RequestBody Doctor doctor)
		 {
			 Doctor p = doctorservice.save(doctor);
			 return p;
	        }
	 
	 @PutMapping("/doctors/{did}")
		public void updatedoctor(@PathVariable ("did") int did,@RequestBody Doctor doctor) 
		{
	        doctorservice.updatedoctor(did, doctor);
	    }
	 
	 @DeleteMapping("/doctors/{did}")
		public void deletedoctor(@PathVariable("did") int did) 
		{
			doctorservice.deletedoctor(did);
		}
	 @GetMapping("/doctors/{did}")
		public Optional<Doctor> getalldoctor(@PathVariable int did ) 
		{
		
			 return doctorservice.getalldoctor( did );
		}
 
		
	 
	
	
}
