package radiocare.entities;

public class ExamenMedical {

    public enum LibelleExamen {
      irm_cerebrale, scanner_thoracique,echo_abdominale, rx_poumon
    }
    private static int compteur = 0;
    private int idExamen;
    private String codeActe;
    private LibelleExamen libelle;
    private int dureeEstimeeMinutes;
    private double tarifHT;
    
	public ExamenMedical(String codeActe, LibelleExamen libelle, int dureeEstimeeMinutes,
			double tarifHT) {
		super();
		compteur++;
		this.idExamen = compteur;
		this.codeActe = codeActe;
		this.libelle = libelle;
		this.dureeEstimeeMinutes = dureeEstimeeMinutes;
		this.tarifHT = tarifHT;
	}
	public int getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}
	public String getCodeActe() {
		return codeActe;
	}
	public void setCodeActe(String codeActe) {
		this.codeActe = codeActe;
	}
	public LibelleExamen getLibelle() {
		return libelle;
	}
	public void setLibelle(LibelleExamen libelle) {
		this.libelle = libelle;
	}
	public int getDureeEstimeeMinutes() {
		return dureeEstimeeMinutes;
	}
	public void setDureeEstimeeMinutes(int dureeEstimeeMinutes) {
		this.dureeEstimeeMinutes = dureeEstimeeMinutes;
	}
	public double getTarifHT() {
		return tarifHT;
	}
	public void setTarifHT(double tarifHT) {
		this.tarifHT = tarifHT;
	}
    
}