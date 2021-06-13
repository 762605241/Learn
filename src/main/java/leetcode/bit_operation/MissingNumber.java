package leetcode.bit_operation;
//给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
//
// 
//
// 进阶： 
//
// 
// 你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题? 
// 
//
// 
//
// 示例 1： 
//
// 
    //输入：nums = [3,0,1]
//输出：2
//解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。 
//
// 示例 2： 
//
// 
//输入：nums = [0,1]
//输出：2
//解释：n = 2，因为有 2 个数字，所以所有的数字都在范围 [0,2] 内。2 是丢失的数字，因为它没有出现在 nums 中。 
//
// 示例 3： 
//
// 
//输入：nums = [9,6,4,2,3,5,7,0,1]
//输出：8
//解释：n = 9，因为有 9 个数字，所以所有的数字都在范围 [0,9] 内。8 是丢失的数字，因为它没有出现在 nums 中。 
//
// 示例 4： 
//
// 
//输入：nums = [0]
//输出：1
//解释：n = 1，因为有 1 个数字，所以所有的数字都在范围 [0,1] 内。1 是丢失的数字，因为它没有出现在 nums 中。 
//
// 
//
// 提示： 
//
// 
// n == nums.length 
// 1 <= n <= 104 
// 0 <= nums[i] <= n 
// nums 中的所有数字都 独一无二 
// 
// Related Topics 位运算 数组 数学 
// 👍 407 👎 0


import java.util.Arrays;
import java.util.stream.Stream;

//leetcode submit region begin(Prohibit modification and deletion)
class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));
    }

    public static int missingNumber(int[] nums) {
        /**
         * 数组长度 即 n, 数据范围
         */
        /**
         * 方法一: 暴力法, 对数组排序, 从下标0处开始对比
         * 			解答成功:
         * 			执行耗时:6 ms,击败了30.44% 的Java用户
         * 			内存消耗:39.1 MB,击败了21.28% 的Java用户
         */
//        Arrays.sort(nums);
//        int n = nums.length;
//        int i = 0;
//        for (; i < n; i++) {
//            if (i != nums[i]) {
//                return i;
//            }
//        }
//        return i;
        int n = nums.length;
        /**
         * 使用 ^ 亦或 运算
         * 将给定数组增加元素 使其变成0-n 只有1个数出现过一次
         * 			解答成功:
         * 			执行耗时:0 ms,击败了100.00% 的Java用户
         * 			内存消耗:38.5 MB,击败了93.45% 的Java用户
         */
        int res = n;
        for (int i = 0; i < n; i++) {
            res =  res ^ i ^ nums[i];
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
