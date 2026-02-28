//  Question - Given an integer N and a position i (0-indexing), check the ith bit of the integer?
/*
Unset - 0
Set - 1
*/

import java.util.*;

public class problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        System.out.print("Enter the ith bit to check: ");
        int position = sc.nextInt();
        checkBit(number, position);
        sc.close();
    }

    static void checkBit(int number, int position) {
        if (((number) & (1 << position)) == 0) {
            System.out.println("The Bit is Unset");
        } else {
            System.out.print("The Bit is Set");
        }
    }
}