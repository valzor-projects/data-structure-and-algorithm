/*
Question:

You are given an integer array `arr` consisting only of `0`s and `1`s.

A subarray is called **good** if the bitwise **OR** of all its elements is equal to `0`.

Your task is to find the **total number of such good subarrays**.

Input:
An integer array `arr` of length `n`.

Output:
Return the count of subarrays whose bitwise OR is `0`.

Example:
Input:
`arr = {0, 0, 1, 0}`

Output:
`4`

Explanation:
The subarrays whose bitwise OR is `0` are:
`{0}` (index 0)
`{0}` (index 1)
`{0, 0}`
`{0}` (index 3)

Note:
The bitwise OR of a subarray is `0` **only if all elements in that subarray are `0`.

*/

public class problem04 {
    public static void main(String[] args) {
        int[] array = { 0, 0, 1, 0 };
        countOfSubArrays(array);
    }

    static void countOfSubArrays(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                int j = i;
                while (j < array.length && array[j] == 0) {
                    j++;
                }
                int length = j - i;
                count += (length * (length + 1)) / 2;
                i = j - 1;
            }
        }

        System.out.println("Total good subarrays: " + count);
    }
}
