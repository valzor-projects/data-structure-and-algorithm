import java.util.*;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a Number: ");
        int number = sc.nextInt();

        if ((number & 1) == 0)
            System.out.print("Even");
        else
            System.out.print("Odd");
        sc.close();
    }
}