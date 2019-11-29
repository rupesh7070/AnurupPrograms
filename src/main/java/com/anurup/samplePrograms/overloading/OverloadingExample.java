package com.anurup.samplePrograms.overloading;


public class OverloadingExample {

    // Class to override volumne method for sphere , Cylinder and cuboid
    public double volume(double R){
        double vol = (4/3)*(22/7)*R*R*R;
        return vol;
    }
    public double volume(double H, double R){
        double vol = (22/7)*(R*R)*(H);
        return vol;
    }

    public double volume(double L, double B, double H){
        double vol = L*B*H;
        return vol;
    }

    // Another example of overloading methods
    // Below function check is overridden

    public void check(String str, char ch){

    }

}
