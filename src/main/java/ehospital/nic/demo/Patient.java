package ehospital.nic.demo;

public class Patient {

	String id;
	String patientName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Patient(String id, String patientName) {
		super();
		this.id = id;
		this.patientName = patientName;
	}
	
}
