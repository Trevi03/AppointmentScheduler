import Vaccines.ModCov;
import Vaccines.PfiFlu;
import Vaccines.Vaccine;

import java.time.LocalDate;
import java.util.ArrayList;

public class Patient {
    private String name;
    private ArrayList<Vaccine> vaccines = new ArrayList<>();
    private LocalDate currentDate;

    Patient(String name, Boolean pfizer, Boolean moderna){
        this.name = name;
        currentDate = LocalDate.now();
        if (pfizer){
            vaccines.add(new PfiFlu(currentDate));
        }
        if (moderna){
            vaccines.add(new ModCov(currentDate));
        }
    }

    public void displayAppointments(){
        System.out.println("Patient name: " +this.name);
        System.out.println("initial appointment: " +this.currentDate);
        for (int i=0;i<vaccines.size();i++){
            vaccines.get(i).display();
        }
    }
}
