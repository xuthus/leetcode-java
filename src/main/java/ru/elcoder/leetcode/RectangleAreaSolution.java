package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(6.37) // TODO: 09.01.18 optimize it!
public class RectangleAreaSolution {

    /*
    Find the total area covered by two rectilinear rectangles in a 2D plane.

    Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

    Rectangle Area img: https://leetcode.com/static/images/problemset/rectangle_area.png

    Assume that the total area is never beyond the maximum possible value of int.
    https://leetcode.com/problems/rectangle-area/
    */
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        long A1 = ((long) C - A) * (D - B);
        long A2 = ((long) G - E) * (H - F);
        return (int) (A1 + A2 - intersectArea(A, B, C, D, E, F, G, H));
    }

    long intersectArea(int x11, int y11, int x12, int y12, int x21, int y21, int x22, int y22) {
        long intersectX = (long) Math.min(x12, x22) - Math.max(x11, x21);
        if (intersectX <= 0L)
            return 0L;
        long intersectY = (long) Math.min(y12, y22) - Math.max(y11, y21);
        if (intersectY <= 0L)
            return 0L;
        return intersectX * intersectY;
    }

    // not used in solution - inlined in intersectArea()
    int intersect(int a1, int a2, int b1, int b2) {
        return Math.min(a2, b2) - Math.max(a1, b1);
    }

}
