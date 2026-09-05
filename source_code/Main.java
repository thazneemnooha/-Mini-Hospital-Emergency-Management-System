import java.util.Scanner;

import bst.Patient;
import bst.PatientBST;

import queue.EmergencyQueue;

import stack.TreatmentRecord;
import stack.TreatmentStack;

import linkedlist.Visit;
import linkedlist.VisitHistory;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PatientBST patientBST = new PatientBST();
        EmergencyQueue emergencyQueue = new EmergencyQueue();
        TreatmentStack treatmentStack = new TreatmentStack();

        int choice;

        do {

            System.out.println("\n=========================================");
            System.out.println(" MINI HOSPITAL EMERGENCY MANAGEMENT SYSTEM");
            System.out.println("=========================================");

            System.out.println("1. Register New Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. Display All Patients");

            System.out.println("\n5. Add Patient To Emergency Queue");
            System.out.println("6. Treat Next Patient");
            System.out.println("7. Display Waiting Queue");

            System.out.println("\n8. Add Treatment Record");
            System.out.println("9. View Treatment History");
            System.out.println("10. Remove Latest Treatment");

            System.out.println("\n11. Add Visit History");
            System.out.println("12. Search Visit");
            System.out.println("13. Remove Visit");
            System.out.println("14. Display Visit History");

            System.out.println("\n0. Exit");

            System.out.print("\nEnter Choice : ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                // REGISTER PATIENT

                case 1:

                    System.out.print("Patient ID : ");
                    int patientId = input.nextInt();
                    input.nextLine();

                    System.out.print("Patient Name : ");
                    String name = input.nextLine();

                    System.out.print("Age : ");
                    int age = input.nextInt();
                    input.nextLine();

                    System.out.print("Contact Number : ");
                    String contact = input.nextLine();

                    System.out.print("Medical Condition : ");
                    String condition = input.nextLine();

                    Patient patient = new Patient(
                            patientId,
                            name,
                            age,
                            contact,
                            condition
                    );

                    patientBST.insert(patient);

                    System.out.println("\nPatient Registered Successfully.");
                    break;

                // SEARCH

                case 2:

                    System.out.print("Enter Patient ID : ");
                    int searchId = input.nextInt();

                    Patient foundPatient =
                            patientBST.search(searchId);

                    if (foundPatient != null) {
                        System.out.println(foundPatient);
                    } else {
                        System.out.println("\nPatient not found.");
                    }

                    break;

                // DELETE

                case 3:

                    System.out.print("Enter Patient ID : ");
                    int deleteId = input.nextInt();

                    patientBST.delete(deleteId);

                    System.out.println("Patient Deleted.");
                    break;

                // DISPLAY

                case 4:

                    patientBST.displayPatients();
                    break;

                // QUEUE

                case 5:

                    System.out.print("Enter Patient ID : ");
                    int queueId = input.nextInt();

                    Patient queuePatient =
                            patientBST.search(queueId);

                    if (queuePatient != null) {
                        emergencyQueue.enqueue(queuePatient);
                    }
                    else {
                        System.out.println("\nPatient not found.");
                    }

                    break;

                case 6:

                    emergencyQueue.dequeue();
                    break;

                case 7:

                    emergencyQueue.displayQueue();
                    break;

                // STACK

                case 8:

                    System.out.print("Patient ID : ");
                    int treatmentId = input.nextInt();
                    input.nextLine();

                    Patient treatmentPatient =
                            patientBST.search(treatmentId);

                    if (treatmentPatient == null) {

                        System.out.println("\nPatient not found.");
                        break;
                    }

                    System.out.print("Treatment : ");
                    String treatment = input.nextLine();

                    treatmentStack.addTreatmentRecord(
                            new TreatmentRecord(
                                    treatmentPatient.getPatientId(),
                                    treatmentPatient.getPatientName(),
                                    treatment
                            )
                    );

                    break;

                case 9:

                    treatmentStack.displayTreatmentHistory();
                    break;

                case 10:

                    treatmentStack.removeLatestTreatment();
                    break;

                // VISIT HISTORY

                case 11:

                    System.out.print("Patient ID : ");
                    int visitPatientId = input.nextInt();
                    input.nextLine();

                    Patient visitPatient =
                            patientBST.search(visitPatientId);

                    if (visitPatient == null) {

                        System.out.println("\nPatient not found.");
                        break;
                    }

                    VisitHistory history =
                            visitPatient.getVisitHistory();

                    System.out.print("Visit ID : ");
                    int visitId = input.nextInt();
                    input.nextLine();

                    System.out.print("Visit Date : ");
                    String date = input.nextLine();

                    System.out.print("Doctor Name : ");
                    String doctor = input.nextLine();

                    System.out.print("Diagnosis : ");
                    String diagnosis = input.nextLine();

                    System.out.print("Treatment : ");
                    String visitTreatment = input.nextLine();

                    history.addVisit(
                            new Visit(
                                    visitId,
                                    date,
                                    doctor,
                                    diagnosis,
                                    visitTreatment
                            )
                    );

                    break;

                case 12:

                    System.out.print("Patient ID : ");
                    int patientForSearch = input.nextInt();

                    Patient p1 =
                            patientBST.search(patientForSearch);

                    if (p1 == null) {

                        System.out.println("\nPatient not found.");
                        break;
                    }

                    System.out.print("Visit ID : ");
                    int visitSearchId = input.nextInt();

                    Visit foundVisit =
                            p1.getVisitHistory()
                                    .searchVisit(visitSearchId);

                    if (foundVisit != null) {
                        System.out.println(foundVisit);
                    } else {
                        System.out.println("\nVisit not found.");
                    }

                    break;

                case 13:

                    System.out.print("Patient ID : ");
                    int patientForDelete = input.nextInt();

                    Patient p2 =
                            patientBST.search(patientForDelete);

                    if (p2 == null) {

                        System.out.println("\nPatient not found.");
                        break;
                    }

                    System.out.print("Visit ID : ");
                    int removeVisitId = input.nextInt();

                    p2.getVisitHistory()
                            .removeVisit(removeVisitId);

                    break;

                case 14:

                    System.out.print("Patient ID : ");
                    int patientForDisplay = input.nextInt();

                    Patient p3 =
                            patientBST.search(patientForDisplay);

                    if (p3 == null) {

                        System.out.println("\nPatient not found.");
                        break;
                    }

                    p3.getVisitHistory()
                            .displayVisits();

                    break;

                case 0:

                    System.out.println("\nThank you for using the system.");
                    break;

                default:

                    System.out.println("\nInvalid choice.");
            }

        } while (choice != 0);

        input.close();
    }
}