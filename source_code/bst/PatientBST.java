package bst;

public class PatientBST {

    private BSTNode root;

    // INSERT PATIENT

        public boolean patientExists(int patientId) {
        return search(patientId) != null;
    }

    public void insert(Patient patient) {
        root = insertRecursive(root, patient);
    }

    private BSTNode insertRecursive(BSTNode current, Patient patient) {

        if (current == null) {
            return new BSTNode(patient);
        }

        if (patient.getPatientId() < current.patient.getPatientId()) {
            current.left = insertRecursive(current.left, patient);
        }
        else if (patient.getPatientId() > current.patient.getPatientId()) {
            current.right = insertRecursive(current.right, patient);
        }
        else {
            System.out.println("Patient ID already exists!");
        }

        return current;
    }

    // SEARCH PATIENT

    public Patient search(int patientId) {

        BSTNode node = searchRecursive(root, patientId);

        if (node != null) {
            return node.patient;
        }

        return null;
    }

    private BSTNode searchRecursive(BSTNode current, int patientId) {

        if (current == null) {
            return null;
        }

        if (current.patient.getPatientId() == patientId) {
            return current;
        }

        if (patientId < current.patient.getPatientId()) {
            return searchRecursive(current.left, patientId);
        }

        return searchRecursive(current.right, patientId);
    }

    // DISPLAY ALL PATIENTS

    public void displayPatients() {

        if (root == null) {
            System.out.println("\nNo patient records available.");
            return;
        }

        System.out.println("\n===== PATIENT RECORDS =====");

        inorderTraversal(root);
    }

    private void inorderTraversal(BSTNode current) {

        if (current != null) {

            inorderTraversal(current.left);

            System.out.println(current.patient);

            inorderTraversal(current.right);
        }
    }

    // DELETE PATIENT

    public void delete(int patientId) {
        root = deleteRecursive(root, patientId);
    }

    private BSTNode deleteRecursive(BSTNode current, int patientId) {

        if (current == null) {
            return null;
        }

        if (patientId < current.patient.getPatientId()) {
            current.left = deleteRecursive(current.left, patientId);
        }

        else if (patientId > current.patient.getPatientId()) {
            current.right = deleteRecursive(current.right, patientId);
        }

        else {

            // No Child

            if (current.left == null && current.right == null) {
                return null;
            }

            // One Child

            if (current.left == null) {
                return current.right;
            }

            if (current.right == null) {
                return current.left;
            }

            // Two Children

            Patient smallestPatient = findSmallest(current.right);

            current.patient = smallestPatient;

            current.right = deleteRecursive(
                    current.right,
                    smallestPatient.getPatientId());
        }

        return current;
    }

    private Patient findSmallest(BSTNode node) {

        while (node.left != null) {
            node = node.left;
        }

        return node.patient;
    }
}