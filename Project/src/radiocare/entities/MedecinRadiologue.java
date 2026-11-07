package radiocare.entities;

public class MedecinRadiologue {

    public enum Specialite {
        neuroradiologie, osteo, thoracique
    }

    private int idMedecin;
    private int cin;
    private String nom;
    private String prenom;
    private Specialite specialite;
    private double tarifPourcentageActe;
    private boolean dispoPlanning;
	public MedecinRadiologue(int idMedecin, int cin, String nom, String prenom, Specialite specialite,
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
	public Specialite getSpecialite() {
		return specialite;
	}
	public void setSpecialite(Specialite specialite) {
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