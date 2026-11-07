package radiocare.entities;
public class EquipementImagerie {

    private int idEquipement;
    private String type;                       // IRM, Scanner-CT, Table-RX, Échographe
    private String marque;
    private double heuresCumulees;
    private double heuresRestantesMaintenance;
    private String statut;                     // En Service, En Panne, En Maintenance
	public EquipementImagerie(int idEquipement, String type, String marque, double heuresCumulees,
			double heuresRestantesMaintenance, String statut) {
		super();
		this.idEquipement = idEquipement;
		this.type = type;
		this.marque = marque;
		this.heuresCumulees = heuresCumulees;
		this.heuresRestantesMaintenance = heuresRestantesMaintenance;
		this.statut = statut;
	}
	public int getIdEquipement() {
		return idEquipement;
	}
	public void setIdEquipement(int idEquipement) {
		this.idEquipement = idEquipement;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public double getHeuresCumulees() {
		return heuresCumulees;
	}
	public void setHeuresCumulees(double heuresCumulees) {
		this.heuresCumulees = heuresCumulees;
	}
	public double getHeuresRestantesMaintenance() {
		return heuresRestantesMaintenance;
	}
	public void setHeuresRestantesMaintenance(double heuresRestantesMaintenance) {
		this.heuresRestantesMaintenance = heuresRestantesMaintenance;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
}