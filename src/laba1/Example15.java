package laba1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Print 2 numbers ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("sum = " + (a + b) + " dif = " + (a - b));
    }
}
