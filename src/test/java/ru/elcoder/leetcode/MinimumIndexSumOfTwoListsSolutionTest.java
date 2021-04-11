package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MinimumIndexSumOfTwoListsSolutionTest {

    @Test
    public void findRestaurant1() {
        final MinimumIndexSumOfTwoListsSolution solution = new MinimumIndexSumOfTwoListsSolution();
        assertArrayEquals(
                arrayOf("Shogun"),
                solution.findRestaurant(
                        arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
                        arrayOf("Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun")
                )
        );
    }

    @Test
    public void findRestaurant2() {
        final MinimumIndexSumOfTwoListsSolution solution = new MinimumIndexSumOfTwoListsSolution();
        assertArrayEquals(
                arrayOf("Shogun"),
                solution.findRestaurant(
                        arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
                        arrayOf("KFC", "Shogun", "Burger King")
                )
        );
    }

    @Test
    public void findRestaurant3() {
        final MinimumIndexSumOfTwoListsSolution solution = new MinimumIndexSumOfTwoListsSolution();
        assertArrayEquals(
                arrayOf("KFC", "Burger King", "Tapioca Express", "Shogun"),
                solution.findRestaurant(
                        arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
                        arrayOf("KFC", "Burger King", "Tapioca Express", "Shogun")
                )
        );
    }

    @Test
    public void findRestaurant4() {
        final MinimumIndexSumOfTwoListsSolution solution = new MinimumIndexSumOfTwoListsSolution();
        assertArrayEquals(
                arrayOf("KFC", "Burger King", "Tapioca Express", "Shogun"),
                solution.findRestaurant(
                        arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
                        arrayOf("KNN", "KFC", "Burger King", "Tapioca Express", "Shogun")
                )
        );
    }

    @Test
    public void findRestaurant5() {
        final MinimumIndexSumOfTwoListsSolution solution = new MinimumIndexSumOfTwoListsSolution();
        assertArrayEquals(
                arrayOf("KFC"),
                solution.findRestaurant(
                        arrayOf("KFC"),
                        arrayOf("KFC")
                )
        );
    }
}