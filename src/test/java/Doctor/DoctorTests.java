package Doctor;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import stl.tech.Doctor.entity.Doctor;
import stl.tech.Doctor.reprository.Doctorreprository;
import stl.tech.Doctor.service.DoctorService;



@SpringBootTest(classes= {DoctorTests.class})

 public  class DoctorTests 
{

	//@Test
	//void contextLoads() {
	//}
	@Mock 
	Doctorreprository doctorrepo;
	
	@InjectMocks
	DoctorService docservice;
	
	public List<Doctor> mydoctors;
	
	@Test
	@Order(1)
    void test_getalldoctor()
   
	{
		
	List<Doctor> mydoctor = new ArrayList<Doctor>();	
	mydoctor.add(new Doctor(1,"Ashish","Kumar","Cardio"));
	mydoctor.add(new Doctor(2,"ish","Kumar","Cardiologist"));
	when(doctorrepo.findAll()).thenReturn(mydoctor);
	assertEquals(2,docservice.getalldoctor().size());
		 
	}
	
	@Test
	@Order(2)
	void test_adddoctor() 
	{
		Doctor doctor = new Doctor(1,"Ashish","Kumar","Cardio");
		when(doctorrepo.save(doctor)).thenReturn(doctor);
		docservice.adddoctor(doctor);
		assertEquals(doctor,docservice.adddoctor(doctor));
		
	}
	@Test
	@Order(3)
	
	void test_updatedoctor() 
	{
		Doctor doctor = new Doctor(1,"Ashish","Kumar","Cardio");
		doctor.setdid(1);
		doctorrepo.save(doctor);
		assertEquals(doctor, doctor);
		 
	}
	
	
	
	

}
