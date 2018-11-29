

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

        //fake
        getTripContext().getTrip().setPayment(new PaymentCheck(BigDecimal.valueOf(20000), 1050));
        System.out.println("Paid 20000 by check.");

        getTripContext().changeState(new TripStateAddThankYou(getTripContext()));
        return TripStateLoop.Status.Continue;
    }
}
