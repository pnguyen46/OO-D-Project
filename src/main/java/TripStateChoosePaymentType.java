

import java.util.Scanner;

///     Concrete TripState class to choose payment type.
///     Changes state conditionally.
public class TripStateChoosePaymentType extends TripState {

    public TripStateChoosePaymentType(TripContext context){
        super(context, Status.ChoosePaymentType);
    }

    @Override
    public TripStateLoop.Status execute() {
        System.out.println(System.lineSeparator());
        System.out.println("*** CHOOSE PAYMENT TYPE ***");
        System.out.println();
        System.out.println("- COMMAND: [later] to return later, [cash] or [check]");

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            String paymentType = new String();

            if(scanner.hasNext())
                paymentType = scanner.next().trim();

            if (returnLater(paymentType)) return TripStateLoop.Status.Stop; //exit loop and method

            //empty entry does nothing
            if (paymentType.isEmpty()) continue;

            if (paymentType.equals("cash"))
            {
                getTripContext().changeState(new TripStatePayCash(getTripContext()));
                return TripStateLoop.Status.Continue;
            }

            if (paymentType.equals("check"))
            {
                getTripContext().changeState(new TripStatePayCheck(getTripContext()));
                return TripStateLoop.Status.Continue;
            }

            System.out.println("- ERROR: [later], [cash], or [check]");
        }
    }
}
