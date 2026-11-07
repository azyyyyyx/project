package radiocare.presentation;

import java.util.Scanner;

import radiocare.entities.RendezVous;
import radiocare.entities.RendezVous.StatutRDV;

public class RendezVousUI {
	public static RendezVous saisie() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le date  ");
		String date=sc.nextLine();
		System.out.println("donner heure de debut  ");
		String heured=sc.nextLine();
		System.out.println("donner dureeMinutes  ");
		int duree=sc.nextInt();
		System.out.println("donner idPatient  ");
		int idP=sc.nextInt();
		System.out.println("donner idMedecin  ");
		int idMed=sc.nextInt();
		System.out.println("donner idManip  ");
		int idMan=sc.nextInt();
		System.out.println("donner idSalle  ");
		int idS=sc.nextInt();
		System.out.println("donner idExamen  ");
		int idE=sc.nextInt();
		System.out.println("donner statut  ");
		StatutRDV statut=StatutRDV.valueOf(sc.nextLine());
		sc.close();
		return new RendezVous(date, heured, duree, idP, idMed, idMan, idS, idE, statut);
		
	}
}
