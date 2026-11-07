package radiocare.entities;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private int cin;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private int telephone;
    private String email;
    private int numAssurance;
    private double soldeCompte;
    private List<Integer> historiqueExamensIDs = new ArrayList<>();

    public Patient(int cin, String nom, String prenom, String dateNaissance,
                   int telephone, String email, int numAssurance,
                   double soldeCompte) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.telephone = telephone;
        this.email = email;
        this.numAssurance = numAssurance;
        this.soldeCompte = soldeCompte;
    }

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumAssurance() {
		return numAssurance;
	}

	public void setNumAssurance(int numAssurance) {
		this.numAssurance = numAssurance;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public List<Integer> getHistoriqueExamensIDs() {
		return historiqueExamensIDs;
	}

	public void setHistoriqueExamensIDs(List<Integer> historiqueExamensIDs) {
		this.historiqueExamensIDs = historiqueExamensIDs;
	}

	
}