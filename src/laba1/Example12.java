package laba1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();

        LocalDate todaydate = LocalDate.now();

        System.out.println("You born in " + (todaydate.getYear() - age));
        in.close();
    }
}
