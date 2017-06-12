package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.ListNode;

/**
 * Created by xuthus on 12.06.2017.
 */
public class DeleteNodeInLinkedListSolution {
    /*
    Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
    Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
    https://leetcode.com/problems/delete-node-in-a-linked-list/
    */
    public void deleteNode(ListNode node) {
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
