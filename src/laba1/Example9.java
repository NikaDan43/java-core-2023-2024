package laba1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input number of days in a month: ");
        int days = in.nextInt();

        System.out.printf("In %s %d days \n" ,month, days);
        in.close();
    }
}
