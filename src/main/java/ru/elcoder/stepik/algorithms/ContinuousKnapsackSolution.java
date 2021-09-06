package ru.elcoder.stepik.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ContinuousKnapsackSolution {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int totalVolume = scanner.nextInt();
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            int totalPrice = scanner.nextInt();
            int volume = scanner.nextInt();
            products[i] = new Product(totalPrice, volume);
        }
        Arrays.sort(products, Comparator.comparingDouble(p -> -p.price));
        double totalPrice = 0.0;
        for (int i = 0; i < products.length && totalVolume > 0; i++) {
            int volume = Math.min(totalVolume, products[i].volume);
            totalPrice += products[i].price * volume;
            totalVolume -= volume;
        }
        System.out.printf("%.3f%n", totalPrice);
    }

    private static class Product {
        int totalPrice;

        int volume;

        double price;

        public Product(int totalPrice, int volume) {
            this.totalPrice = totalPrice;
            this.volume = volume;
            this.price = totalPrice * 1.0 / volume;
        }
    }
}
