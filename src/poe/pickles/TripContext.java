package poe.pickles;

/// <summary>
///     Context object that holds the current
///     concrete trip state instance. Access to the
///     Trip instance is also here. Concrete trip
///     states use TripContext to change state
///     and access Trip.
/// </summary>
public class TripContext {

    private Trip _trip;
    private TripState _tripState;

    public TripContext(){
        _tripState = new TripStateCreate(this);
    }

    ///     Uses TripContextStateFactory to inject context
    ///     object with correct concrete TripState object
    ///     using the TripStateStatus enum in Trip instance
    public TripContext(Trip trip) throws Exception{
        assert trip != null : "trip cannot be null";

        _trip = trip;
        _tripState = TripContextStateFactory.get(this);
    }

    public Trip getTrip(){
        return _trip;
    }
    public void setTrip(Trip trip){
        _trip = trip;
    }
    public TripState getTripState(){
        return _tripState;
    }

    ///     Changes state to another state.
    ///     Should not be used outside of the
    ///     TripState machine.
    public void changeState(TripState newState){
        _tripState = newState;
    }

    /// <summary>
    ///     Executes the current concrete TripState
    ///     instance to control specific behavior
    ///     related to the current state.
    /// </summary>
    /// <returns></returns>
    public TripStateLoop.Status execute()
    {
        return _tripState.execute();
    }
}
