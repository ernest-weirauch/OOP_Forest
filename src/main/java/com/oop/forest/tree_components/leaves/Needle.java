package com.oop.forest.tree_components.leaves;

import com.oop.forest.enumtypes.ELeafType;
import com.oop.forest.util.Rand;

import java.util.ArrayList;
import java.util.Random;

public class Needle extends Leaf {
    public Needle(String name) {
        super(name);
    }

    private static final int minSampleNeedles = 3;
    private static final int maxSampleNeedles = 1000;

    public static ArrayList<Needle> generateSampleNeedles() throws Exception {
        ArrayList<Needle> leaves = new ArrayList<>();

        int leavesNum = Rand.intFromRange(minSampleNeedles, maxSampleNeedles);

        for(int i=0; i<leavesNum; i++){
                leaves.add(new Needle("l"+Integer.toString(i)));
        }

        return leaves;
    }

}
