import com.google.gson.Gson;

import java.util.List;

public class Places {


    private static Places uniqueInstance = new Places();
    private String name;
    private double cost;
    private int arrivedTime;
    private int departedTime;


    private Places() { }

    public static Places getInstance(){
        return uniqueInstance;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getArrivedTime() {
        return arrivedTime;
    }

    public void setArrivedTime(int arrivedTime) {
        this.arrivedTime = arrivedTime;
    }

    public int getDepartedTime() {
        return departedTime;
    }

    public void setDepartedTime(int departedTime) {
        this.departedTime = departedTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
