/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import dip.lab2.student.solution1.ServiceTipCalculator.ServiceQuality;

/**
 *
 * @author alvaradog
 */
public class Person {
    ServiceTipCalculator foodCalculator;
    ServiceTipCalculator baggageCalculator;
    private String fNname;
    private String lName;
    ServiceQuality q;

    public Person(String fNname, String lName, double billAmt, int bagCount, ServiceQuality q) {
        this.fNname = fNname;
        this.lName = lName;
        foodCalculator = new FoodServiceTipCalculator (q, billAmt);
        baggageCalculator = new BaggageServiceTipCalculator(q,bagCount);
    }

    public String getfNname() {
        return fNname;
    }

    public void setfNname(String fNname) {
        this.fNname = fNname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }    
    
}
