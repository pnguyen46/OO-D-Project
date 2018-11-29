

//Thank you decorator
public class ItineraryAppendThanks extends ItineraryDecorator {
    public ItineraryAppendThanks(IItineraryComponent componentToDecorate){
        super(componentToDecorate);
    }

    @Override
    public String output(){
        StringBuilder toOutput = new StringBuilder(super.output());

        toOutput.append("THANK YOU");

        toOutput.append(System.lineSeparator());
        toOutput.append(System.lineSeparator());

        toOutput.append(getTrip().getThankYou());

        toOutput.append(System.lineSeparator());

        return toOutput.toString();
    }
}
