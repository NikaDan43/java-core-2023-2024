package laba1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input second name: ");
        String sname = in.nextLine();

        System.out.println("Input first name: ");
        String fname = in.nextLine();

        System.out.println("Input surname: ");
        String surname = in.nextLine();

        System.out.println("Hello " + sname + " " + fname + " " + surname);
        in.close();
    }
}
