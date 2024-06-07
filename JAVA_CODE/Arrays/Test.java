import java.util.Arrays;

public class Test {

    public static void log(int... values) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            sb.append(values[i]);
            if (i < values.length - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        // int[] arr2 = new int[5];
        rotate2(arr, 3);
        display(arr);

    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        if (k < 0) {
            k = n + k;
        }
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

    }

    public static void rotate2(int[] arr, int k) {
        int n = arr.length;
        if (k < 0) {
            k = n + k;
        }
        k = k % n;

        for (int r = 1; r <= k; r++) {
            int temp = arr[n - 1];
            for (int i = n-1; i>0; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
    }

    public static void display(int[] arr) {
        for (int item : arr) {
            System.out.println(item);
        }
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int item : arr) {
            if (item > max)
                max = item;
        }
        return max;
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapArr(int[] arr, int[] arr2) {
        int[] temp = arr;
        arr = arr2;
        arr2 = temp;
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
