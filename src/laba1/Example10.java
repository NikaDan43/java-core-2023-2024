package laba1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your birth date d m y: ");
        int birthday = in.nextInt();
        int birthmonth = in.nextInt();
        int birthyear = in.nextInt();

        LocalDate todaydate = LocalDate.now();
        if (birthmonth < todaydate.getMonthValue())
            --birthyear;
        if (birthmonth == todaydate.getMonthValue())
            if(birthday < todaydate.getDayOfMonth())
                --birthyear;

        System.out.println("Your age is " + (todaydate.getYear() - birthyear - 1));
        in.close();
    }
}
