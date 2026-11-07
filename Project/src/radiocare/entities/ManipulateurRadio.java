package radiocare.entities;

public class ManipulateurRadio {
	private int id;
	private int cin;
	private String nom,prenom,habilitations;
	private double tarif;
	private boolean dispo;
	
	public ManipulateurRadio(int id, int cin, String nom, String prenom, String habilitations, double tarif,
			boolean dispo) {
		super();
		this.id = id;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.habilitations = habilitations;
		this.tarif = tarif;
		this.dispo = dispo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getHabilitations() {
		return habilitations;
	}

	public void setHabilitations(String habilitations) {
		this.habilitations = habilitations;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
}
