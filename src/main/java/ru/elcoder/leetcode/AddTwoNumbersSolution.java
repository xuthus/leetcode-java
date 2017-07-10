package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.ListNode;

/**
 * Created by xuthus on 10/07/2017.
 */
@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(65.43)
public class AddTwoNumbersSolution {
    /*
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
    order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    https://leetcode.com/problems/add-two-numbers/
    */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        ListNode result = l1;
        while (l1 != null) {
            if (l2 == null)
                break;
            l1.val += l2.val;
            addOverflow(l1);
            if (l1.next == null) {
                l1.next = l2.next;
                break;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return result;
    }

    private void addOverflow(ListNode list) {
        if (list.val < 10) return;
        list.val -= 10;
        if (list.next == null)
            list.next = new ListNode(1);
        else {
            list.next.val++;
            addOverflow(list.next);
        }
    }

}