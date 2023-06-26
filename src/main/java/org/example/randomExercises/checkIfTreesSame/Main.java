package org.example.randomExercises.checkIfTreesSame;

import java.util.*;

public class Main {

    //Given the roots of two binary trees p and q, write a function to check if they are the same or not.
    //
    //Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
    public static void main(String[] args) {

        TreeNode tree1 = new TreeNode(1,new TreeNode(1) , null);
        TreeNode tree2 = new TreeNode(1,null,new TreeNode(1) );
        boolean sameTree = isSameTree(tree1, tree2);
        System.out.println(sameTree);

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        //base case
        if( p == null && q == null)
            return true;
        if(p == null || q == null){
            return false;
        }

        //checking if both right and left nodes are equal as well as the root
        if(p != null && q != null){
            if (p.val == q.val){
                if (isSameTree(p.left ,q.left)){
                    if (isSameTree(p.right , q.right)){
                        return true;
                    }
                }
            }
        }
        return false;

    }

}
