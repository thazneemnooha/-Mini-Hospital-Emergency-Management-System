package linkedlist;

public class Visit {

    private int visitId;
    private String visitDate;
    private String doctorName;
    private String diagnosis;
    private String treatment;

    Visit next;

    public Visit(int visitId, String visitDate,
                 String doctorName,
                 String diagnosis,
                 String treatment) {

        this.visitId = visitId;
        this.visitDate = visitDate;
        this.doctorName = doctorName;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.next = null;
    }

    public int getVisitId() {
        return visitId;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    @Override
    public String toString() {

        return "\n----------------------------------" +
               "\nVisit ID   : " + visitId +
               "\nDate       : " + visitDate +
               "\nDoctor     : " + doctorName +
               "\nDiagnosis  : " + diagnosis +
               "\nTreatment  : " + treatment +
               "\n----------------------------------";
    }
}