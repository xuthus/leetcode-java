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

}
