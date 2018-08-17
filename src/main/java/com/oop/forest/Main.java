package com.oop.forest;

/*
Enigma - Zadanie 1
autor: Ernest Weirauch
IDE: IntelliJ IDEA
testy: src/test/java/com.enigma.task1
 */

import com.oop.forest.trees.ConiferTree;
import com.oop.forest.trees.LeafyTree;
import com.oop.forest.trees.Tree;
import com.oop.forest.util.Rand;

import java.util.ArrayList;
import java.util.Random;


/*TODO:
  - better random generator
  - prosta wizualizacja 2d (w tym koordynaty poszczegolnych drzew)
  - junit testy (assertEquals)
*/
public class Main {
    public static final int MIN_TREES = 3300;
    public static final int MAX_TREES = 10000;

    public static void main(String args[]) throws Exception {
        //Robie las
        ArrayList<Tree> forest = new ArrayList<>();

        //rob drzewa (las mieszany)
        for(int i = 0; i< Rand.intFromRange(MIN_TREES, MAX_TREES); i++){
            forest.add(Tree.generateSampleTree());
        }

        //policz liczbe drzew
        int d=0, l=0, g=0;
        for(int i=0;i<forest.size();i++){
            d++;
            if(forest.get(i) instanceof LeafyTree) l++;
            else if(forest.get(i) instanceof ConiferTree) g++;
        }
        System.out.println("Liczba wszystkich drzew w lasie: "+d);
        System.out.println("Liczba drzew lisciastych: "+l);
        System.out.println("Liczba drzew iglastych: "+g);


        //policz ile lisci/galezi jest w calym lesie
        long lg=0, ll=0;
        for(int i=0; i<forest.size();i++){
            Tree t = forest.get(i);
            lg+=t.getBranches().size();
            if(t instanceof LeafyTree) ll+=((LeafyTree) t).getLeaves().size();
            else if(t instanceof ConiferTree) ll+=((ConiferTree) t).getNeedles().size();
        }
        System.out.println("Liczba wszystkich galezi w lasie: "+lg);
        System.out.println("Liczba wszystkich lisci (lacznie z iglami): "+ll);


    }

}
