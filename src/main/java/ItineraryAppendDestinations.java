

//Destinations itinerary decorator
public class ItineraryAppendDestinations extends ItineraryDecorator {

    public ItineraryAppendDestinations(IItineraryComponent componentToDecorate){
        super(componentToDecorate);
    }

    @Override
    public String output() {
        StringBuilder toOutput = new StringBuilder(super.output());

        toOutput.append("Departure From");

        toOutput.append(System.lineSeparator());
        toOutput.append(System.lineSeparator());

        for(int destination = 0; destination < getTrip().getDestinations().size(); destination++){
            toOutput.append(destination + 1);
            toOutput.append(". ");
            toOutput.append(getTrip().getDestinations().get(destination));
            toOutput.append(System.lineSeparator());
        }

        return toOutput.toString();
    }
}
