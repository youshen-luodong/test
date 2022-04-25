package com.leetCode;

import com.hs.tz.enty.TreeNode;

public class Code606 {
    public static void main(String[] args) {


    }
    public static String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }
        if (root.left == null && root.right == null) {
            return Integer.toString(root.val);
        }
        if (root.right == null) {
            return new StringBuffer().append(root.val).append("(").append(tree2str(root.left)).append(")").toString();
        }
        return new StringBuffer().append(root.val).append("(").append(tree2str(root.left)).append(")(").append(tree2str(root.right)).append(")").toString();
    }
    public static String tree(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if (root == null) {
            return "";
        }
        if (root.left == null && root.right== null) {
            return Integer.toString(root.val);
        }
        return "";
    }
}
