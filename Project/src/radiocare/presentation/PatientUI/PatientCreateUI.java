package radiocare.presentation.PatientUI;


import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import radiocare.Exception.CinNumberException;
import radiocare.Exception.ShortName;
import radiocare.entities.Patient;

public class PatientCreateUI {
	public static Patient add()  {
	    Scanner sc = new Scanner(System.in);
	    Patient p = null;
	    
	    try {
	        System.out.println("Donner votre nom");
	        String nom = sc.nextLine();
	        if (nom == null || nom.length() < 3) {
	            throw new ShortName("Le nom est trop court !");
	        }

	        System.out.println("entrer votre prenom : ");
	        String prenom = sc.nextLine();
	        if (prenom == null || prenom.length() < 3) {
	            throw new ShortName("Le prenom est trop court !");
	        }
	        
	        System.out.println("entrer ton CIN : ");
	        int CIN = sc.nextInt();
	        String cinStr = String.valueOf(CIN);
	        if (cinStr.length() != 8) {
	            throw new CinNumberException("Erreur : Le CIN doit comporter exactement 8 chiffres !");
	        }

	        System.out.println("entrer le num de telephone : ");
	        int Telephone = sc.nextInt();
	        String telStr = String.valueOf(Telephone);
	        if (telStr.length() != 8) {
	            throw new CinNumberException("Erreur : Le Telephone doit comporter exactement 8 chiffres !");
	        }
	        
	        System.out.println("entrer le num de assurance : ");
	        int NumAssurance = sc.nextInt();
	        
	        System.out.println("entrer le solde du compte : ");
	        double SoldeCompte = sc.nextDouble();
	        sc.nextLine();
	        System.out.println("entrer ton email : ");
	        String Email = sc.nextLine();
	        System.out.println("entrer le date de naissance (dd-MM-yyyy) : ");
	        String str = sc.nextLine();
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        String DateNaissance = sc.nextLine();
	        p = new Patient(CIN, nom, prenom, DateNaissance, Telephone, Email, NumAssurance, SoldeCompte, null);
	    } catch (ShortName ex) {
	        System.out.println("Erreur Nom/Prénom : " + ex.getMessage());
	    } catch (CinNumberException exx) {
	        System.out.println("Erreur de saisie / format : " + exx.getMessage());
	    } catch (Exception ex) {
	        System.out.println("Erreur inattendue : " + ex.getMessage());
	    } finally {
	        if (p == null) {
	            System.out.println("--> [FINALLY] Échec de la création. Patient par défaut initialisé.");
	            p = new Patient(0, null, null, null, 0, null, 0, 0, null); 
	        } else {
	            System.out.println("--> [FINALLY] Patient ajouté avec succès !");
	        }
	    }
	    return p;
	}
}