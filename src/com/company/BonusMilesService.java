package com.company;


public class BonusMilesService {
    public int calculate (int cost) {
        float miles = cost / 20F;

        return (int) miles;
    }

}
