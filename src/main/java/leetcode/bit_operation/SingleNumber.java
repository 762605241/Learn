package leetcode.bit_operation;
//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
// 说明： 
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
//
// 示例 1: 
//
// 输入: [2,2,1]
//输出: 1
// 
//
// 示例 2: 
//
// 输入: [4,1,2,1,2]
//输出: 4 
// Related Topics 位运算 哈希表 
// 👍 1889 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    /**
     * 两个相同数亦或其值为0, 任何数亦或0都为其本身。
     * 当只有一个数出现一次, 其余数都出现偶数次时, 将所有数字依次亦或, 结果就是出现一次的数。
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
