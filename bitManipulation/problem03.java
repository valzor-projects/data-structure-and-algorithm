//  Question - Given an integer N and count the number of set bit?
/*
Unset - 0
Set - 1
*/

import java.util.*;

public class problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        sc.close();
        countSetBitMethod1(number);
        countSetBitMethod2(number);
    }

    // Method 1
    static void countSetBitMethod1(int number) {
        int count = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
                count++;
            }
            number >>= 1;
        }

        System.out.println("Number of Set Bit's are: " + count);
    }

    // Method 2
    static void countSetBitMethod2(int number) {
        int count = 0;
        while (number != 0) {
            number = number & (number - 1);
            count++;
        }

        System.out.println("Number of Set Bit's are: " + count);
    }
}
