
package dip.lab2.student.solution1;


public abstract class ServiceTipCalculator {
    
    private final double MIN_BILL = 0.00;
    private final double GOOD_RATE = 0.20;
    private final double FAIR_RATE = 0.15;
    private final double POOR_RATE = 0.10;
    private double bill;
    private ServiceQuality serviceQuality; 
    
    public final double getMIN_BILL() {
        return MIN_BILL;
    }

    public final double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public final double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public final void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }

    public final double getPOOR_RATE() {
        return POOR_RATE;
    }

    public final double getBill() {
        return bill;
    }

    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    
    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }
    
    public final void setBill(double billAmt){
        if (checkForError(billAmt)==true){
            System.exit(0);
        }
       this.bill = billAmt;
    }
    
    public abstract boolean checkForError(double billAmt);

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
}
