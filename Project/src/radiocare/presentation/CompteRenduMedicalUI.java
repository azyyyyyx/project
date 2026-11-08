package radiocare.presentation;

import java.util.Scanner;

import radiocare.entities.CompteRenduMedical;
import radiocare.entities.CompteRenduMedical.CodeResultat;

public class CompteRenduMedicalUI {
	public static CompteRenduMedical saisie() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner ID Rendez Vous  ");
		int idrd=sc.nextInt();
		System.out.println("donner le date  ");
		String date=sc.nextLine();
		System.out.println("donner le refOrdonnanceTextuelle  ");
		String ref =sc.nextLine();
		System.out.println("donner la transcriptionDiagnosticTextuel  ");
		String trans =sc.nextLine();
		System.out.println("donner le code Resultat  ");
		CodeResultat code = CodeResultat.valueOf(sc.nextLine());
		sc.close();
		return new CompteRenduMedical(idrd, date, ref, trans, code);
	}
}
