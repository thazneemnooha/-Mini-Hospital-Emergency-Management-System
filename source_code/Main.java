import bst.Patient;
import bst.PatientBST;

public class Main {

    public static void main(String[] args) {

        PatientBST patientBST = new PatientBST();

        patientBST.insert(
                new Patient(
                        1001,
                        "Nooha",
                        22,
                        "0771234567",
                        "Fever")
        );

        patientBST.insert(
                new Patient(
                        1003,
                        "Sara",
                        24,
                        "0711111111",
                        "Flu")
        );

        patientBST.insert(
                new Patient(
                        1002,
                        "Ali",
                        20,
                        "0722222222",
                        "Headache")
        );

        patientBST.displayPatients();

        System.out.println("\nSearching Patient 1002");

        Patient patient = patientBST.search(1002);

        if (patient != null) {
            System.out.println(patient);
        }

        System.out.println("\nDeleting Patient 1003");

        patientBST.delete(1003);

        patientBST.displayPatients();
    }
}