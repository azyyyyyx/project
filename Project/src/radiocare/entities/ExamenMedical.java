package radiocare.entities;
public class ExamenMedical {

    private int idExamen;
    private String codeActe;
    private String libelle;      // IRM Cérébrale, Scanner Thoracique, Écho Abdominale, RX Poumon
    private int dureeEstimeeMinutes;
    private double tarifHT;
	public ExamenMedical(int idExamen, String codeActe, String libelle, int dureeEstimeeMinutes, double tarifHT) {
		super();
		this.idExamen = idExamen;
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
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
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