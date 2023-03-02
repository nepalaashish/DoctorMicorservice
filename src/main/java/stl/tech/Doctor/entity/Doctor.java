package stl.tech.Doctor.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	
	private String DoctorFirstName;
	
	private String DoctorLastName;
	
	private String Specialization;
	
	 
	public int getDid()
	{
		return did;
	}

	public void setdid(int did) {
		this.did = did;
	}

	
    public String getSpecialization()
	{
		return Specialization;
	}

	public void setSpecialization(String Specialization) {
		this.Specialization = Specialization;
	}

	public String getDoctorFirstName() {
		return DoctorFirstName;
	}

	public void setDoctorFirstName(String DoctorFirstName) 
	{
		this.DoctorFirstName = DoctorFirstName;
	}

	public String getDoctorLastName() {
		return DoctorLastName;
	}

	public void setDoctorLastName(String doctorLastName) 
	{
		DoctorLastName = doctorLastName;
	}

	public Doctor(int did, String doctorFirstName, String doctorLastName, String specialization) {
		super();
		this.did = did;
		DoctorFirstName = doctorFirstName;
		DoctorLastName = doctorLastName;
		Specialization = specialization;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Doctor [Did=" + did + ", DoctorFirstName=" + DoctorFirstName + ", DoctorLastName=" + DoctorLastName
				+ ", Specialization=" + Specialization + "]";
	}
	
	

	
	
	
	
	

	

	
	

	
	
	
	
	
	
	

}
