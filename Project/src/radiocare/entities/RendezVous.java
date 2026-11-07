package radiocare.entities;

public class RendezVous {
	private static int compteur = 0;
	private int idRDV;
    private String date;
    private String heureDebut;
    private int dureeMinutes;
    private int idPatient;
    private int idMedecin;
    private int idManip;
    private int idSalle;
    private int idExamen;
    private StatutRDV statut;
	public RendezVous(String date, String heureDebut, int dureeMinutes, int idPatient, int idMedecin,
			int idManip, int idSalle, int idExamen, StatutRDV statut) {
		super();
		compteur++;
		this.idRDV = compteur;
		this.date = date;
		this.heureDebut = heureDebut;
		this.dureeMinutes = dureeMinutes;
		this.idPatient = idPatient;
		this.idMedecin = idMedecin;
		this.idManip = idManip;
		this.idSalle = idSalle;
		this.idExamen = idExamen;
		this.statut = statut;
	}
    public int getIdRDV() {
		return idRDV;
	}
	public void setIdRDV(int idRDV) {
		this.idRDV = idRDV;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}
	public int getDureeMinutes() {
		return dureeMinutes;
	}
	public void setDureeMinutes(int dureeMinutes) {
		this.dureeMinutes = dureeMinutes;
	}
	public int getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}
	public int getIdMedecin() {
		return idMedecin;
	}
	public void setIdMedecin(int idMedecin) {
		this.idMedecin = idMedecin;
	}
	public int getIdManip() {
		return idManip;
	}
	public void setIdManip(int idManip) {
		this.idManip = idManip;
	}
	public int getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}
	public int getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}
	public StatutRDV getStatut() {
		return statut;
	}
	public void setStatut(StatutRDV statut) {
		this.statut = statut;
	}
	public enum StatutRDV {
        planifie,en_cours,realise,annule
    }

    
    
    
}
