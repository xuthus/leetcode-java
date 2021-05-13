package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertEquals;

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

}
