package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.NestedInteger;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Stack;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 341,
        title = "Flatten Nested List Iterator",
        url = "https://leetcode.com/problems/flatten-nested-list-iterator/"
)
public class FlattenNestedListIteratorSolution {
    public static class NestedIterator implements Iterator<Integer> {
        private final Stack<ListIterator<NestedInteger>> stack = new Stack<>();

        private ListIterator<NestedInteger> iterator;

        public NestedIterator(List<NestedInteger> nestedList) {
            if (nestedList == null) {
                nestedList = Collections.emptyList();
            }
            this.iterator = nestedList.listIterator();
        }

        @Override
        public Integer next() {
            final NestedInteger next = iterator.next();
            if (next == null) {
                if (stack.empty()) {
                    throw new NoSuchElementException();
                }
                iterator = stack.pop();
                return next();
            }
            if (next.isInteger()) {
                return next.getInteger();
            }
            stack.push(this.iterator);
            this.iterator = next.getList().listIterator();
            return next();
        }

        @Override
        public boolean hasNext() {
            final boolean result = iterator.hasNext();
            if (result) {
                final NestedInteger next = iterator.next();
                if (next.isInteger()) {
                    iterator.previous();
                    return true;
                }
                stack.push(iterator);
                iterator = next.getList().listIterator();
                return hasNext();
            }
            if (stack.empty()) {
                return false;
            }
            this.iterator = stack.pop();
            return hasNext();
        }
    }
}
