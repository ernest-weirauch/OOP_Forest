package com.oop.forest.test;

import com.oop.forest.enumtypes.ECrownShape;
import com.oop.forest.tree_components.Branch;
import com.oop.forest.tree_components.Trunk;
import com.oop.forest.tree_components.leaves.StandardLeaf;
import com.oop.forest.trees.ConiferTree;
import com.oop.forest.trees.LeafyTree;
import com.oop.forest.trees.Tree;

import java.util.ArrayList;

public class TreeTest {
    public static void main(String args[]) throws Exception {
        Tree tree = Tree.generateSampleTree();
        System.out.println(tree);

    }
}
