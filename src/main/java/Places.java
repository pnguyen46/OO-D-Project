public class Places {
    private String name;
    private double cost;
    private String arrivedOn;
    private String departedOn;
    private String arrivedTime;
    private String departedTime;
    private String transportation;


    public Places(String name, double cost, String arrivedOn, String departedOn, String arrivedTime, String departedTime, String transportation) {
        this.name = name;
        this.cost = cost;
        this.arrivedOn = arrivedOn;
        this.departedOn = departedOn;
        this.arrivedTime = arrivedTime;
        this.departedTime = departedTime;
        this.transportation = transportation;
    }
}
