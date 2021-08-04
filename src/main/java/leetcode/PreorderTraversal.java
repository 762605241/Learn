package leetcode;

//给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
//
//
//
// 示例 1：
//
//
//输入：root = [1,null,2,3]
//输出：[1,2,3]
//
//
// 示例 2：
//
//
//输入：root = []
//输出：[]
//
//
// 示例 3：
//
//
//输入：root = [1]
//输出：[1]
//
//
// 示例 4：
//
//
//输入：root = [1,2]
//输出：[1,2]
//
//
// 示例 5：
//
//
//输入：root = [1,null,2]
//输出：[1,2]
//
//
//
//
// 提示：
//
//
// 树中节点数目在范围 [0, 100] 内
// -100 <= Node.val <= 100
//
//
//
//
// 进阶：递归算法很简单，你可以通过迭代算法完成吗？
// Related Topics 栈 树 深度优先搜索 二叉树
// 👍 615 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class PreorderTraversal {
    public ArrayList<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        // 递归遍历
        preorderTraversal2(root);
        return result;
    }
    public void preorderTraversal2(TreeNode root) {
        // 递归遍历
        if (root == null) {
            return;
        }
        result.add(root.val);
        preorderTraversal2(root.left);
        preorderTraversal2(root.right);
    }

    public List<Integer> preorderTraversal3(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty() && root != null) {
            TreeNode tempNode = stack.poll();
            res.add(tempNode.val);
            if (tempNode.left != null) {
                stack.push(tempNode.left);
            }
            if (tempNode.right != null) {
                stack.push(tempNode.right);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
