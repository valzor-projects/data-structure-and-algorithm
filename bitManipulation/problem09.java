
/*
Question- Given two binary strings A and B. Return their sum (also a binary string).
*/

public class problem09 {
    public static void main(String[] args) {
        String A = "1011";
        String B = "1001";
        addBinaryString(A, B);
    }

    static void addBinaryString(String A, String B) {
        StringBuilder result = new StringBuilder();
        int i = A.length() - 1;
        int j = B.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) {
                sum += A.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += A.charAt(j) - '0';
                j--;
            }

            carry = sum / 2;
            result.append(sum % 2);
        }
        System.out.println(result.reverse().toString());
    }
}
