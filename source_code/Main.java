import stack.TreatmentRecord;
import stack.TreatmentStack;

public class Main {

    public static void main(String[] args) {

        TreatmentStack treatmentStack = new TreatmentStack();

        treatmentStack.addTreatmentRecord(
                new TreatmentRecord(
                        1001,
                        "Nooha",
                        "Medicine Given"
                )
        );

        treatmentStack.addTreatmentRecord(
                new TreatmentRecord(
                        1002,
                        "Ali",
                        "Painkillers"
                )
        );

        treatmentStack.addTreatmentRecord(
                new TreatmentRecord(
                        1003,
                        "Sara",
                        "Injection"
                )
        );

        treatmentStack.displayTreatmentHistory();

        treatmentStack.removeLatestTreatment();

        treatmentStack.displayTreatmentHistory();
    }
}
