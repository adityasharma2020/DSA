// An interface is like a blueprint for a class. 
// It defines a set of methods that a class implementing the interface must implement.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListQuestions {
  public static void main(String[] args) {
    int[] arr1 = { 10, 19, 20, 30, 30, 30, 30, 30, 30, 30, 40, 40, 40, 40, 50 };
    int[] arr2 = { 10, 15, 16, 17, 18, 19, 20, 25, 30, 40 };

    // intersection:
    // how we can use this sorting behaviour of arrays
    ArrayList<Integer> resultList = new ArrayList<>();

    int i = 0;
    int j = 0;

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] == arr2[j]) {
        i++;
        j++;
        resultList.add(arr1[i]);
      } else if (arr1[i] > arr2[j]) {
        j++;
      } else {
        i++;
      }
    }

    System.out.println(resultList);
  }
}
