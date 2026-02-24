/*
Question - Given an integer, every number occurs twice, find the two numbers which occur only once.
*/

public class problem08 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 1, 2, 4 };
        findUnique(array);
    }

    public static void findUnique(int[] array) {
        int xor = 0;

        // Step 1: XOR all elements
        for (int i = 0; i < array.length; i++) {
            xor ^= array[i];
        }

        // Step 2: Get rightmost set bit
        int setBit = xor & (-xor);

        // Step 3: Divide elements into two groups
        int num1 = 0, num2 = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & setBit) != 0) {
                num1 ^= array[i];
            } else {
                num2 ^= array[i];
            }
        }

        // Step 4: Return result in ascending order
        int[] uniqueElement = new int[2];
        if (num1 < num2) {
            uniqueElement[0] = num1;
            uniqueElement[1] = num2;
        } else {
            uniqueElement[0] = num2;
            uniqueElement[1] = num1;
        }

        System.out.println("Unique Elements are --> " + uniqueElement[0] + " and " + uniqueElement[1]);
    }
}
