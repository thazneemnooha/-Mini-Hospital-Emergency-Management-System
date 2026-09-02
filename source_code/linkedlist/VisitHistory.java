package linkedlist;

public class VisitHistory {

    private Visit head;

    // Add Visit

    public void addVisit(Visit newVisit) {

        if (head == null) {
            head = newVisit;
        }
        else {

            Visit current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newVisit;
        }

        System.out.println("\nVisit added successfully.");
    }

    // Search Visit

    public Visit searchVisit(int visitId) {

        Visit current = head;

        while (current != null) {

            if (current.getVisitId() == visitId) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    // Remove Visit

    public void removeVisit(int visitId) {

        if (head == null) {

            System.out.println("\nNo visit history available.");

            return;
        }

        if (head.getVisitId() == visitId) {

            head = head.next;

            System.out.println("\nVisit removed successfully.");

            return;
        }

        Visit current = head;

        while (current.next != null &&
               current.next.getVisitId() != visitId) {

            current = current.next;
        }

        if (current.next == null) {

            System.out.println("\nVisit not found.");

            return;
        }

        current.next = current.next.next;

        System.out.println("\nVisit removed successfully.");
    }

    // Display Visits

    public void displayVisits() {

        if (head == null) {

            System.out.println("\nNo visit history available.");

            return;
        }

        System.out.println("\n====================================");
        System.out.println("         PATIENT VISITS");
        System.out.println("====================================");

        Visit current = head;

        while (current != null) {

            System.out.println(current);

            current = current.next;
        }
    }
}