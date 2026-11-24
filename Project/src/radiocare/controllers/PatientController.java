package radiocare.controllers;

import java.util.ArrayList;

import radiocare.entities.ExamenMedical;
import radiocare.entities.Patient;
import radiocare.presentation.PatientUI.PatientCreateUI;
import radiocare.presentation.PatientUI.PatientRechercherUI;
import radiocare.presentation.PatientUI.PatientSupprimerUI;
import radiocare.presentation.PatientUI.PatientUI;
import radiocare.services.ExamenMedicalService;
import radiocare.services.FactureMedicaleService;
import radiocare.services.PatientService;



public class PatientController {
	
	private PatientService patientService = new PatientService();
	private ExamenMedicalService examenMedicalService = new ExamenMedicalService();
	private FactureMedicaleService factureMedicaleService = new FactureMedicaleService();
	
	
	public void init() {
		Patient p = PatientCreateUI.add();
		try {
			patientService.ajouterPatient(p);
			PatientUI.afficheMessage("Patient ajoute");
		} catch(IllegalArgumentException e){
			PatientUI.afficheMessage(e.getMessage());
		}
	}
	
	public void sup() {
		int CIN = PatientSupprimerUI.supprimer();
		try {
			patientService.supprimerPatient(CIN);
			PatientUI.afficheMessage("Patient supprimee");
		} catch (IllegalArgumentException e) {
			PatientUI.afficheMessage(e.getMessage());
		}
		
	}
	
	public void rechercher() {
		int CIN = PatientRechercherUI.rechercher();
		Patient p = patientService.rechercherPatient(CIN);
		if(p==null) {
			PatientUI.introuvable();
		}else {
			ArrayList<ExamenMedical> exams=new ArrayList<>();
			for (int id : p.getHistoriqueExamensIDs()) {
				exams.add(examenMedicalService.rechercherExamen(id));
			}
			double[] bilan = factureMedicaleService.bilanPatient(CIN);
			PatientUI.afficheFiche(p,exams,bilan);
		}
		
	}
	
	
	
	
	public void mod() {
		Patient p = PatientCreateUI.add();
		try {
			patientService.modifierPatient(p);
			PatientUI.afficheMessage("Patient modifier");
		} catch(IllegalArgumentException e){
			PatientUI.afficheMessage(e.getMessage());
		}

	}
	
	
	
	
}
