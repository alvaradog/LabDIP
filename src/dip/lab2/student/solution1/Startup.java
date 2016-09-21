package dip.lab2.student.solution1;

// An useful import if you need it.
//import dip.lab2.*;
import static dip.lab2.student.solution1.ServiceTipCalculator.ServiceQuality.FAIR;
import static dip.lab2.student.solution1.ServiceTipCalculator.ServiceQuality.GOOD;
import static dip.lab2.student.solution1.ServiceTipCalculator.ServiceQuality.POOR;
//import java.text.NumberFormat;
// Another useful import if you need it.
//import javax.swing.JOptionPane;

public class Startup {
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
 
    public static void main(String[] args) {
        
        Person bob = new Person ("Bob","Petterson",50,2,FAIR);
//        Person lisa = new Person ("Lisa","Floyd", 60.00,5,POOR);
    }

}
