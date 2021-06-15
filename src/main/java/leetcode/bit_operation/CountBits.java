package leetcode.bit_operation;
//给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
//
// 示例 1: 
//
// 输入: 2
//输出: [0,1,1] 
//
// 示例 2: 
//
// 输入: 5
//输出: [0,1,1,2,1,2] 
//
// 进阶: 
//
// 
// 给出时间复杂度为O(n*sizeof(integer))的解答非常容易。但你可以在线性时间O(n)内用一趟扫描做到吗？ 
// 要求算法的空间复杂度为O(n)。 
// 你能进一步完善解法吗？要求在C++或任何其他语言中不使用任何内置函数（如 C++ 中的 __builtin_popcount）来执行此操作。 
// 
// Related Topics 位运算 动态规划 
// 👍 751 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class CountBits {
    public static void main(String[] args) {
        int[] ints = countBits(3);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] countBits(int n) {
        /**
         * 方法一: 暴力法, 依次计算0~n的二进制1的个数
         * 			解答成功:
         * 			执行耗时:2 ms,击败了63.57% 的Java用户
         * 			内存消耗:42.3 MB,击败了90.06% 的Java用户
         */
        int[] result = new int[n + 1];
//        for (int i = 0; i <= n; i++) {
//            result[i] = Integer.bitCount(i);
//        }

        /**
         * 方法二：
         * 对于所有的数字，只有两类：
         *
         * 奇数：二进制表示中，奇数一定比前面那个偶数多一个 1，因为多的就是最低位的 1。
         *           举例：
         *          0 = 0       1 = 1
         *          2 = 10      3 = 11
         * 偶数：二进制表示中，偶数中 1 的个数一定和除以 2 之后的那个数一样多。因为最低位是 0，除以 2 就是右移一位，也就是把那个 0 抹掉而已，所以 1 的个数是不变的。
         *            举例：
         *           2 = 10       4 = 100       8 = 1000
         *           3 = 11       6 = 110       12 = 1100
         * 另外，0 的 1 个数为 0，于是就可以根据奇偶性开始遍历计算了。
         */
        for (int i = 0; i <= n; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
