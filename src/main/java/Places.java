public class Places {
    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getArrivedOn() {
        return arrivedOn;
    }

    public String getDepartedOn() {
        return departedOn;
    }

    public String getArrivedTime() {
        return arrivedTime;
    }

    public String getDepartedTime() {
        return departedTime;
    }

    public Transportation getTransportation() {
        return transportation;
    }

    private String name;
    private double cost;
    private String arrivedOn;
    private String departedOn;
    private String arrivedTime;
    private String departedTime;
    private Transportation transportation;


    public Places(String name, double cost, String arrivedOn, String departedOn, String arrivedTime, String departedTime, Transportation transportation) {
        this.name = name;
        this.cost = cost;
        this.arrivedOn = arrivedOn;
        this.departedOn = departedOn;
        this.arrivedTime = arrivedTime;
        this.departedTime = departedTime;
        this.transportation = transportation;
    }
}
