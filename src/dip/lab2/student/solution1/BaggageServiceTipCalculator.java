package dip.lab2.student.solution1;

public class BaggageServiceTipCalculator extends ServiceTipCalculator{
    private double baseTipPerBag;
    private int bagCount;
    private final double MAX_BILL = 100.00;
    private final String BILL_ENTRY_ERR =
            "Error: bill must be between " + getMIN_BILL() + " and "
            + MAX_BILL;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    public final double getMAX_BILL() {
        return MAX_BILL;
    }

    public final String getBILL_ENTRY_ERR() {
        return BILL_ENTRY_ERR;
    }

    public final double getTipForBaggeHandler(ServiceQuality serviceQuality) {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + getGOOD_RATE());
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + getFAIR_RATE());
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + getPOOR_RATE());
                break;
        }

        return tip;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    @Override
    public final boolean checkForError(double billAmt){
        boolean error = false;
        if (billAmt <= getMIN_BILL() && getMAX_BILL() <= billAmt){
            System.out.println(getBILL_ENTRY_ERR());
            
        }
        return error;
    }

}
