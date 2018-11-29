import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Places {
    private static Places uniqueId = new Places();
    private String name;
    private double cost;
    private String arrivedTime;
    private String departedTime;
    private Places _places;

    private Places(){

    }

    public static Places getUniqueId() {
        return uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getArrivedTime() {
        return arrivedTime;
    }

    public void setArrivedTime(String arrivedTime) {
        this.arrivedTime = arrivedTime;
    }

    public String getDepartedTime() {
        return departedTime;
    }

    public void setDepartedTime(String departedTime) {
        this.departedTime = departedTime;
    }

    private Places setPlaces(String name,String arrivedTime,String departedTime,double cost){
        this.name = name;
        this.cost = cost;
        this.arrivedTime = arrivedTime;
        this.departedTime = departedTime;
        return getUniqueId();
    }

    public Places get_places() {
        return _places;
    }

    protected Places makePlaces(String destination){
        if(destination.equalsIgnoreCase("Los Angeles Airport")){
            _places = setPlaces("Los Angeles Airport","1PM","10AM",4000.00);
        }
        else if(destination.equalsIgnoreCase("Fiji Airport")){
            _places = setPlaces("Fiji Airport","3PM","11AM",17000.00);
        }
        else if(destination.equalsIgnoreCase("Fiji Marina")){
            _places = setPlaces("Fiji Marina","9AM","7AM",500.00);
        }
        else if(destination.equalsIgnoreCase("Paradise Pickles Private Island")){
            _places = setPlaces("Paradise Pickles Private Island","1PM","10AM",12000.00);
        }
        else if(destination.equalsIgnoreCase("New York"))
        {
            _places = setPlaces("New York","5PM","2PM",10000.00);
        }
        else if(destination.equalsIgnoreCase("Atlanta")){
            _places = setPlaces("Atlanta","8AM","6AM",600);
        }
        else
        {
            System.out.println("Unable to retrive packages");
        }
        return _places;
    }
}
