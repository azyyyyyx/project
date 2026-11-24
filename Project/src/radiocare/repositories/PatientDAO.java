package radiocare.repositories;

import java.util.ArrayList;
import radiocare.entities.Patient;

public class PatientDAO {
	
	private ArrayList<Patient> patients = new ArrayList<>();
	
	public void create(Patient p) {
			patients.add(p);
	}
	
	public Patient rechercherPatient(int CIN) {
		for(Patient P : patients) {
			if(P.getCin()==CIN) {
				return P;
			}
		}
		return null;
	}
	
	public ArrayList<Patient> read() {
		return new ArrayList<>(patients);
	}
	
	public void update(Patient p) {
		for(int i=0;i<patients.size();i++) {
			if(patients.get(i).getCin()==p.getCin()) {
				patients.set(i, p);
				return;
			}
		}
	}
	
	public void delete(int CIN) {
		int i=0;
		for(Patient P : patients) {
			if(P.getCin()==CIN) {
				patients.remove(i);
				return;
			}
			i++;
		}
	}
}

