package poe.pickles;

import java.util.Date;
import java.util.Random;

//Concrete TripState class to create a new trip.
public class TripStateCreate extends TripState {
    public TripStateCreate(TripContext context){
        super(context, Status.Create);

        Trip trip = new Trip();

        trip.setBookedOn(new Date());
        trip.setOrderId(new Random().nextInt(1000));
        trip.setTripStateStatus(Status.Create);

        getTripContext().setTrip(trip);
    }

    @Override
    public TripStateLoop.Status execute() {
        System.out.println();
        System.out.println("*** NEW TRIP CREATED ***");
        getTripContext().changeState(new TripStateAddDestinations(getTripContext()));

        return TripStateLoop.Status.Continue;
    }
}
