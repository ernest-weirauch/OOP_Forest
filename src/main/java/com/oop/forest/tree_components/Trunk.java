package com.oop.forest.tree_components;

import com.oop.forest.enumtypes.ECortexType;
import com.oop.forest.util.Rand;

import java.util.Random;

public class Trunk {
    private double trunkHeight;
    private double diameter;
    private ECortexType cortexType; //szorstka/gładka
    private String color;

    public Trunk() {
    }

    public Trunk(double trunkHeight, double diameter, ECortexType cortexType, String color) {
        this.trunkHeight = trunkHeight;
        this.diameter = diameter;
        this.cortexType = cortexType;
        this.color = color;
    }

    public double getTrunkHeight() {
        return trunkHeight;
    }

    public void setTrunkHeight(double trunkHeight) {
        this.trunkHeight = trunkHeight;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public ECortexType getCortexType() {
        return cortexType;
    }

    public void setCortexType(ECortexType cortexType) {
        this.cortexType = cortexType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private static final double sampleMinLength = 0.5;
    private static final double sampleMaxLength = 10.0;
    private static final double sampleMinDiameter = 0.03;
    private static final double sampleMaxDiameter = 1.5;

    public static Trunk generateSampleTrunk() {
        //Random r = new Random();

        double length = Rand.doubleFromRange(sampleMinLength, sampleMaxLength);
        double diameter = Rand.doubleFromRange(sampleMinDiameter, sampleMaxDiameter);

        return new Trunk(length, diameter, ECortexType.SMOOTH, "test");
    }

    @Override
    public String toString() {
        return "Trunk{" +
                "trunkHeight=" + trunkHeight +
                ", diameter=" + diameter +
                ", cortexType=" + cortexType +
                ", color='" + color + '\'' +
                '}';
    }
}
