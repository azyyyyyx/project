package radiocare.repositories;

import java.util.ArrayList;
import radiocare.entities.ExamenMedical;

public class ExamenMedicalDAO {
	
	private ArrayList<ExamenMedical> ExamenMedicals = new ArrayList<ExamenMedical>();

	public void create(ExamenMedical e) {
		ExamenMedicals.add(e);
	}
	
	public ExamenMedical rechercherExamen(int id) {
		for(ExamenMedical e:ExamenMedicals) {
			if(e.getIdExamen()==id) {
				return e;
			}
		}
		return null;
	}
	
	public ArrayList<ExamenMedical> read(){
		return new ArrayList<>(ExamenMedicals);
	}
	
	public void update(ExamenMedical e) {
		for(int i =0;i<ExamenMedicals.size();i++) {
			if(ExamenMedicals.get(i).getIdExamen()==e.getIdExamen()) {
				ExamenMedicals.set(i, e);
			}
		}
	}
	
	public void delete(int id) {
		int i=0;
		for(ExamenMedical e : ExamenMedicals) {
			if(e.getIdExamen()==id) {
				ExamenMedicals.remove(i);
			}
			i++;
		}
	}

}
