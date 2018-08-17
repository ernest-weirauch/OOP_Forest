package com.oop.forest.test;

import com.oop.forest.enumtypes.ELeafType;
import com.oop.forest.tree_components.leaves.Leaf;
import com.oop.forest.tree_components.leaves.Needle;
import com.oop.forest.tree_components.leaves.StandardLeaf;

import java.util.ArrayList;
import java.util.Arrays;

public class LeavesTest {
    public static void main(String args[]) throws Exception {
        ArrayList<StandardLeaf> leaves =  StandardLeaf.generateSampleLeaves();
        System.out.println(Arrays.toString(leaves.toArray()));
    }
}
