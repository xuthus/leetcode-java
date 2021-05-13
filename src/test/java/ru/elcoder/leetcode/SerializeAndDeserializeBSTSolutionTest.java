package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SerializeAndDeserializeBSTSolutionTest {

    @Test
    public void serializeTest() {
        final SerializeAndDeserializeBSTSolution.Codec codec = new SerializeAndDeserializeBSTSolution.Codec();
        assertEquals("1", codec.serialize(new TreeNode(1)));
        assertEquals("10,5,15", codec.serialize(new TreeNode(10, new TreeNode(5), new TreeNode(15))));
        assertEquals("10,5,2,15", codec.serialize(
                new TreeNode(10,
                        new TreeNode(5,
                                new TreeNode(2),
                                null
                        ),
                        new TreeNode(15)))
        );
    }

    @Test
    public void deserializeTest() {
        final SerializeAndDeserializeBSTSolution.Codec codec = new SerializeAndDeserializeBSTSolution.Codec();
        TreeNode node = codec.deserialize("1");
        assertEquals(1, node.val);
        assertNull(node.left);
        assertNull(node.right);
        node = codec.deserialize("10,5,15");
        assertEquals(10, node.val);
        assertEquals(5, node.left.val);
        assertEquals(15, node.right.val);
        node = codec.deserialize("10,5,2,15");
        assertEquals(10, node.val);
        assertEquals(5, node.left.val);
        assertEquals(2, node.left.left.val);
        assertNull(node.left.right);
        assertNull(node.left.left.left);
        assertNull(node.left.left.right);
        assertEquals(15, node.right.val);
    }

}
