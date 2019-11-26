package com.anurup.samplePrograms.overloading;

// Class to overload a function volumne() as below

//double volume(double R)  with R as an argument  and returns volumne as
// V = 4/3 *22/7 *R3

//double volumne(double H,  double R) and return volume as
//V = 22/7* R2*H

//double volume(double  L, double B, double H) and return volumne as
//V = L*B*H

public class VolumneOverload {

    double volume(double R) {
        double volume = 4 / 3 * 22 / 7 * R * R * R;
        return volume;
    }

    double volume(double H, double R) {
        double volume = 22 / 7 * R * R * H;
        return volume;
    }

    double volumne(double L, double B, double H) {
        double volumne = L * B * H;
        return volumne;
    }

}
