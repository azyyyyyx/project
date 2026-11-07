package radiocare.entities;
public class CompteRenduMedical {

    private int idCompteRendu;
    private int idRDV;
    private String date;
    private String refOrdonnanceTextuelle;
    private String transcriptionDiagnosticTextuel;
    private String codeResultat;
	public CompteRenduMedical(int idCompteRendu, int idRDV, String date, String refOrdonnanceTextuelle,
			String transcriptionDiagnosticTextuel, String codeResultat) {
		super();
		this.idCompteRendu = idCompteRendu;
		this.idRDV = idRDV;
		this.date = date;
		this.refOrdonnanceTextuelle = refOrdonnanceTextuelle;
		this.transcriptionDiagnosticTextuel = transcriptionDiagnosticTextuel;
		this.codeResultat = codeResultat;
	}
	public int getIdCompteRendu() {
		return idCompteRendu;
	}
	public void setIdCompteRendu(int idCompteRendu) {
		this.idCompteRendu = idCompteRendu;
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
	public String getRefOrdonnanceTextuelle() {
		return refOrdonnanceTextuelle;
	}
	public void setRefOrdonnanceTextuelle(String refOrdonnanceTextuelle) {
		this.refOrdonnanceTextuelle = refOrdonnanceTextuelle;
	}
	public String getTranscriptionDiagnosticTextuel() {
		return transcriptionDiagnosticTextuel;
	}
	public void setTranscriptionDiagnosticTextuel(String transcriptionDiagnosticTextuel) {
		this.transcriptionDiagnosticTextuel = transcriptionDiagnosticTextuel;
	}
	public String getCodeResultat() {
		return codeResultat;
	}
	public void setCodeResultat(String codeResultat) {
		this.codeResultat = codeResultat;
	}
}