package ru.elcoder.leetcode.models;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountableNodeTest {


    @Test
    @Ignore("In process") // TODO: 09.01.18 fix the test
    public void balance() {
        CountableNode node = new CountableNode(5);

        assertEquals(5, node.balanceTree().value);
        assertEquals(1, node.balanceTree().count);

        node.left = new CountableNode(3);
        node.count = 2;

        assertEquals(5, node.balanceTree().value);
        assertEquals(2, node.balanceTree().count);
        assertNull(node.balanceTree().right);
        assertNotNull(node.balanceTree().left);
        assertEquals(1, node.balanceTree().left.count);

        // необходима балансировка
        node.left.left = new CountableNode(2);
        node.count = 3;
        node.left.count = 2;

        node = node.balanceTree();
        assertEquals(3, node.value);
        assertEquals(3, node.count);
        assertNotNull(node.right);
        assertNotNull(node.left);
        assertEquals(1, node.left.count);
        assertEquals(1, node.right.count);

        node = new CountableNode(5);
        node.left = new CountableNode(3);
        node.count = 2;

        node.left.left = new CountableNode(2);
        node.count = 3;
        node.left.count = 2;

        node = node.balanceTree();
        node.remove(2);
    }

    @Test
    @Ignore("In process") // TODO: 09.01.18 fix the test
    public void addChild() throws Exception {
        CountableNode node = new CountableNode(2);
        assertEquals(1, node.countLessThan(3));
        assertEquals(0, node.countLessThan(2));
        assertEquals(0, node.countLessThan(1));
        assertEquals(1, node.count);
        assertEquals(0, node.countBiggerThan(3));
        assertEquals(1, node.countBiggerThan(-3));
        node = node.add(7);
        assertEquals(2, node.count);
        assertEquals(1, node.countLessThan(3));
        assertEquals(1, node.countLessThan(7));
        assertEquals(2, node.countLessThan(9));
        assertEquals(1, node.countBiggerThan(3));
        assertEquals(2, node.countBiggerThan(-3));
        node = node.add(3);
        assertEquals(3, node.count);
        node = node.add(1);
        assertEquals(4, node.count);
        node = node.add(0);
        node = node.add(2);
        node = node.add(9);
        node = node.add(5);
        node = node.add(4);
        assertEquals(9, node.count);
        assertEquals(7, node.countBiggerThan(1));
        assertEquals(4, node.countBiggerThan(3));
        assertEquals(1, node.countBiggerThan(8));
        assertEquals(0, node.countBiggerThan(9));
        node = node.add(9);
        assertEquals(2, node.countBiggerThan(8));
        assertEquals(10, node.count);
        assertEquals(10, node.countBiggerThan(-2));
        node = node.add(-1);
        assertEquals(11, node.countBiggerThan(-2));

        try {
            node.remove(8);
            fail();
        } catch (IllegalArgumentException ignored) {
            // all ok!
        }
        assertEquals(2, node.countBiggerThan(8));
        node.remove(9);
        assertEquals(1, node.countBiggerThan(8));
        node.remove(9);  // with node remove
        assertEquals(0, node.countBiggerThan(8));
        try {
            node.remove(9);
            fail();
        } catch (IllegalArgumentException ignored) {
            // all ok!
        }
        assertEquals(0, node.countBiggerThan(8));
        node = node.add(9);
        assertEquals(1, node.countBiggerThan(8));
        node.remove(9);
        assertEquals(0, node.countBiggerThan(8));
    }

}