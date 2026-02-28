//  Question - Given an integer N and change the first set bit from the Left Side/Back Side?
/*
Unset - 0
Set - 1
*/

import java.util.*;

public class problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        sc.close();

        int result = changeFirstSetBitFromLeft(number);
        System.out.println("Original: " + number + " (" + Integer.toBinaryString(number) + ")");
        System.out.println("Result: " + result + " (" + Integer.toBinaryString(result) + ")");
    }

    static int changeFirstSetBitFromLeft(int number) {
        int index = (number & -number);

        number = (number ^ index);
        return number;
    }
}