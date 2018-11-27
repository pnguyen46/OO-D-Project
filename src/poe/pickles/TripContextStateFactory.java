package poe.pickles;

/// <summary>
///     Static factory to set TripContext to the appropriate concrete
///     TripState instance using the Trip.TripStateStatus enum.
/// </summary>
public class TripContextStateFactory
{
    public static TripState get(TripContext context) throws Exception
    {
        assert context != null;
        assert context.getTrip() != null;

        TripState.Status tripStateStatus = context.getTrip().getTripStateStatus();

        switch (tripStateStatus)
        {
            case Create:
                return new TripStateCreate(context);

            case AddDestinations:
                return new TripStateAddDestinations(context);

            case ChoosePaymentType:
                return new TripStateChoosePaymentType(context);

            case AddThankYou:
                return new TripStateAddThankYou(context);

            case Complete:
                return new TripStateComplete(context);

            default:
                throw new Exception(tripStateStatus + " is an invalid state");
        }
    }
}
