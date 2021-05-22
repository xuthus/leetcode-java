package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 635,
        title = "Design Log Storage System",
        url = "https://leetcode.com/problems/design-log-storage-system/"
)
public class DesignLogStorageSystemSolution {
    TreeMap<String, List<Integer>> map = new TreeMap<>();

    public DesignLogStorageSystemSolution() {
    }

    public void put(int id, String timestamp) {
        map.computeIfAbsent(timestamp, k -> new LinkedList<>()).add(id);
    }

    public List<Integer> retrieve(String start, String end, String granularity) {
        char[] cStart = start.toCharArray();
        char[] cEnd = end.toCharArray();
        switch (granularity) {
            case "Year":
                cStart[5] = '0';
                cStart[6] = '0';
                cEnd[5] = '1';
                cEnd[6] = '2';
            case "Month":
                cStart[8] = '0';
                cStart[9] = '0';
                cEnd[8] = '3';
                cEnd[9] = '1';
            case "Day":
                cStart[11] = '0';
                cStart[12] = '0';
                cEnd[11] = '2';
                cEnd[12] = '3';
            case "Hour":
                cStart[14] = '0';
                cStart[15] = '0';
                cEnd[14] = '5';
                cEnd[15] = '9';
            case "Minute":
                cStart[17] = '0';
                cStart[18] = '0';
                cEnd[17] = '5';
                cEnd[18] = '9';
        }
        start = new String(cStart);
        end = new String(cEnd);
        List<Integer> res = new LinkedList<>();
        for (List<Integer> list : map.tailMap(start, true).headMap(end, true).values())
            res.addAll(list);
        return res;
    }

}
