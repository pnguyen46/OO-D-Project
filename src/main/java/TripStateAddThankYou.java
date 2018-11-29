

import java.util.Scanner;

/// <summary>
///     Concrete TripState class to add thank you note.
///     Technically, validation and input should be
///     performed in other classes to keep responsibilities
///     single, but this will demonstrate the basic idea.
/// </summary>
public class TripStateAddThankYou extends TripState {
    public TripStateAddThankYou(TripContext context){
        super(context, Status.AddThankYou);
    }

    private boolean IsThankYouValid(String thankYou) {
        if (thankYou.isEmpty()){
            System.out.println("- ERROR: Thank You cannot be empty");
            return false;
        }

        if (thankYou.length() < 5) {
            System.out.println("- ERROR: Thank you must be at least 5 characters");
            return false;
        }

        return true;
    }


    @Override
    public TripStateLoop.Status execute() {
        System.out.println(System.lineSeparator());
        System.out.println("*** ADD THANK YOU ***");
        System.out.println();
        System.out.println("- COMMAND: [later] to return later or write thank you note (5 chars min)");

        Scanner scanner = new Scanner(System.in);
        boolean getThankYou = true;
        String thankYou = null;



        while (getThankYou) {
            thankYou = scanner.nextLine().trim();

            //come back later?
            if (returnLater(thankYou)) return TripStateLoop.Status.Stop;

            //stop if we can change state
            getThankYou = !IsThankYouValid(thankYou);
        }

        getTripContext().getTrip().setThankYou(thankYou);
        getTripContext().changeState(new TripStateComplete(getTripContext()));
        return TripStateLoop.Status.Continue;
    }
}
