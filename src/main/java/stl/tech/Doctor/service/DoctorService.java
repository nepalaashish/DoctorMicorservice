package stl.tech.Doctor.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import stl.tech.Doctor.entity.Doctor;
import stl.tech.Doctor.reprository.Doctorreprository;




@Service
public class DoctorService 
{
    @Autowired
	private Doctorreprository doctorrepo;
    
    
	
    public List <Doctor> getalldoctor()
	{
		List<Doctor> list = (List<Doctor>) this.doctorrepo.findAll( );
		return list;
	}
    
    public void updatedoctor(int did ,Doctor doctor) 
	{
		doctorrepo.save(doctor);
		
	}
    public void deletedoctor(@PathVariable int did ) 
	{
		doctorrepo.deleteById(did);;
		
	}

	public Doctor adddoctor(Doctor doctor) 
	{ 
		// TODO Auto-generated method stub
		return doctorrepo.save(doctor);
	} 
	
	
	public Doctor save(Doctor doctor) 
	{
		// TODO Auto-generated method stub
		return doctorrepo.save(doctor);
	}

	
	public Optional<Doctor> getalldoctor(int did) {
		// TODO Auto-generated method stub
		return doctorrepo.findByDid(did);
	}
}
	
	



