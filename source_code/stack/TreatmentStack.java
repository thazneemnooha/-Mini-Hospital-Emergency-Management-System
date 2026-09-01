package stack;

import java.util.Stack;

public class TreatmentStack {

    private Stack<TreatmentRecord> treatmentStack;

    public TreatmentStack() {
        treatmentStack = new Stack<>();
    }

    // Push

    public void addTreatmentRecord(TreatmentRecord record) {

        treatmentStack.push(record);

        System.out.println("\nTreatment record added successfully.");
    }

    // Pop

    public TreatmentRecord removeLatestTreatment() {

        if (treatmentStack.isEmpty()) {

            System.out.println("\nNo treatment records available.");

            return null;
        }

        TreatmentRecord record = treatmentStack.pop();

        System.out.println("\nLatest treatment removed:");
        System.out.println(record);

        return record;
    }

    // Display Stack

    public void displayTreatmentHistory() {

        if (treatmentStack.isEmpty()) {

            System.out.println("\nNo treatment history available.");

            return;
        }

        System.out.println("\n====================================");
        System.out.println("       TREATMENT HISTORY");
        System.out.println("====================================");

        for (int i = treatmentStack.size() - 1; i >= 0; i--) {

            System.out.println(treatmentStack.get(i));
        }
    }

    public boolean isEmpty() {
        return treatmentStack.isEmpty();
    }
}