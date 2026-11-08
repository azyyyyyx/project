package radiocare.presentation;

import java.util.Scanner;

import radiocare.entities.Paiement;
import radiocare.entities.Paiement.ModePaiement;

public class PaiementUI {
	public static Paiement saisie() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("donner numFacture  ");
		 int numfacture=sc.nextInt();
	     System.out.println("donner datePaiement  ");
	 	 String date=sc.nextLine();
		 System.out.println("donner montantReçu  ");
		 double montant=sc.nextInt();
		 System.out.println("donner le mode du paiement  ");
		 ModePaiement mode =ModePaiement.valueOf(sc.nextLine());
		 System.out.println("donner referenceTextuellePreuve  ");
		 String ref=sc.nextLine();
		 sc.close();
		 return new Paiement(numfacture, date, montant, mode, ref);
	}
}