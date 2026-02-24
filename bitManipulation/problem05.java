/*
Question - Find the Maximum Pair in an array, so that when we use 'AND' operator between them, value is maximum.
*/

public class problem05 {
    public static void main(String[] args) {
        int[] array = { 26, 13, 23, 28, 27, 7, 25 };
        findMaximumANDPair(array);
    }

    static void findMaximumANDPair(int[] array) {
        int maxAND = 0;
        int pair1 = -1, pair2 = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int and = array[i] & array[j];

                if (and > maxAND) {
                    pair1 = array[i];
                    pair2 = array[j];
                }
            }
        }

        System.out.println("Maximum AND Pair: " + pair1 + " and " + pair2);
    }
}