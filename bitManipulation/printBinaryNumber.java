public class printBinaryNumber {
    public static void printBinary(int num) {
        if (num == 0) {
            System.out.println(0);
            return;
        }

        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        System.out.println(binary);
    }

    public static void main(String[] args) {
        printBinary(45);
        printBinary(25);
        printBinary(99);
    }
}