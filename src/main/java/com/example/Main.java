package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        int x = add(a, b);

        System.out.print("X = ");
        System.out.print(x);
        System.out.println();
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
