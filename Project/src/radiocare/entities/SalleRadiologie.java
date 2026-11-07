package radiocare.entities;
public class SalleRadiologie {

    private int idSalle;
    private String nom;
    private int numeroEtage;
    private String typeSalle;
    private int equipementAttribueID;
    private double normeBlindagePlomb;
    private boolean statutDispo;
	public SalleRadiologie(int idSalle, String nom, int numeroEtage, String typeSalle, int equipementAttribueID,
			double normeBlindagePlomb, boolean statutDispo) {
		super();
		this.idSalle = idSalle;
		this.nom = nom;
		this.numeroEtage = numeroEtage;
		this.typeSalle = typeSalle;
		this.equipementAttribueID = equipementAttribueID;
		this.normeBlindagePlomb = normeBlindagePlomb;
		this.statutDispo = statutDispo;
	}
	public int getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumeroEtage() {
		return numeroEtage;
	}
	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}
	public String getTypeSalle() {
		return typeSalle;
	}
	public void setTypeSalle(String typeSalle) {
		this.typeSalle = typeSalle;
	}
	public int getEquipementAttribueID() {
		return equipementAttribueID;
	}
	public void setEquipementAttribueID(int equipementAttribueID) {
		this.equipementAttribueID = equipementAttribueID;
	}
	public double getNormeBlindagePlomb() {
		return normeBlindagePlomb;
	}
	public void setNormeBlindagePlomb(double normeBlindagePlomb) {
		this.normeBlindagePlomb = normeBlindagePlomb;
	}
	public boolean isStatutDispo() {
		return statutDispo;
	}
	public void setStatutDispo(boolean statutDispo) {
		this.statutDispo = statutDispo;
	}

   
}