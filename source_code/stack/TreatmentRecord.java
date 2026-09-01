package stack;

public class TreatmentRecord {

    private int patientId;
    private String patientName;
    private String treatment;

    public TreatmentRecord(int patientId, String patientName, String treatment) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.treatment = treatment;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getTreatment() {
        return treatment;
    }

    @Override
    public String toString() {

        return "\n----------------------------------" +
               "\nPatient ID : " + patientId +
               "\nName       : " + patientName +
               "\nTreatment  : " + treatment +
               "\n----------------------------------";
    }
}