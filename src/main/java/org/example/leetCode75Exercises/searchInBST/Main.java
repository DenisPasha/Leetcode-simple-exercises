package org.example.leetCode75Exercises.searchInBST;

public class Main {
    //You are given the root of a binary search tree (BST) and an integer val.
    //Find the node in the BST that the node's value equals val and return the subtree rooted with that node.
    // If such a node does not exist, return null.
    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(6,
                new TreeNode(3,
                        new TreeNode(1),
                        new TreeNode(5)),
                new TreeNode(10));


        TreeNode treeNode = searchBST(node1, 1);

    }


    public static TreeNode searchBST(TreeNode root, int val) {

        if (root==null){
            return null;
        }

        if (val < root.val){
           return searchBST(root.left , val);
        }
        if (val > root.val){
            return searchBST(root.right , val);
        }

        if (val == root.val){
            return root;
        }
        return root;
    }
}
