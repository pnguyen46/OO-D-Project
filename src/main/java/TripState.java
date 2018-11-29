

//Abstract class for TripState machine.
//Holds reference to TripContext.
public abstract class TripState {
    private TripContext _tripContext;
    protected TripState(TripContext tripContext, Status tripStateStatus){
        _tripContext = tripContext;

        if(_tripContext.getTrip() != null)
            tripContext.getTrip().setTripStateStatus(tripStateStatus);
    }

    public TripContext getTripContext() {
        return _tripContext;
    }
    public void setTripContext(TripContext tripContext){
        _tripContext = tripContext;
    }

    public abstract TripStateLoop.Status execute();

    ///     Return later helper... used in a few places,
    ///     so moved to base class to eliminate redundant code
    protected boolean returnLater(String answer){
        boolean returnLater = answer.toLowerCase().equals("later");

        if(returnLater){
            System.out.println();
            System.out.println("*** RETURN LATER TO FINISH ***");
        }

        return returnLater;
    }
    /// <summary>
    ///     states a trip can be in.
    ///     create = first state
    ///     complete = last state
    /// </summary>
    public enum Status
    {
        Create,
        AddDestinations,
        ChoosePaymentType,
        PayCash,
        PayCheck,
        AddThankYou,
        Complete
    }

    //Create, then
    //AddDestinations, then
    //ChoosePaymentType
    //   if cash, then PayCash, then
    //   if check, then PayCheck, then
    //AddThankYou, then
    //Complete
    //
    //Itinerary cannot be generated until TripStateStatus = Complete
    //When state = Complete, the Trip object has been verified to be
    //complete and all validation requirements fulfilled.
}
