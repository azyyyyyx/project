package radiocare.entities;

public class EquipementImagerie {
	private int id;
	private String type,marque;
	private int heuresCumules;
	private int heuresRestantesMaintenance;
	private String statut;
	
	public EquipementImagerie(int id, String type, String marque, int heuresCumules, int heuresRestantesMaintenance,
			String statut) {
		super();
		this.id = id;
		this.type = type;
		this.marque = marque;
		this.heuresCumules = heuresCumules;
		this.heuresRestantesMaintenance = heuresRestantesMaintenance;
		this.statut = statut;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getHeuresCumules() {
		return heuresCumules;
	}
	public void setHeuresCumules(int heuresCumules) {
		this.heuresCumules = heuresCumules;
	}
	public int getHeuresRestantesMaintenance() {
		return heuresRestantesMaintenance;
	}
	public void setHeuresRestantesMaintenance(int heuresRestantesMaintenance) {
		this.heuresRestantesMaintenance = heuresRestantesMaintenance;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
}
