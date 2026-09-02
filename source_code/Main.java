import linkedlist.Visit;
import linkedlist.VisitHistory;

public class Main {

    public static void main(String[] args) {

        VisitHistory history = new VisitHistory();

        history.addVisit(
            new Visit(
                501,
                "2025-08-01",
                "Dr. Perera",
                "Fever",
                "Tablets"
            )
        );

        history.addVisit(
            new Visit(
                502,
                "2025-08-15",
                "Dr. Silva",
                "Flu",
                "Injection"
            )
        );

        history.displayVisits();

        System.out.println("\nSearching Visit 501");

        Visit found = history.searchVisit(501);

        if(found != null) {
            System.out.println(found);
        }

        history.removeVisit(502);

        history.displayVisits();
    }
}