package poe.pickles;

import java.math.BigDecimal;
import java.util.Scanner;

///     Concrete TripState class to accept check payment.
///     This is obviously not complete - doesn't actually accept
///     payment - that's hardcoded in this example.
public class TripStatePayCheck extends TripState {
    public TripStatePayCheck(TripContext context){
        super(context, Status.PayCheck);
    }

    @Override
    public TripStateLoop.Status execute(){
        System.out.println(System.lineSeparator());
        System.out.println("*** ACCEPT CHECK PAYMENT ***");
        System.out.println();
        System.out.println("- COMMAND: [later] to return later or amount");
        System.out.println();

        System.out.println("Total Amount: "+ BigDecimal.valueOf(Packages.getInstance().computeTotal()));
        System.out.println("Enter the amount: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println("Enter Check number");
        int checkNumber = new Scanner(System.in).nextInt();

        getTripContext().getTrip().setPayment(new PaymentCheck(BigDecimal.valueOf(Packages.getInstance().total), checkNumber));
        if(!BigDecimal.valueOf(input).equals(Packages.getInstance().total))
        {
            System.out.println("Enter the correct amount");
        }

        getTripContext().changeState(new TripStateAddThankYou(getTripContext()));
        return TripStateLoop.Status.Continue;
    }
}
