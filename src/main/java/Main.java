import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("John Molecules", true, true);
        Patient patient2 = new Patient("Jill Biomedenhall", true,false);
        patient1.displayAppointments();
        System.out.println();
        patient2.displayAppointments();
    }
}
