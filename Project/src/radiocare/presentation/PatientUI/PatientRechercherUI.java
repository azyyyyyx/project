package radiocare.presentation.PatientUI;

import java.util.Scanner;

public class PatientRechercherUI {
	public static int rechercher() {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer le CIN du patient a chercher : ");
		int CIN = sc.nextInt();
		sc.close();
		return CIN;
	}

}
