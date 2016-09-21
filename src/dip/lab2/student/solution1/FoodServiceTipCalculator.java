package dip.lab2.student.solution1;

public class FoodServiceTipCalculator extends ServiceTipCalculator{
    
    private final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + getMIN_BILL();
    
    public final String getBILL_ENTRY_ERR() {
        return BILL_ENTRY_ERR;
    }

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        setServiceRating(q);
        setBill(billAmt);
    }
    
    @Override
    public final boolean checkForError(double billAmt){
        boolean error;
        if (billAmt <= getMIN_BILL()){
            System.out.println(getBILL_ENTRY_ERR());
            error = true;
        } else {
            error = false;
        }
        return error;
    }
}
