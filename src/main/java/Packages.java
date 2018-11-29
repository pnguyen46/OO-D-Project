import java.util.List;
import java.util.Random;

public class Packages {
    private int packageId = new Random().nextInt(1000);
    private String packageName;
    private double packagePrice;
    private int hoursOfTravel;
    private Places _places;


    public Packages(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    private Packages loadPackages(){
        while(!Packages.this.packageName.isEmpty()){
            if(Packages.this.packageName.equalsIgnoreCase("Los Angeles Airport")){
                Places.getInstance().setName("Los Angeles");
                Places.getInstance().setCost(4000.00);
            }
        }
    }
}
