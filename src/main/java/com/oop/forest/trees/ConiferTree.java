package com.oop.forest.trees;

import com.oop.forest.tree_components.Branch;
import com.oop.forest.enumtypes.ECrownShape;
import com.oop.forest.tree_components.Trunk;
import com.oop.forest.tree_components.leaves.Needle;

import java.util.ArrayList;

public class ConiferTree extends Tree { //drzewo iglaste
    private ArrayList<Needle> needles;



    public ConiferTree(String name, Trunk trunk, ArrayList<Branch> branches, double height, ECrownShape crownShape, ArrayList<Needle> needles) {
        super(name, trunk, branches, height, crownShape);
        this.needles = needles;
    }

    public ArrayList<Needle> getNeedles() {
        return needles;
    }

    public void setNeedles(ArrayList<Needle> needles) {
        this.needles = needles;
    }

//    public static ConiferTree createSampleTree(){
//        Trunk t = new Trunk(1.0, 0.25, ECortexType.ROUGH, "dark-brown");
//        List<Branch> branches = Tree.generateBranches(3,30);   //wygeneruj troche galezi
//        ArrayList<Needle> needles = ConiferTree.generateNeedles(10,100);
//
//        ConiferTree coniferTree = new ConiferTree("spruce", t, branches, 1.0, ECrownShape.TRIANGULAR, needles);
//
//        return coniferTree;
//    }
}
