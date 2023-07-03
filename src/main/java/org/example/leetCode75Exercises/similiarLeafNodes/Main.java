package org.example.leetCode75Exercises.similiarLeafNodes;

import java.util.ArrayList;
import java.util.List;

public class Main {
//Consider all the leaves of a binary tree, from left to right order,
// the values of those leaves form a leaf value sequence.
    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2 ,
                                new TreeNode(7),
                                new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(9),
                        new TreeNode(8)));

        TreeNode node2 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2 ,
                                new TreeNode(7),
                                new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(9),
                        new TreeNode(8)));

        boolean result = leafSimilar(node1, node2);
        System.out.println(result);
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> leafsOfNode1 = new ArrayList<>();
        List<Integer> leafsOfNode2 = new ArrayList<>();

        getLeafs(root1, leafsOfNode1);
        getLeafs(root2, leafsOfNode2);

        if (leafsOfNode1.size()!=leafsOfNode2.size()){
            return false;
        }

        for (int i = 0; i < leafsOfNode1.size(); i++) {
            if (leafsOfNode1.get(i) != leafsOfNode2.get(i)){
                return false;
            }
        }
        return true;
    }

    private static void getLeafs(TreeNode root, List<Integer> leafs) {

       if (root.left!=null){
           getLeafs(root.left , leafs);
       }
       if (root.right!=null){
            getLeafs(root.right , leafs);
       }else if (root.left == null && root.right == null){
           leafs.add(root.val);
           return;
       }

    }
}
