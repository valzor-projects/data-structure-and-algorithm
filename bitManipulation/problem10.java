/*
Question- Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
*/

public class problem10 {
    public static void main(String[] args) {
        int position = 50;
        findAthMagicNumber(position);
    }

    static void findAthMagicNumber(int position) {
        int result = 0;
        int power = 1;

        while (position > 0) {
            if (position % 2 != 0) {
                result += Math.pow(5, power);
            }

            power++;
            position >>= 1;
        }
        System.out.println(result);
    }
}