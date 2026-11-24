package radiocare.presentation.PatientUI;

import java.util.Scanner;

public class PatientSupprimerUI {
	public static int supprimer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer le CIN du patient a suprimer : ");
		int CIN = sc.nextInt();
		sc.close();
		return CIN;
		
		
	}
}
