package radiocare.presentation;

import java.util.Scanner;

import radiocare.entities.Patient;
import radiocare.entities.ManipulateurRadio;
import radiocare.entities.ManipulateurRadio.Habilitation;

public class ManipulateurRadioUI {
	public static ManipulateurRadio saisie () {
		Scanner sc =new Scanner(System.in) ; 
		System.out.println("donner  idManip ");
		int  idManip  = sc.nextInt();
		System.out.println("donner   cin");
		int cin  = sc.nextInt();
		System.out.println("donner  nom");
		String nom = sc.nextLine();
		System.out.println("donner prenom");
		String prenom = sc.nextLine();
		System.out.println("donner l'habilitation");
		Habilitation h =Habilitation.valueOf(sc.nextLine()) ; 
		System.out.println("donner   cin");
		double tarifHoraire   = sc.nextDouble();
		System.out.println("donner la statutDispo");
		boolean statutDispo =sc.hasNextBoolean(); 
		return new  ManipulateurRadio(idManip, prenom, nom, prenom, h, tarifHoraire, statutDispo) ;
		
		
	}

}
