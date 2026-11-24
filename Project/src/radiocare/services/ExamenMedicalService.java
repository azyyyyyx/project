package radiocare.services;

import java.util.ArrayList;

import radiocare.entities.ExamenMedical;
import radiocare.repositories.ExamenMedicalDAO;

public class ExamenMedicalService {
	
	private ExamenMedicalDAO examenMedicalDAO = new ExamenMedicalDAO();

	public void ajouterExamenMedical(ExamenMedical e) {
		if(examenMedicalDAO.rechercherExamen(e.getIdExamen())==null) {
			examenMedicalDAO.create(e);
		}
		return;
	}
	
	public ArrayList<ExamenMedical> afficherExamens(){
		return examenMedicalDAO.read();
	}
	
	public ExamenMedical rechercherExamen(int id) {
		return examenMedicalDAO.rechercherExamen(id);
	}
	
	public void modifierExam(ExamenMedical e) {
		examenMedicalDAO.update(e);
	}
	
	public void supprimerExam(int id) {
		if(examenMedicalDAO.rechercherExamen(id)!=null) {
			examenMedicalDAO.delete(id);
		}
	}
}

