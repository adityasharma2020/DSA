public class Test {
    public static void main(String[] args) {
        System.out.println(armStrong(153));

    }

    public static boolean armStrong(int number) {
        int sum = 0;
        int initialNumber = number;
        int length = String.valueOf(initialNumber).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, length);
            number = number / 10;
        }

        return sum == initialNumber;
    }
}
