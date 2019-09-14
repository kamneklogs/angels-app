package model;
import java.util.ArrayList;

public class MaxSupLegion{

    private ArrayList<Angel> angels;
    

    public MaxSupLegion() {
        angels = new ArrayList<Angel>();
    }

    public ArrayList<Angel> getAngels() {
        return angels;
    }

    public void setAngels(ArrayList<Angel> angels) {
        this.angels = angels;
    }

    public void addAngel(){
     //   angels.add(new Angel(name, type, photo, prayer, cDay, power, new Candle(color, size, essence, lighting)));
     String name, type, photo,  prayer, cDay, power, color, essence;
     double size, lighting;
     int varAux; // To type's definition.
    }

}