import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode.cn id=589 lang=java
 *
 * [589] N叉树的前序遍历
 */

// @lc code=start

// Definition for a Node.

// class Node {
//     public int val;
//     public List<Node> children;

//     public Node() {
//     }

//     public Node(int _val) {
//         val = _val;
//     }

//     public Node(int _val, List<Node> _children) {
//         val = _val;
//         children = _children;
//     }
// };

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        this.process(root, result);
        return result;
    }

    public void process(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        if (node.children == null) {
            return;
        }
        for (int i = 0; i < node.children.size(); i++) {
            process(node.children.get(i), result);
        }
    }

    // public void process(Node node, List<Integer> result) {
    // if (node == null) {
    // return;
    // }

    // LinkedList<Node> stack = new LinkedList<>();
    // stack.push(node);
    // while (!stack.isEmpty()) {
    // Node root = stack.pollLast();
    // if (root == null) {
    // continue;
    // }
    // result.add(root.val);
    // if (node.children == null) {
    // continue;
    // }
    // int size = node.children.size();
    // for (int i = size - 1; i > 0; i--) {
    // if (node.children.get(i) != null) {
    // stack.push(node.children.get(i));
    // }
    // }
    // }

    // }
}
// @lc code=end
