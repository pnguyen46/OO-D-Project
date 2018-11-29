

/// <summary>
///     Handles looping through the state machine until
///     either the user exits (to return later) OR because
///     the Trip instance is completely and accurately filled.
///     Call Execute() to create a new Trip instance or
///     Execute(trip) if you have an existing Trip instance
///     to re-insert and continue looping in the state machine.
/// </summary>
public class TripStateLoop
{
    /// <summary>
    ///     Used when creating a NEW trip.
    ///     Returns trip instance. Note returned trip instance may not be complete.
    /// </summary>
    /// <returns></returns>
    public Trip execute() throws Exception
    {
        return execute(null);
    }

    /// <summary>
    ///     Execute(trip) if you have an existing Trip instance
    ///     to re-insert and continue looping in the state machine.
    /// </summary>
    /// <returns></returns>
    public Trip execute(Trip trip) throws Exception
    {
        TripContext tripContext = trip == null
                ? new TripContext()
                : new TripContext(trip);

        while (tripContext.execute() == Status.Continue)
        {
            //keep looping while the states are saying continue
        }

        System.out.println(System.lineSeparator());
        System.out.println("*** TripStateLoop.Status.Stopped ***");
        System.out.println(System.lineSeparator());

        return tripContext.getTrip();
    }

    public enum Status
    {
        Continue,
        Stop
    }
}
