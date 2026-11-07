package radiocare.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import radiocare.entities.Patient;

public class PatientUI {
	public static Patient saisie () {
		Scanner sc =new Scanner(System.in) ; 
		System.out.println("donner la matricule CIN  ");
		int cin  = sc.nextInt(); 	 
		System.out.println("donner le nom ");
		String nom =sc.nextLine(); 
		System.out.println("donner le prenom ");
		String prenom =sc.nextLine(); 
		System.out.println("donner la date de naissance  ");
		String dateNaissance =sc.nextLine(); 
		System.out.println("donner le numero de telephone  ");
		int telephone =sc.nextInt(); 
		System.out.println("donner le email ");
		String email=sc.nextLine(); 
		System.out.println("donner le numAssurance ");
		int numAssurance=sc.nextInt(); 
		System.out.println("donner le soldeCompte ");
		double soldeCompte=sc.nextInt();
		System.out.println("donner le nombre d'examens dans l'historique ");
		int nb = sc.nextInt();
		List<Integer> historique = new ArrayList<>();
		for (int i = 1; i <= nb; i++) {
		    System.out.println("donner l'ID de l'examen " + i + " ");
		    historique.add(sc.nextInt());
		}
		return new Patient(cin,nom,prenom,dateNaissance,telephone,email,numAssurance,soldeCompte,historique);
	}
}
