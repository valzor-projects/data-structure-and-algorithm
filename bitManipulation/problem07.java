/*
Question - Given an integer, every number occurs three times, find the number which occur only once.
*/

public class problem07 {
    public static void main(String[] args) {
        int[] array = { 4, 1, 5, 5, 4, 7, 8, 7, 8, 4, 5, 7, 8 };
        findUnique(array);
    }

    public static void findUnique(int[] array) {
        int uniqueNumber = 0;

        for (int i = 0; i <= 31; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                if (((array[j] >> i) & 1) == 1) {
                    sum++;
                }
            }
            if (sum % 3 == 1) {
                uniqueNumber = uniqueNumber | (1 << i);
            }
        }
        System.out.println("Unique Element is --> " + uniqueNumber);
    }
}
