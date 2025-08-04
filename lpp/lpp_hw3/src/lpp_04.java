import java.util.Scanner;

public class lpp_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int mon = input.nextInt();
        int year = input.nextInt();

        if (!((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            if (mon == 1) {
                System.out.println(day + " JAN " + year);
            } else if (mon == 2) {
                if (day >= 29) {
                    System.out.println("Invalid");
                } else {
                    System.out.println(day + " FEB " + year);
                }
            } else if (mon == 3) {
                System.out.println(day + " MAR " + year);
            } else if (mon == 4) {
                if (day >= 31){
                    System.out.println("Invalid");
                }else
                    System.out.println(day + " APR " + year);
            } else if (mon == 5) {
                System.out.println(day + " MAY " + year);
            } else if (mon == 6) {
                System.out.println(day + " JUN " + year);
            } else if (mon == 7) {
                System.out.println(day + " JUL " + year);
            } else if (mon == 8) {
                System.out.println(day + " AUG " + year);
            } else if (mon == 9) {
                System.out.println(day + " SEP " + year);
            } else if (mon == 10) {
                System.out.println(day + " OCT " + year);
            } else if (mon == 11) {
                System.out.println(day + " NOV " + year);
            } else if (mon == 12) {
                System.out.println(day + " DEC " + year);
            }else{
                System.out.println("Invalid");
            }
        }else {
            if (mon == 1) {
                System.out.println(day + " JAN " + year);
            } else if (mon == 2) {
                System.out.println(day + " FEB " + year);
            } else if (mon == 3) {
                System.out.println(day + " MAR " + year);
            } else if (mon == 4) {
                System.out.println(day + " APR " + year);
            } else if (mon == 5) {
                System.out.println(day + " MAY " + year);
            } else if (mon == 6) {
                System.out.println(day + " JUN " + year);
            } else if (mon == 7) {
                System.out.println(day + " JUL " + year);
            } else if (mon == 8) {
                System.out.println(day + " AUG " + year);
            } else if (mon == 9) {
                System.out.println(day + " SEP " + year);
            } else if (mon == 10) {
                System.out.println(day + " OCT " + year);
            } else if (mon == 11) {
                System.out.println(day + " NOV " + year);
            } else if (mon == 12) {
                System.out.println(day + " DEC " + year);
            }else {
                System.out.println("Invalid");
            }
        }
    }
}


    /**
        } else if (year % 100 != 0) {
            System.out.println("leap year");

        } else {
            System.out.println("leap year");
        }
    }
} **/