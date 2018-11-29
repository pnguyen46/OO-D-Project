
import com.google.gson.Gson;

import java.util.Scanner;

public class Main {
//    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //serialization();
        deSerialization();

    }

    private static void serialization() {
        Places places = new Places("Los Angeles Airport", 4000.00, "12/5", "12/29", "11:00AM", "9:00AM", Transportation.AirPlane);
        Gson gson = new Gson();
        String output = gson.toJson(places);
    }

    private static void deSerialization(){
        String los_angeles_airport = "{'name':'Los Angeles Airport','cost':4000.0,'arrivedOn':'12/5','departedOn':'12/29','arrivedTime':'11:00AM','departedTime':'9:00AM','transportation':'AirPlane'}";
        Gson gson = new Gson();
        Places places = gson.fromJson(los_angeles_airport,Places.class);
    }

    //state loop will handle traversing through
        //the various states until the user
        //decides to return later (exit state loop with trip
        //in an incomplete state) OR the trip is complete.
//        TripStateLoop tripStateLoop = new TripStateLoop();
//        Trip trip;
//
//        try {
//            trip = tripStateLoop.execute();
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//            return;
//        }
//
//        while (true)
//        {
//            showItinerary(trip);
//
//            //this loop simulates loading a trip from
//            //storage and passing it back into the trip state loop
//            //at the correct state to continue adding data
//            //or showing the final state (itinerary)
//            System.out.println();
//            System.out.println("Simulate trip reload to correct state? [yes]");
//
//            if (scanner.nextLine().toLowerCase().trim().equals("yes")){
//                try {
//                    tripStateLoop.execute(trip);
//                }catch(Exception ex){
//                    System.out.println(ex.getMessage());
//                    break;
//                }
//            }else{
//                break;
//            }
//        }
//    }
//
//    /// <summary>
//    ///     Displays itinerary, if possible
//    /// </summary>
//    /// <param name="trip"></param>
//    private static void showItinerary(Trip trip)
//    {
//        if (ItineraryFactory.TripCanProduceItinerary(trip))
//        {
//            System.out.println("Show itinerary? [yes]");
//            if (!scanner.nextLine().toLowerCase().trim().equals("yes")) return;
//
//            String itinerary;
//
//            try{
//                itinerary = ItineraryFactory.get(trip);
//            }catch(Exception ex){
//                System.out.println(ex.getMessage());
//                return;
//            }
//
//            System.out.println(itinerary);
//            return;
//        }
//
//        System.out.println("Trip " + trip.getOrderId() + " is not complete - cannot produce itinerary yet");
//        System.out.println("Trip " + trip.getOrderId() + " state = " + trip.getTripStateStatus());
//        System.out.println();
//    }

}
