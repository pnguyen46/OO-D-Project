

public class Itinerary implements IItineraryComponent {

    private Trip _trip;

    ///     Base itinerary generator component that
    ///     will be decorated by additional IItineraryComponent
    ///     concrete classes
    public Itinerary(Trip trip){
        _trip = trip;
    }

    @Override
    public Trip getTrip() {
        return _trip;
    }

    @Override
    public String output() {
        //base itinerary outputs nothing - could, but doesn't in this case
        //so it can delegate all responsibilities to decorators
        //all this class really does is hold the trip instance
        return new String();
    }
}
