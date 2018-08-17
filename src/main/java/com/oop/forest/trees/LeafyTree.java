package com.oop.forest.trees;

import com.oop.forest.tree_components.Branch;
import com.oop.forest.enumtypes.ECrownShape;
import com.oop.forest.tree_components.Trunk;
import com.oop.forest.tree_components.leaves.Leaf;
import com.oop.forest.tree_components.leaves.StandardLeaf;

import java.util.ArrayList;

public class LeafyTree extends Tree {   //drzewo liscaste
    private ArrayList<StandardLeaf> leaves;

    public LeafyTree(String name, Trunk trunk, ArrayList<Branch> branches, double height, ECrownShape crownShape, ArrayList<StandardLeaf> leaves) {
        super(name, trunk, branches, height, crownShape);
        this.leaves = leaves;
    }

    public ArrayList<StandardLeaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(ArrayList<StandardLeaf> leaves) {
        this.leaves = leaves;
    }


//    public static ArrayList<Leaf> generateLeaves(int min, int max){
//        ArrayList<Leaf> leaves = new ArrayList<Leaf>();
//        Random r = new Random();
//        int n = r.nextInt((max-min)+1)+min;
//
//        for(int i=0; i<n; i++){
//            leaves.add(new Leaf());
//        }
//
//        return leaves;
//    }
//
//    public static ArrayList<Leaf> generateLeaves(int n){
//        ArrayList<Leaf> leaves = new ArrayList<Leaf>();
//
//        for(int i=0; i<n; i++){
//            leaves.add(new Leaf());
//        }
//
//        return leaves;
//    }
//
//    public static LeafyTree createSampleTree(){
//        Trunk t = new Trunk(1.0, 0.25, ECortexType.SMOOTH, "white");
//        List<Branch> branches = Tree.generateBranches(3,30);   //wygeneruj troche galezi
//        ArrayList<Leaf> leaves = LeafyTree.generateLeaves(10,100);
//
//        LeafyTree leafyTree = new LeafyTree("birch-tree", t, branches, 1.0, ECrownShape.ROUND, leaves);
//
//        return leafyTree;
//    }

}
