package radiocare.presentation;

import java.util.Scanner;

import radiocare.entities.SalleRadiologie;



public class SalleRadiologieUI {
	public static SalleRadiologie saisie() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner nom  ");
		String nom=sc.nextLine();
		System.out.println("donner numeroEtage ");
		int numeroEtage=sc.nextInt();
		System.out.println("donner typeSalle  ");
		String typeSalle =sc.nextLine();
		System.out.println("donner equipementAttribueID ");
		int equipementAttribueID=sc.nextInt();
		System.out.println("donner statutDispo");
		boolean statutDispo =sc.hasNextBoolean(); 	
		sc.close();
		return new SalleRadiologie(nom, numeroEtage, typeSalle, equipementAttribueID, equipementAttribueID, statutDispo); 
	}
}
