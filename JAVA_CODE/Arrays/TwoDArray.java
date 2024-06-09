import java.util.ArrayList;
import java.util.List;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] a = {
                new int[] { 1, 2, 10, 11 },
                new int[] { 3, 4, 5, 12 },
                new int[] { 6, 7, 8, 9 }
        };

        int[][] b = {
                new int[] { 1, 2, 10 },
                new int[] { 3, 4, 5},
                new int[] { 6, 7, 8 },
                new int[] { 6, 7, 8 }
        };

        // printWave(b);
        // transposeMatrix(b);
        matrixMul(a, b);
        spiralMatrix(b);

    }

    public static void spiralMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;
        int count = rows *cols;

       
       while(count >0 ){
          for(int j=colStart;j<=colEnd;j++){
            result.add(matrix[rowStart][j]);
            count--;
        }   
        
        rowStart++;
        if(count == 0) break;

        
        for(int i=rowStart;i<=rowEnd;i++){
         result.add(matrix[i][colEnd]);
         count--;
        }
        colEnd--;
         if(count == 0) break;

        for(int j=colEnd;j>=colStart;j--){
              result.add(matrix[rowEnd][j]);
               count--;
        }
         rowEnd--;
          if(count == 0) break;

       
        for(int i=rowEnd;i>=rowStart;i--){
             result.add(matrix[i][colStart]);
              count--;
         
        }
        colStart++;
        if(count == 0) break;

       }
       

        System.out.println(result);
    }

    public static void matrixMul(int[][] a, int[][] b) {
        int rows1 = a.length;
        int cols1 = a[0].length;

        int rows2 = b.length;
        int cols2 = b[0].length;

        System.out.println(cols1 + " " + rows2);
        if (cols1 != rows2) return;
        
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < cols1; k++) {
                    sum += a[i][j] * b[j][i];
                }
                result[i][j] = sum;

            }
        }
        display2d(result);
    }

    public static void transposeMatrix(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = arr[i][j];
            }
        }

        display2d(result);

    }

    public static void display2d(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
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
