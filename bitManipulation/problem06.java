/*
Question - Given an integer, every number occurs twice, find the number which occur only once.
*/

public class problem06 {
    public static void main(String[] args) {
        int[] array = { 4, 1, 5, 5, 4, 7, 8, 7, 8 };
        findUniqueMethod1(array);
        findUniqueMethod2(array);
    }

    // Method 1
    public static void findUniqueMethod1(int[] array) {
        int xor = 0;

        for (int i = 0; i < array.length; i++) {
            xor = xor ^ array[i];
        }
        System.out.println("Unique Element is --> " + xor);
    }

    // Method 2
    public static void findUniqueMethod2(int[] array) {
        int uniqueNumber = 0;

        for (int i = 0; i <= 31; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                if (((array[j] >> i) & 1) == 1) {
                    sum++;
                }
            }
            if (sum % 2 == 1) {
                uniqueNumber = uniqueNumber | (1 << i);
            }
        }
        System.out.println("Unique Element is --> " + uniqueNumber);
    }
}
