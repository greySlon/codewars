package com.flat.odessa.level_7.task_2;

public class FindMaxValueInTree {


  static int findMax(TreeNode root) {
    int max = root.value;
    int l = max, r = max;

    if (root.left != null) {
      l = findMax(root.left);
    }
    if (root.right != null) {
      r = findMax(root.right);
    }
    return Math.max(max, Math.max(l, r));
  }

}
