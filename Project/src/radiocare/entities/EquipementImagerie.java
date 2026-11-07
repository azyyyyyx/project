package radiocare.entities;

public class EquipementImagerie {

    public enum TypeEquipement {
        irm, scanner_ct, table_rx, ECHOGRAPHE
    }

    public enum StatutEquipement {
        en_service, en_panne, en_maintenance
    }

    private int idEquipement;
    private TypeEquipement type;
    private String marque;
    private double heuresCumulees;
    private double heuresRestantesMaintenance;
    private StatutEquipement statut;
	public EquipementImagerie(int idEquipement, TypeEquipement type, String marque, double heuresCumulees,
			double heuresRestantesMaintenance, StatutEquipement statut) {
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
	public TypeEquipement getType() {
		return type;
	}
	public void setType(TypeEquipement type) {
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
	public StatutEquipement getStatut() {
		return statut;
	}
	public void setStatut(StatutEquipement statut) {
		this.statut = statut;
	}
    
}
