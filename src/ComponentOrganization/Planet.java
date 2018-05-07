package ComponentOrganization;

import javax.swing.*;

public class Planet {
    private String name;
    private double radius;
    private int moons;
    private ImageIcon image;

    public Planet(String n, double r, int m){
        name = n;
        radius = r;
        moons = m;
        image= new ImageIcon(getClass().getResource(name + ".gif"));
    }
    public String toString(){
        return name;
    }
    public String getDescription(){
        return "Radius: " + radius + "\nMoons: " + moons;
    }
    public  ImageIcon getImage(){
        return image;
    }
}
