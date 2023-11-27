import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter an Year :: ");
        Scanner input = new Scanner(System.in);
        int leap = input.nextInt();

        if (((leap % 4 == 0) && (leap % 100 != 0)) || (leap % 400 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
        // int year;
//        System.out.println("Enter an Year :: ");
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//
//        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
//            System.out.println("Specified year is a leap year");
//        else
//            System.out.println("Specified year is not a leap year");
//    }
    }}
