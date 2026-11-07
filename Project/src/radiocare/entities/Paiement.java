package radiocare.entities;

public class Paiement {

    public enum ModePaiement {
        especes, cheque, carte, virement
    }
    private static int compteur = 0;
    private int idPaiement;
    private int numFacture;
    private String datePaiement;
    private double montantRecu;
    private ModePaiement modePaiement;
    private String referenceTextuellePreuve;
	public Paiement(int numFacture, String datePaiement, double montantRecu, ModePaiement modePaiement,
			String referenceTextuellePreuve) {
		super();
		compteur++;
		this.idPaiement = compteur;
		this.numFacture = numFacture;
		this.datePaiement = datePaiement;
		this.montantRecu = montantRecu;
		this.modePaiement = modePaiement;
		this.referenceTextuellePreuve = referenceTextuellePreuve;
	}
	public int getIdPaiement() {
		return idPaiement;
	}
	public void setIdPaiement(int idPaiement) {
		this.idPaiement = idPaiement;
	}
	public int getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(int numFacture) {
		this.numFacture = numFacture;
	}
	public String getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(String datePaiement) {
		this.datePaiement = datePaiement;
	}
	public double getMontantRecu() {
		return montantRecu;
	}
	public void setMontantRecu(double montantRecu) {
		this.montantRecu = montantRecu;
	}
	public ModePaiement getModePaiement() {
		return modePaiement;
	}
	public void setModePaiement(ModePaiement modePaiement) {
		this.modePaiement = modePaiement;
	}
	public String getReferenceTextuellePreuve() {
		return referenceTextuellePreuve;
	}
	public void setReferenceTextuellePreuve(String referenceTextuellePreuve) {
		this.referenceTextuellePreuve = referenceTextuellePreuve;
	}
}