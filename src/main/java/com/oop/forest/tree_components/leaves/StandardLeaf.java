package com.oop.forest.tree_components.leaves;

import com.oop.forest.util.Rand;

import java.util.ArrayList;
import java.util.Random;

public class StandardLeaf extends Leaf{
    public StandardLeaf(String name) {
        super(name);
    }
    private static final int minSampleLeaves = 3;
    private static final int maxSampleLeaves = 1000;

    public static ArrayList<StandardLeaf> generateSampleLeaves() throws Exception {
        ArrayList<StandardLeaf> leaves = new ArrayList<>();

        int leavesNum = Rand.intFromRange(minSampleLeaves, maxSampleLeaves);
       // System.out.println(leavesNum);

        for(int i = 0; i< leavesNum; i++){
            leaves.add(new StandardLeaf("l"+Integer.toString(i)));
        }

        return leaves;
    }
}
