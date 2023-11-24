package Vaccines;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Vaccine {
    protected LocalDate currentDate;
    protected String location;
    protected ArrayList<String> administrator = new ArrayList<>();
    protected ArrayList<LocalDate> dates = new ArrayList<>();

    public Vaccine(LocalDate currentDate) {
        this.currentDate = currentDate;
    }
    public abstract void display();
}
