package radiocare.presentation;

import java.util.Scanner;

import radiocare.entities.MedecinRadiologue;
import radiocare.entities.MedecinRadiologue.Specialite;


public class MedecinRadiologueUI {
	
	public static MedecinRadiologue saisie() {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner le cin  ");
		int cin=sc.nextInt();
		System.out.println("donner le nom  ");
		String nom =sc.nextLine();
		System.out.println("donner le prenom  ");
		String prenom=sc.nextLine();
		System.out.println("donner la specialite  ");
		Specialite spec=Specialite.valueOf(sc.nextLine()); //Speacialite.valueOf : tbadel el string l enum
		System.out.println("donner le tarifPourcentageActe  ");
		double tarif=sc.nextInt();
		System.out.println("disponibilite  ");
		boolean dispo = sc.nextBoolean();
		sc.close();
		return new MedecinRadiologue(cin, nom, prenom, spec, tarif, dispo);
		}
}
