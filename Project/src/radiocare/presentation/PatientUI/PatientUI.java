package radiocare.presentation.PatientUI;


import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import radiocare.Exception.CinNumberException;
import radiocare.Exception.NegativeAge;
import radiocare.Exception.ShortName;
import radiocare.entities.ExamenMedical;
import radiocare.entities.Patient;
public class PatientUI {
	
	
	
	public static int choice() {
		Scanner sc=new Scanner(System.in);
		System.out.println("----Gestion des patients----");
		System.out.println("1.Ajouter un patient.");
		System.out.println("2.Modifier un patient.");
		System.out.println("3.Supprimer un patient.");
		System.out.println("4.Rechercher un patient.");
		int choix=sc.nextInt();
		sc.close();
		return choix;
		
	}
	
	public void ajouter() throws ShortName, CinNumberException{
		PatientCreateUI.add();
	}
	
	public void supprimer() {
		PatientSupprimerUI.supprimer();
	}
	
	public void rechercher() {
		PatientRechercherUI.rechercher();
	}
	
	
	public static void afficheFiche(Patient p, ArrayList<ExamenMedical> exams, double[] bilan) {
		System.out.println("=====Fiche patient=====");
		System.out.println("Nom    : "+p.getNom());
		System.out.println("Prenom    : "+p.getPrenom());
		System.out.println("CIN     : "+p.getCin());
		System.out.println("Date de naisance              : "+p.getDateNaissance());
		System.out.println("Telephone    : "+p.getTelephone());
		System.out.println("Email   : "+p.getEmail());
		System.out.println("Num assurance : "+p.getNumAssurance());
		System.out.println("Le reste a payer : "+p.getSoldeCompte());
		System.out.println("Historique des examen medical :");
		for(ExamenMedical e : exams) {
			System.out.println(e.getLibelle());
		}
		System.out.println("montant total  : " + bilan[0]);
		System.out.println("part assurance : " + bilan[0]);
		System.out.println("montant payee  : " + bilan[0]);
		System.out.println("reste          : " + bilan[0]);
	}
	
	
	
	public static void introuvable() {
		System.out.println("patient untrouvale");
	}
	
	public static void afficheMessage(String m) {
		System.out.println(m);
	}

}
