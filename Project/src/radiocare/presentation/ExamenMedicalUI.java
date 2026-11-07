package radiocare.presentation;

import java.util.Scanner;

import radiocare.entities.ExamenMedical;
import radiocare.entities.ExamenMedical.LibelleExamen;

public class ExamenMedicalUI {	
	public static ExamenMedical saisie() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner code Acte  ");
		String codeActe=sc.nextLine();
		System.out.println("donner le libelle d'examen  ");
		LibelleExamen L=LibelleExamen.valueOf(sc.nextLine());
		System.out.println("donner la dureeEstimeeMinutes  ");
		int duree=sc.nextInt();
		System.out.println("donner le tarifHT  ");
		double tarif=sc.nextInt();
		sc.close();
		return new ExamenMedical(codeActe, L, duree, tarif);
	}

}
