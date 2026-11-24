package radiocare;

import radiocare.entities.Patient;
import radiocare.repositories.PatientDAO;
import radiocare.services.PatientService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PatientService patientService = new PatientService();
        PatientDAO patientDAO = new PatientDAO();

        // 1. Ajout d'un patient avec un historique initial
        List<Integer> historiqueInitial = new ArrayList<>(Arrays.asList(101, 102));
        Patient p1 = new Patient(
                12345678,
                "Ben Ali",
                "Sami",
                "1995-04-12",
                20123456,
                "sami@example.com",
                98765,
                150.0,
                historiqueInitial
        );

        patientService.ajouterPatient(p1);
        System.out.println("Ajout OK -> " + patientService.rechercherPatient(12345678).getHistoriqueExamensIDs());

        // 2. Ajout d'un examen via le DAO
        patientDAO.ajouterHistoriqueExamensIDs(12345678, 103);
        patientDAO.ajouterHistoriqueExamensIDs(12345678, 102); // doublon -> ignoré
        System.out.println("Apres ajout examen -> " + patientService.rechercherPatient(12345678).getHistoriqueExamensIDs());

        // 3. Modification du patient (l'historique doit rester conservé)
        Patient p1Modifie = new Patient(
                12345678,
                "Ben Ali",
                "Sami",
                "1995-04-12",
                29999999,
                "sami.new@example.com",
                98765,
                200.0,
                new ArrayList<>()
        );

        patientService.modifierPatient(p1Modifie);
        Patient apresModif = patientService.rechercherPatient(12345678);
        System.out.println("Apres modifierPatient -> Tel: " + apresModif.getTelephone()
                + ", Historique: " + apresModif.getHistoriqueExamensIDs());

        // 4. Suppression du patient
        patientService.supprimerPatient(12345678);
        System.out.println("Apres suppression -> " + patientService.rechercherPatient(12345678));
    }
}