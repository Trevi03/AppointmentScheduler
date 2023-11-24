package Vaccines;

import java.time.LocalDate;
import java.util.ArrayList;

public class PfiFlu extends Vaccine {
    public PfiFlu(LocalDate currentDate){
        super(currentDate);
        this.location = "Southwell";

        administrator.add("nurse");
        administrator.add("doctor");
        administrator.add("doctor");

        dates.add(currentDate.plusDays(5));
        dates.add(currentDate.plusDays(9));
        dates.add(currentDate.plusDays(13));
    }
    @Override
    public void display(){
        for (int i=0;i<dates.size();i++){
            String s = Integer.toString(i+1);
            System.out.println("Pfizer, Dose number: "+ s +", "+location+", "+dates.get(i).toString()+ ", " +administrator.get(i));
        }
    }
}
