

//Booking detail itinerary decorator
public class ItineraryAppendBookingDetails extends ItineraryDecorator {

    public ItineraryAppendBookingDetails(IItineraryComponent componentToDecorate){
        super(componentToDecorate);
    }

    @Override
    public String output() {
        String toOutput = super.output();

        toOutput += "Order # : " + getTrip().getOrderId() + System.lineSeparator();
        toOutput += "Booked : " + getTrip().getBookedOn() + System.lineSeparator();
        toOutput += "Payment : " + getTrip().getPayment() + System.lineSeparator();

        return toOutput;
    }
}
