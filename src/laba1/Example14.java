package laba1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Print number ");
        int a = in.nextInt();
        System.out.println((a-1) + " " + a + " " + (a+1) + " " + (9*a*a));
    }
}
