package com.oop.forest.util;

import java.util.Random;

public class Rand {


    public static int intFromRange(int min, int max) throws Exception {
        if(min >= max){
            throw new IllegalArgumentException("max must be grater than min");
        }
        int result =(int) (Math.random()*((max-min)+1))+min;
        if(result<0) throw new Exception("rand must be greater than 0");
        return result;
    }

    public static double doubleFromRange(double min, double max){
        if(min >= max){
            throw new IllegalArgumentException("max must be grater than min");
        }
        return (double) (Math.random()*((max-min)+1))+min;
    }

    public static boolean bool(){
        Random r = new Random();
        return r.nextBoolean();
    }
}
