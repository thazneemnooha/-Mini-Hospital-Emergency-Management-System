import bst.Patient;
import queue.EmergencyQueue;

public class Main {

    public static void main(String[] args) {

        EmergencyQueue emergencyQueue = new EmergencyQueue();

        Patient patient1 =
                new Patient(
                        1001,
                        "Nooha",
                        22,
                        "0771234567",
                        "Fever"
                );

        Patient patient2 =
                new Patient(
                        1002,
                        "Ali",
                        20,
                        "0722222222",
                        "Headache"
                );

        Patient patient3 =
                new Patient(
                        1003,
                        "Sara",
                        24,
                        "0711111111",
                        "Flu"
                );

        emergencyQueue.enqueue(patient1);
        emergencyQueue.enqueue(patient2);
        emergencyQueue.enqueue(patient3);

        emergencyQueue.displayQueue();

        emergencyQueue.dequeue();

        emergencyQueue.displayQueue();
    }
}