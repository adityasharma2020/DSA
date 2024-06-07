public class TwoDArray {
    public static void main(String[] args) {
        int[][] a = new int[3][4];

        int[][] b = {
                new int[] { 1, 2, 10, 11 },
                new int[] { 3, 4, 5, 12 },
                new int[] { 6, 7, 8, 9 }
        };

        printWave(b);
    }

    public static void printWave(int[][] arr) {

        for (int k = 0; k < arr[0].length; k++) {

            if (k % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[j][k]);
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.println(arr[j][k]);
                }
            }

        }

    }
}
