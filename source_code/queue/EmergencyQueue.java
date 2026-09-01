package queue;

import bst.Patient;
import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<Patient> queue;

    public EmergencyQueue() {
        queue = new LinkedList<>();
    }

    // Add patient to emergency queue
    public void enqueue(Patient patient) {

        queue.offer(patient);

        System.out.println("\nPatient added to emergency queue successfully.");
    }

    // Remove next patient for treatment
    public Patient dequeue() {

        if (queue.isEmpty()) {

            System.out.println("\nNo patients waiting in the emergency queue.");

            return null;
        }

        Patient patient = queue.poll();

        System.out.println("\nNext patient sent for treatment:");
        System.out.println(patient);

        return patient;
    }

    // Display all waiting patients
    public void displayQueue() {

        if (queue.isEmpty()) {

            System.out.println("\nEmergency queue is empty.");

            return;
        }

        System.out.println("\n====================================");
        System.out.println("     EMERGENCY WAITING QUEUE");
        System.out.println("====================================");

        int count = 1;

        for (Patient patient : queue) {

            System.out.println(
                    count + ". " +
                    patient.getPatientName() +
                    " (ID: " +
                    patient.getPatientId() + ")"
            );

            count++;
        }
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Number of waiting patients
    public int getQueueSize() {
        return queue.size();
    }
}