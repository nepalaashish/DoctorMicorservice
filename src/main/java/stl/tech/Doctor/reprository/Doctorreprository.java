package stl.tech.Doctor.reprository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.jpa.repository.Query;*/

import stl.tech.Doctor.entity.Doctor;




public interface Doctorreprository extends JpaRepository<Doctor,Integer>
{

	Optional<Doctor> findByDid(int did);
    
	
	/*
	 * @Query(nativeQuery=true ,
	 * value="select * from table_name where lower(column_name)=lower(?1) and lower(column_name)=lower(?2)"
	 * ) Doctor findDoctorByDoctorFirstNameAndDoctorLastName(String doctorFirstname,
	 * String doctorLastname);
	 */
	
	/*
	 * @Override public Optional<Doctor> findById(Int Did ) {
	 * 
	 * return doctorrepo.findById(id); }
	 */

}
