package poe.pickles;

//Append separator decorator
public class ItineraryAppendSeparator extends ItineraryDecorator{
    public ItineraryAppendSeparator(IItineraryComponent componentToDecorate){
        super(componentToDecorate);
    }

    @Override
    public String output(){
        StringBuilder toOutput = new StringBuilder(super.output());

        toOutput.append(System.lineSeparator());

        toOutput.append("--------------------------------------------");

        toOutput.append(System.lineSeparator());
        toOutput.append(System.lineSeparator());

        return toOutput.toString();
    }
}
