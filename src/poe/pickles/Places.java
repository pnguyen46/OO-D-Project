package poe.pickles;

public class Places {

    String name;
    protected int cost;
    protected String arrivedOn;
    protected String departedOn;
    protected String arrivedTime;
    protected String departedTime;
    protected String departedFrom;
    protected String transportation;


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

    public Places(String transportation,String name, int cost, String arrivedOn, String arrivedTime, String departedOn, String departedTime){
        this.transportation = transportation;
        this.name = name;
        this.cost = cost;
        this.arrivedOn = arrivedOn;
        this.departedOn = departedOn;
        this.arrivedTime = arrivedTime;
        this.departedTime = departedTime;
    }

    public void setDepartedFrom(String departedFrom) {
        this.departedFrom = departedFrom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getArrivedOn() {
        return arrivedOn;
    }

    public void setArrivedOn(String arrivedOn) {
        this.arrivedOn = arrivedOn;
    }

    public String getDepartedOn() {
        return departedOn;
    }

    public void setDepartedOn(String departedOn) {
        this.departedOn = departedOn;
    }
}
