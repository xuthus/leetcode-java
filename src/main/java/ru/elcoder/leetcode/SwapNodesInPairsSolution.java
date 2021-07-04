package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 24,
        title = "Swap Nodes in Pairs",
        url = "https://leetcode.com/problems/swap-nodes-in-pairs/"
)
public class SwapNodesInPairsSolution {
    public ListNode swapPairs(ListNode head) {
        return swapPair(head);
    }

    private ListNode swapPair(ListNode pair) {
        if (pair == null || pair.next == null) {
            return pair;
        }
        ListNode res = pair.next;
        ListNode tail = swapPair(pair.next.next);
        res.next = pair;
        pair.next = tail;
        return res;
    }
}
