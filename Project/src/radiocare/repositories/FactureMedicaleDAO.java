package radiocare.repositories;

import java.util.ArrayList;

import radiocare.entities.FactureMedicale;


public class FactureMedicaleDAO {
	
	private ArrayList<FactureMedicale> facturesmedicales=new ArrayList<>();
	
	
	public void create(FactureMedicale p) {
		facturesmedicales.add(p);
	}
	
	public  FactureMedicale rechercherFactureMedicale(int NumFacture) {
		for(FactureMedicale P : facturesmedicales) {
			if(P.getNumFacture()==NumFacture) {
				return P;
			}
		}
		return null;
	}
	
	public ArrayList<FactureMedicale> read() {
		return new ArrayList<>(facturesmedicales);
	}
	
	public void update(FactureMedicale f) {
		for(int i=0;i<facturesmedicales.size();i++) {
			if(facturesmedicales.get(i).getNumFacture()==f.getNumFacture()) {
				facturesmedicales.set(i, f);
				return;
			}
		}
	}
	
	public void delete(int numf) {
		int i=0;
		for(FactureMedicale f : facturesmedicales) {
			if(f.getNumFacture()==numf) {
				facturesmedicales.remove(i);
				return;
			}
			i++;
		}
	}
	
	
	
}
