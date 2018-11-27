package poe.pickles;

///     Abstract itinerary decorator.
///     Holds reference to previous decorator
///     component in decorator chain and provides
///     base.Output call to access private _componentToDecorate
public abstract class ItineraryDecorator implements IItineraryComponent {
    private final IItineraryComponent _componentToDecorate;

    protected ItineraryDecorator(IItineraryComponent componentToDecorate){
        _componentToDecorate = componentToDecorate;
    }

    @Override
    public Trip getTrip() {
        return _componentToDecorate.getTrip();
    }

    @Override
    public String output() {
        return _componentToDecorate.output();
    }
}
