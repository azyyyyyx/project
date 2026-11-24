package radiocare.services;

import radiocare.repositories.FactureMedicaleDAO;

import java.util.ArrayList;

import radiocare.entities.FactureMedicale;

public class FactureMedicaleService {
	
	private FactureMedicaleDAO factureMedicaleDAO = new FactureMedicaleDAO();
	
	public void ajouterFacture(FactureMedicale f) {
		if(factureMedicaleDAO.rechercherFactureMedicale(f.getNumFacture())==null) {
			return;
		}else {
			factureMedicaleDAO.create(f);
		}
	}
	
	public ArrayList<FactureMedicale> afficherFactures(){
		return factureMedicaleDAO.read();
	}
	
	public void modifierFacture(FactureMedicale f) {
		if(factureMedicaleDAO.rechercherFactureMedicale(f.getNumFacture())==null) {
			return;
		}else {
			factureMedicaleDAO.update(f);
		}
	} 
	
	public void supprimerFacture(FactureMedicale f) {
		if(factureMedicaleDAO.rechercherFactureMedicale(f.getNumFacture())==null) {
			factureMedicaleDAO.delete(f.getNumFacture());
		}
	}
	
	public double[] bilanPatient(int cin) {
		double total =0 , assurance =0, payee=0 , reste=0;
		for(FactureMedicale f : factureMedicaleDAO.read()) {
			if (f.getIdPatient()!=cin)
				continue;
			total += f.getMontantTTC();
			assurance += f.getPartAssurance();
			if(f.getStatutPaiement().equals("payee")) {
				payee += f.getPartPatient();
			}else {
				reste += f.getPartPatient();
			}
		}
		return new double[] {total, assurance, payee, reste};
		
	}

	public void supprimerFactureMedicale(int NumFacture) {
		if(factureMedicaleDAO.rechercherFactureMedicale(NumFacture)!=null) {
			factureMedicaleDAO.delete(NumFacture);
		}
	}

}
