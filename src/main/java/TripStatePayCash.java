

import java.math.BigDecimal;
import java.util.Scanner;

///     Concrete TripState class to accept cash payment.
///     This is obviously not complete - doesn't actually accept
///     payment - that's hardcoded in this example.
public class TripStatePayCash extends TripState {
    public TripStatePayCash(TripContext context){
        super(context, Status.PayCash);
    }

    @Override
    public TripStateLoop.Status execute() {
        System.out.println(System.lineSeparator());
        System.out.println("*** ACCEPT CASH PAYMENT ***");
        System.out.println();
        System.out.println("- COMMAND: [later] to return later or amount");
        System.out.println();

        //fake
        getTripContext().getTrip().setPayment(new PaymentCash(BigDecimal.valueOf(Packages.getTotalAmount())));
        System.out.println("Amount Due: "+"$"+ Packages.getTotalAmount());
        System.out.println("Enter Amount: ");
        double input = new Scanner(System.in).nextDouble();
        if(input != Packages.getTotalAmount())
        {
            System.out.println("Enter the correct amount!");
        }

        getTripContext().changeState(new TripStateAddThankYou(getTripContext()));
        return TripStateLoop.Status.Continue;
    }
}
