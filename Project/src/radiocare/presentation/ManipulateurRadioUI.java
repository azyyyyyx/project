package radiocare.presentation;

import java.util.Scanner;

import radiocare.entities.Patient;
import radiocare.entities.ManipulateurRadio;
import radiocare.entities.ManipulateurRadio.Habilitation;

public class ManipulateurRadioUI {
	public static ManipulateurRadio saisie () {
		Scanner sc =new Scanner(System.in) ; 
		System.out.println("donner   cin");
		int cin  = sc.nextInt();
		System.out.println("donner  nom");
		String nom = sc.nextLine();
		System.out.println("donner prenom");
		String prenom = sc.nextLine();
		System.out.println("combien d'habilitations ? ");
        int nb = sc.nextInt();
        Habilitation[] h=new Habilitation[nb];
        for (int i=1;i<=nb;i++) {
        	h[i]=Habilitation.valueOf(sc.nextLine());
        }
		System.out.println("donner   cin");
		double tarifHoraire   = sc.nextDouble();
		System.out.println("donner la statutDispo");
		boolean statutDispo =sc.hasNextBoolean();
		return new ManipulateurRadio(cin, nom, prenom, h, tarifHoraire, statutDispo);
	}
}
