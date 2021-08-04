package leetcode;//给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
//
// 如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 1
//输出：true
//解释：20 = 1
// 
//
// 示例 2： 
//
// 
//输入：n = 16
//输出：true
//解释：24 = 16
// 
//
// 示例 3： 
//
// 
//输入：n = 3
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：n = 4
//输出：true
// 
//
// 示例 5： 
//
// 
//输入：n = 5
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// -231 <= n <= 231 - 1 
// 
//
// 
//
// 进阶：你能够不使用循环/递归解决此问题吗？ 
// Related Topics 位运算 数学 
// 👍 376 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class IsPowerOfTwo {
    public static void main(String[] args) {
//        System.out.println(isPowerOfTwo(2147483647));
        System.out.println(Integer.toBinaryString(15));
        System.out.println(Integer.toBinaryString(-15));
        System.out.println(15 & -15);
    }

    public static boolean isPowerOfTwo(int n) {
        /**
         *         方法1: 暴力求解
         *         解答成功:
         *         执行耗时:2 ms,击败了7.32% 的Java用户
         *         内存消耗:35.3 MB,击败了88.92% 的Java用户
         */
//        int index = 0;
//        double res = 1;
//        while (res < n) {
//            res = Math.pow(2, index);
//            System.out.println(index + "---" + res);
//            if (res == n) {
//                return true;
//            }
//            index++;
//        }
//        return false;
        /**
         * 方法二: 1 不断左移 即 不断乘以 2
         *			解答成功:
         * 			执行耗时:1 ms,击败了100.00% 的Java用户
         * 			内存消耗:35.2 MB,击败了97.70% 的Java用户
         */
//        int res = 1;
//        if (n == res) {
//            return true;
//        }
//        while (res < n && res > 0) {
//            res = res << 1;
//            if (res == n) {
//                return true;
//            }
//        }
//        return false;
        /**
         * 方法三: 2的倍数, 二进制中最高位=1, 之后所有位数=0
         * n 若是2的倍数, 那么 n & (n - 1) 执行1次之后, n 应为0
         * 0 不是 2的整数次幂; 负整数不是2的整数次幂
         * 			解答成功:
         * 			执行耗时:1 ms,击败了100.00% 的Java用户
         * 			内存消耗:35.3 MB,击败了86.95% 的Java用户
         */
        if (n == 0 || n < 0) {
            return false;
        }
        n = n & (n - 1);
        return n == 0 ? true : false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
