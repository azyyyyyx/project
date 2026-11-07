package radiocare.entities;
public class MedecinRadiologue {

    private int idMedecin;
    private String cin;
    private String nom;
    private String prenom;
    private String specialite;          // Neuroradiologie, Ostéo, Thoracique
    private double tarifPourcentageActe;
    private boolean dispoPlanning;
	public MedecinRadiologue(int idMedecin, String cin, String nom, String prenom, String specialite,
			double tarifPourcentageActe, boolean dispoPlanning) {
		super();
		this.idMedecin = idMedecin;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
		this.tarifPourcentageActe = tarifPourcentageActe;
		this.dispoPlanning = dispoPlanning;
	}
	public int getIdMedecin() {
		return idMedecin;
	}
	public void setIdMedecin(int idMedecin) {
		this.idMedecin = idMedecin;
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
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public double getTarifPourcentageActe() {
		return tarifPourcentageActe;
	}
	public void setTarifPourcentageActe(double tarifPourcentageActe) {
		this.tarifPourcentageActe = tarifPourcentageActe;
	}
	public boolean isDispoPlanning() {
		return dispoPlanning;
	}
	public void setDispoPlanning(boolean dispoPlanning) {
		this.dispoPlanning = dispoPlanning;
	}
}