package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 833,
        title = "Find And Replace in String",
        url = "https://leetcode.com/problems/find-and-replace-in-string/"
)
public class FindAndReplaceInStringSolution {
    public String findReplaceString(String s, int[] indexes, String[] sources, String[] targets) {
        List<Holder> ops = new ArrayList<>(indexes.length);
        // O(N)
        for (int i = 0; i < indexes.length; i++) {
            int index = indexes[i];
            String src = sources[i];
            // compare strings
            boolean equal = true;
            for (int j = 0; j < src.length(); j++)
                if (src.charAt(j) != s.charAt(index + j)) {
                    equal = false;
                    break;
                }
            if (!equal)
                continue;
            ops.add(new Holder(index, src, targets[i]));
        }
        if (ops.isEmpty())
            return s;
        // O(NlogN)
        Collections.sort(ops, (h1, h2) -> h1.index - h2.index);
        // O(N)
        StringBuilder sb = new StringBuilder(s.substring(0, ops.get(0).index));
        for (int i = 0; i < ops.size(); i++) {
            Holder op = ops.get(i);
            sb.append(op.target);
            if (i < ops.size() - 1)
                sb.append(s, op.index + op.src.length(), ops.get(i+1).index);
            else
                sb.append(s.substring(op.index + op.src.length()));
        }
        return sb.toString();
    }

    private static class Holder {
        int index;
        String src;
        String target;

        Holder(int i, String s, String t) {
            index = i;
            src = s;
            target = t;
        }
    }
}
