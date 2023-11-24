package Vaccines;

import Vaccines.Vaccine;

import java.time.LocalDate;

public class ModCov extends Vaccine {
    public ModCov(LocalDate currentDate){
        super(currentDate);
        this.location = "Epping";

        administrator.add("doctor");
        administrator.add("nurse");

        dates.add(currentDate.plusDays(5));
        dates.add(currentDate.plusDays(11));
    }

    public void display(){
        for (int i=0;i<dates.size();i++){
            String s = Integer.toString(i+1);
            System.out.println("Moderna, Dose number: " + s +", "+location+", "+dates.get(i).toString()+ ", " +administrator.get(i));
        }
    }
}
