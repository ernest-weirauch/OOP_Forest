package com.oop.forest.tree_components;

import com.oop.forest.enumtypes.ELeafType;
import com.oop.forest.tree_components.leaves.Leaf;
import com.oop.forest.tree_components.leaves.Needle;
import com.oop.forest.tree_components.leaves.StandardLeaf;
import com.oop.forest.util.Rand;

import java.util.ArrayList;
import java.util.Random;

public class Branch {
    private String name;
    private ArrayList<Branch> branches;
    private ArrayList<Leaf> leaves;
    private double length;
    private static int n=0;

    public Branch(String name, ArrayList branches, ArrayList leaves, double length) {
        this.name = name;
        this.branches = branches;
        this.leaves = leaves;
        this.length = length;

        n++;
        this.name+=n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public ArrayList<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(ArrayList<Leaf> leaves) {
        this.leaves = leaves;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public void removeBranch(Branch branch) {
        for (Object b : branches) {
            if (b.equals(branch)) branches.remove(b);
        }
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", branches=" + branches +
                ", leaves=" + leaves +
                ", length=" + length +
                '}';
    }

private static final double minSampleLength = 0.1;
    private static final double maxSampleLength = 3.0;

    public static Branch generateSampleBranch(ELeafType leafType) throws Exception {
        //Random r = new Random();
        double length = Rand.doubleFromRange(minSampleLength, maxSampleLength);

        Branch branch;
        if(leafType==ELeafType.STANDARD){
            branch = new Branch("b", null, StandardLeaf.generateSampleLeaves(), length);
        } else if(leafType==ELeafType.NEEDLES){
            branch = new Branch("b", null, Needle.generateSampleNeedles(), length);
        } else{
            throw new Exception("unknown leaf type");
        }

        return branch;
    }
}
