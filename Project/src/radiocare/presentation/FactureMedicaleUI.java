package radiocare.presentation;

import java.util.Scanner;

import radiocare.entities.FactureMedicale;
import radiocare.entities.FactureMedicale.StatutPaiement;

public class FactureMedicaleUI {
	public static FactureMedicale saisie() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le id du Patient  ");
		int id=sc.nextInt();
		System.out.println("donner le idRDV  ");
		int idRDV=sc.nextInt();
		System.out.println("donner le montantHT  ");
		double HT=sc.nextInt();
		System.out.println("donner le montantTTC  ");
		double TTC =sc.nextInt();
		System.out.println("donner partAssurance  ");
		double pa =sc.nextInt();
		System.out.println("donner partPatient  ");
		double pp=sc.nextInt();
		System.out.println("donner statutPaiement  ");
		StatutPaiement st = StatutPaiement.valueOf(sc.nextLine());
		return new FactureMedicale(id, idRDV, HT, TTC, pa, pa, st);
	}
}
