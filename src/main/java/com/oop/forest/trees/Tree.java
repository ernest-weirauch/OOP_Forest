package com.oop.forest.trees;

import com.oop.forest.enumtypes.ELeafType;
import com.oop.forest.tree_components.Branch;
import com.oop.forest.enumtypes.ECrownShape;
import com.oop.forest.tree_components.Trunk;
import com.oop.forest.tree_components.leaves.Leaf;
import com.oop.forest.tree_components.leaves.Needle;
import com.oop.forest.tree_components.leaves.StandardLeaf;
import com.oop.forest.util.Rand;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Tree {
    private String name;    //nazwa gatunkowa drzewa
    private Trunk trunk;    //pien
    private ArrayList branches;    //galezie
    private double height;  //wysokosc drzewa
    private ECrownShape crownShape;//ksztalt korony


    public Tree(String name, Trunk trunk, ArrayList branches, double height, ECrownShape crownShape) {
        this.name = name;
        this.trunk = trunk;
        this.branches = branches;
        this.height = height;
        this.crownShape = crownShape;
    }

    public void grow(double h) throws Exception {
        if (h > 0.0) {
            height += h;
        } else throw new Exception("Tree cant grow less than 0!");
    }

    private static final double minSampleHeight = 0.3;
    private static final double maxSampleHeight = 10.0;
    private static final int minBranchesNum = 1;
    private static final int maxBranchesNum = 30;

    public static Tree generateSampleTree() throws Exception {
        Tree tree;
        //Random r = new Random();
        boolean treeType = Rand.bool();

        ELeafType leafType;
        if (treeType) leafType = ELeafType.STANDARD;
        else leafType = ELeafType.NEEDLES;

        Trunk trunk = Trunk.generateSampleTrunk();

        int branchesNum = Rand.intFromRange(minBranchesNum, maxBranchesNum);
        ArrayList<Branch> branches = new ArrayList<>();
        for (int i = 0; i < branchesNum; i++) {
            branches.add(Branch.generateSampleBranch(leafType));
        }

        double height = Rand.doubleFromRange(minSampleHeight, maxSampleHeight);


        if (treeType) {
            tree = new LeafyTree("testLeafyTree", trunk, branches, height, ECrownShape.ROUND, StandardLeaf.generateSampleLeaves());
        } else {
            tree = new ConiferTree("testConiferTree", trunk, branches, height, ECrownShape.TRIANGULAR, Needle.generateSampleNeedles());
        }

        return tree;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public ECrownShape getCrownShape() {
        return crownShape;
    }

    public void setCrownShape(ECrownShape crownShape) {
        this.crownShape = crownShape;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", trunk=" + trunk +
                ", branches=" + branches +
                ", height=" + height +
                ", crownShape=" + crownShape +
                '}';
    }
}
