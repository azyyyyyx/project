package radiocare.services;

import radiocare.repositories.PatientDAO;
import radiocare.entities.Patient;
import java.util.ArrayList;

public class PatientService {
	
	private PatientDAO patientDAO =new PatientDAO();
	

	public void ajouterPatient(Patient p) {
		if (patientDAO.rechercherPatient(p.getCin())!=null) {
			throw new IllegalArgumentException("Patient Deja EXistant");
		}
		patientDAO.create(p);
	}
	
	
	public ArrayList<Patient> afficherPatients(){
		return patientDAO.read();	
	}
	
	public void modifierPatient(Patient p) {
	    Patient old = patientDAO.rechercherPatient(p.getCin());
	    if (old == null) {
	        throw new IllegalArgumentException("Patient n'existe pas");
	    }
	    patientDAO.update(p);
	    if (old.getHistoriqueExamensIDs() != null) {
	        for (int id : old.getHistoriqueExamensIDs()) {
	            patientDAO.ajouterHistoriqueExamensIDs(p.getCin(), id);
	        }
	    }
	}
	
	public Patient rechercherPatient(int CIN) {
		return patientDAO.rechercherPatient(CIN);
	}
	
	public void supprimerPatient(int CIN) {
		if(rechercherPatient(CIN)==null) {
			throw new IllegalArgumentException("Patient n'existe pas");
		}
		patientDAO.delete(CIN);
	}
	
	public double resteAPayer(int CIN) {
		Patient p = patientDAO.rechercherPatient(CIN);
		return p.getSoldeCompte();
	}
	
}
