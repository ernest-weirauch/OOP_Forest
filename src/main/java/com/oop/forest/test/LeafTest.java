package com.oop.forest.test;

import com.oop.forest.tree_components.leaves.Leaf;
import com.oop.forest.tree_components.leaves.Needle;
import com.oop.forest.tree_components.leaves.StandardLeaf;

public class LeafTest {
    public static void main(String args[]) {
        Leaf l = new Needle("a0");
        Leaf l2 = new StandardLeaf("a1");

        System.out.println(l.toString());
        System.out.println(l2.toString());
    }
}
