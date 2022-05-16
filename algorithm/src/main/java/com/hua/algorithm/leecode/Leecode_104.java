package com.hua.algorithm.leecode;

import com.hua.tulingxueyuan.tree.TreeNode;
import com.sun.media.sound.RIFFInvalidDataException;

/**
 * @author fuhua
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 **/
public class Leecode_104 {
    public int maxDepth(TreeNode root) {
        int length = 0;
        if (root == null) {
            return 0;
        }
        return selectDeep(root, length);
    }

    private int selectDeep(TreeNode root, int length) {
        if (root == null) {
            return length;
        }
        length++;
        int l = selectDeep(root.left, length);
        int r = selectDeep(root.right, length);
        return Math.max(l, r);
    }
}
