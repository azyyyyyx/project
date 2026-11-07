package radiocare.entities;

public class ManipulateurRadio {

    public enum Habilitation {
        irm, scanner, rayon_x
    }

    private int idManip;
    private int cin;
    private String nom;
    private String prenom;
    private Habilitation[] habilitations;
    private double tarifHoraire;
    private boolean statutDispo;
	public ManipulateurRadio(int idManip, String cin, String nom, String prenom, Habilitation[] habilitations,
			double tarifHoraire, boolean statutDispo) {
		super();
		this.idManip = idManip;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.habilitations = habilitations;
		this.tarifHoraire = tarifHoraire;
		this.statutDispo = statutDispo;
	}
	public int getIdManip() {
		return idManip;
	}
	public void setIdManip(int idManip) {
		this.idManip = idManip;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
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
	public Habilitation[] getHabilitations() {
		return habilitations;
	}
	public void setHabilitations(Habilitation[] habilitations) {
		this.habilitations = habilitations;
	}
	public double getTarifHoraire() {
		return tarifHoraire;
	}
	public void setTarifHoraire(double tarifHoraire) {
		this.tarifHoraire = tarifHoraire;
	}
	public boolean isStatutDispo() {
		return statutDispo;
	}
	public void setStatutDispo(boolean statutDispo) {
		this.statutDispo = statutDispo;
	}
    
    
}