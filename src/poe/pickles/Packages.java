package poe.pickles;

import java.util.ArrayList;
import java.util.List;

public class Packages {
    private static  Packages uniquePackets = new Packages();
    List<Places> places = new ArrayList<>();
    int total = 0;

    public List<Places> getPlaces() {
        return places;
    }

    private  Packages(){

    }
    public static Packages getInstance(){
        return uniquePackets;
    }

    public List<Places> loadPlaces(){
        Places los_Angeles_Airport = new Places("Helicopter","Los Angeles Airport",4000,"10/1","10AM","10/5","11AM");
        places.add(los_Angeles_Airport);
        Places fii_Airport = new Places("Private Jet","Fiji Airport",17000,"10/5","12PM","10/1","10PM");
        places.add(fii_Airport);
        Places fiji_Marina = new Places("Limousine","Fiji Marina",500,"10/5","10PM","10/5","11PM");
        places.add(fiji_Marina);
        Places paradise_Pickles_Private_Island = new Places("Yacht","Paradise Pickles Private Island",12000,"10/5","11PM","10/5","9PM");
        places.add(paradise_Pickles_Private_Island);
        Places fiji_Marina2 = new Places("Yatch","Fiji Marina",12000,"10/19","9AM","10/19","5PM");
        places.add(fiji_Marina2);
        Places fiji_Airport2 = new Places("Limousine","Fiji Marina",500,"10/19","5PM","10/19","6PM");
        places.add(fiji_Airport2);
        Places san_Diego = new Places("Private Jet","San Diego Airport",23000,"10/19","6PM","10/20","2AM");
        places.add(san_Diego);
        Places palace_Pickles = new Places("Helicopter","Palace Pickles",23000,"10/20","2AM","10/20","3AM");
        places.add(palace_Pickles);
        return places;
    }

    public void printPackages(){
        for (int i = 0; i < 8; i++) {
            System.out.println(i+"."+places.get(i).transportation +" to "+ places.get(i).name +" on "+ places.get(i).departedOn+" at " + places.get(i).arrivedTime + ","+ places.get(i).arrivedOn + " at "+places.get(1).departedTime + " --Cost:"+places.get(i).cost);
        }
    }

    public void updatePackages(String input, int index){
        places.get(index).setDepartedFrom(input);
    }
    public void printNewPackage(){
        for (int i = 0; i < 8 ; i++) {
            System.out.println(i+"."+places.get(i).transportation + " from "+places.get(i).departedFrom +" to "+ places.get(i).name +" on "+ places.get(i).departedOn+" at " + places.get(i).arrivedTime + ","+ places.get(i).arrivedOn + " at "+places.get(1).departedTime + " --Cost:"+places.get(i).cost);
        }
    }
    public int getTotal() {
        return total;
    }

    public int computeTotal(){
        for (int i = 0; i <places.size() ; i++) {
            total += places.get(i).cost;
        }
        return total;
    }


}
