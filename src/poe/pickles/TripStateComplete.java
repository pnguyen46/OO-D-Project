package poe.pickles;

///     Concrete TripState class to indicate Trip is now complete.
///     Once here, the state loop call should be stopped to avoid
///     infinite loop.
public class TripStateComplete extends TripState {
    public TripStateComplete(TripContext context){
        super(context, Status.Complete);
    }

    @Override
    public TripStateLoop.Status execute() {
        System.out.println(System.lineSeparator());
        System.out.println("*** COMPLETE - ITINERARY AVAILABLE ***");
        System.out.println();

        //this is the end, so stop looping
        return TripStateLoop.Status.Stop;
    }
}
