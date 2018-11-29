import com.google.gson.Gson;


import java.util.ArrayList;
import java.util.List;

public class Packages {
    private int packagesId;
    private String packagesName;
    private double price;
    private int hoursOfTravel;
    private int count = 0;
    private String arrivedDate;
    private String departedDate;
    private String transportation;
    private String departureFrom;
    private List<String> _packages = new ArrayList<>(10);
    private  static double totalAmount;

    public Packages(){

    }
    public Packages(String packagesName,String arrivedDate,String departedDate,String transportation,String departure ) {
        this.packagesName = packagesName;
        this.arrivedDate = arrivedDate;
        this.departedDate = departedDate;
        this.transportation = transportation;
        this.departureFrom = departure;
        loadPackets();

    }

    public List<String> get_packages() {
        return _packages;
    }

    public static double getTotalAmount() {
        return totalAmount;
    }

    private double loadPackets() {
        String output = new Gson().toJson(Places.getUniqueId().makePlaces(packagesName));
        StringBuilder sb = new StringBuilder();
        sb.append(1).append("--").append(output);
        System.out.println(sb.toString());
        Places place = new Gson().fromJson(output, Places.class);
        totalAmount = totalAmount + place.getCost();
        _packages.add(transportation.concat(" from ").concat(departureFrom).concat(" to ").concat(place.getName()).concat(",").concat(arrivedDate).concat(" at ").concat(place.getDepartedTime()).concat(",").concat(departedDate).concat(" at ").concat(place.getArrivedTime()).concat(",").concat("Cost:").concat("$").concat(Double.toString(place.getCost())));
        return totalAmount;
    }

}
