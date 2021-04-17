package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 401,
        title = "Binary Watch",
        url = "https://leetcode.com/problems/binary-watch/"
)
public class BinaryWatchSolution {
public List<String> readBinaryWatch(int turnedOn) {
    return IntStream.range(0, 12)
            .boxed()
            .flatMap(h -> IntStream.range(0, 60)
                    .filter(m -> Integer.bitCount(m) + Integer.bitCount(h) == turnedOn)
                    .mapToObj(mm -> h + ":" + (mm < 10 ? "0" : "") + mm))
            .collect(Collectors.toList());
}
}
