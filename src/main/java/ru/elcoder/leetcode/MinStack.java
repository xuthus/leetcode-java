package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by xuthus on 12.07.2017.
 */
@Difficulty(DifficultyLevel.Easy)
@BeatsPercent(46.72)
public class MinStack {
    /*
    Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
        push(x) -- Push element x onto stack.
        pop() -- Removes the element on top of the stack.
        top() -- Get the top element.
        getMin() -- Retrieve the minimum element in the stack.
    Example:
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();   --> Returns -3.
        minStack.pop();
        minStack.top();      --> Returns 0.
        minStack.getMin();   --> Returns -2.
    https://leetcode.com/problems/min-stack/
    */

    private StackItem head;

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        StackItem item = new StackItem(x);
        item.next = head;
        if (head != null && x > head.min) {
            item.min = head.min;
        }
        head = item;
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    class StackItem {
        int val;
        int min;
        StackItem next;

        public StackItem(int val) {
            this.val = val;
            this.min = val;
        }
    }
}
