package leetcode;

//给定一个二叉树，返回它的 后序 遍历。
//
// 示例:
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [3,2,1]
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
// Related Topics 栈 树 深度优先搜索 二叉树
// 👍 638 👎 0


//leetcode submit region begin(Prohibit modification and deletion)


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class PostorderTraversal {
    ArrayList<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorderTraversal2(root);
        return result;
    }

    public void postorderTraversal2(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            postorderTraversal2(root.left);
        }
        if (root.right != null) {
            postorderTraversal2(root.right);
        }
        result.add(root.val);
    }

    public List<Integer> postorderTraversal3(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.right;
            }
            TreeNode tempNode = stack.pop();
            if (tempNode.left != null) {
                root = tempNode.left;
                res.add(root.val);
            }
        }
        return res;
    }

    public List<Integer> postorderTraversal4(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        TreeNode p1 = root, p2 = null;

        while (p1 != null) {
            p2 = p1.left;
            if (p2 != null) {
                while (p2.right != null && p2.right != p1) {
                    p2 = p2.right;
                }
                if (p2.right == null) {
                    p2.right = p1;
                    p1 = p1.left;
                    continue;
                } else {
                    p2.right = null;
                    addPath(res, p1.left);
                }
            }
            p1 = p1.right;
        }
        addPath(res, root);
        return res;
    }

    public void addPath(List<Integer> res, TreeNode node) {
        int count = 0;
        while (node != null) {
            ++count;
            res.add(node.val);
            node = node.right;
        }
        int left = res.size() - count, right = res.size() - 1;
        while (left < right) {
            int temp = res.get(left);
            res.set(left, res.get(right));
            res.set(right, temp);
            left++;
            right--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
