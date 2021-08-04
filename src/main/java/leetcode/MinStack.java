package leetcode;//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
//
// 
// push(x) —— 将元素 x 推入栈中。 
// pop() —— 删除栈顶的元素。 
// top() —— 获取栈顶元素。 
// getMin() —— 检索栈中的最小元素。 
// 
//
// 
//
// 示例: 
//
// 输入：
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//输出：
//[null,null,null,null,-3,null,0,-2]
//
//解释：
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
// 
//
// 
//
// 提示： 
//
// 
// pop、top 和 getMin 操作总是在 非空栈 上调用。 
// 
// Related Topics 栈 设计 
// 👍 972 👎 0


import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

//leetcode submit region begin(Prohibit modification and deletion)
public class MinStack {
    LinkedList<Integer> linkedList;
    /** initialize your data structure here. */
    public MinStack() {
        linkedList = new LinkedList<>();
    }
    
    public void push(int val) {
        linkedList.addLast(val);
    }
    
    public void pop() {
        linkedList.removeLast();
    }
    
    public int top() {
        return linkedList.getLast();
    }
    
    public int getMin() {
        Integer integer = null;
        if (linkedList == null || linkedList.isEmpty()) {
            return integer;
        }
        Iterator<Integer> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (integer == null) {
                integer = next;
            } else if (integer > next) {
                integer = next;
            }
        }
        return integer;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)
