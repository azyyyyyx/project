package radiocare.presentation;

import java.util.Scanner;

import radiocare.entities.EquipementImagerie;
import radiocare.entities.EquipementImagerie.StatutEquipement;
import radiocare.entities.EquipementImagerie.TypeEquipement;

public class EquipementImagerieUI {
	public static EquipementImagerie saisie() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le type d'equipement  ");
		TypeEquipement type = TypeEquipement.valueOf(sc.nextLine());
		System.out.println("donner le marque  ");
		String marque=sc.nextLine();
		System.out.println("donner heures cumulees  ");
		double heuresc=sc.nextInt();
		System.out.println("donner heures restants maintenance  ");
		double heuresr=sc.nextInt();
		System.out.println("donner la statu  ");
		StatutEquipement status=StatutEquipement.valueOf(sc.nextLine());
		sc.close();
		return new EquipementImagerie(type, marque, heuresc, heuresr, status);
	}
}