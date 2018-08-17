package com.oop.forest.tree_components.leaves;

import com.oop.forest.enumtypes.ELeafType;

import java.util.ArrayList;
import java.util.Random;

public class Leaf {
    private String name;
    private int n=0;

    public Leaf(String name) {
        n++;

        this.name = name+=n;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        //cut the package name from getClass
        String fullName = this.getClass().getName();
        int i = fullName.lastIndexOf(".");
        String className = fullName.substring(i+1, fullName.length());

        return className+"{" +
                "name='" + name + '\'' +
                '}';
    }


}
