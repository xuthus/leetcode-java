package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.RandomListNode;

import java.util.LinkedHashMap;
import java.util.Map;

@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(8.21)
public class CopyListWithRandomPointerSolution {

    /*
     A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
     Return a deep copy of the list.
    https://leetcode.com/problems/copy-list-with-random-pointer/
    */

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return null;
        RandomListNode res = null;
        LinkedHashMap<RandomListNode, RandomListNode> map = new LinkedHashMap<>();
        RandomListNode node = head;
        while (node != null) {
            map.put(node, new RandomListNode(node.label));
            node = node.next;
        }
        for (Map.Entry<RandomListNode, RandomListNode> entry : map.entrySet()) {
            RandomListNode newNode = entry.getValue();
            newNode.random = map.get(entry.getKey().random);
            if (res == null) {
                res = newNode;
                node = res;
            } else {
                node.next = newNode;
                node = node.next;
            }
        }
        return res;
    }

    // but this algorithm breaks source list
    public RandomListNode copyRandomListOptimized(RandomListNode head) {
        if (head == null)
            return null;
        // break source list - put new node after each
        // then scan source list, set random pointer in new nodes and build new list
        RandomListNode node = head;
        while (node != null) {
            RandomListNode newNode = new RandomListNode(node.label);
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
        }
        RandomListNode n1 = head;
        RandomListNode res = n1.next;
        RandomListNode tail = null;
        while (n1 != null) {
            RandomListNode m1 = n1.next;
            if (n1.random != null) {
                m1.random = n1.random.next;
            }
            if (tail == null) {
                tail = m1;
            } else {
                tail.next = m1;
                tail = tail.next;
            }
            n1 = m1.next;
        }
        return res;
    }

}
