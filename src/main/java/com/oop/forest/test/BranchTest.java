package com.oop.forest.test;

import com.oop.forest.enumtypes.ELeafType;
import com.oop.forest.tree_components.Branch;

public class BranchTest {
    public static void main(String args[]) throws Exception {
       Branch b = Branch.generateSampleBranch(ELeafType.STANDARD);
        //b.addBranch(new Branch("br2", null, null, 0.1));

        System.out.println(b);
    }

}
