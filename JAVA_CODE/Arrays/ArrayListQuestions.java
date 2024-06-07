// An interface is like a blueprint for a class. 
// It defines a set of methods that a class implementing the interface must implement.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListQuestions {
  public static void main(String[] args) {
    int[] arr1 = { 5, 6, 7 };
    int[] arr2 = { 3, 4, 4, 6 };

    // intersection:
    // how we can use this sorting behaviour of arrays
    // intersection(arr1, arr2);
    add(arr1, arr2);
  }

  public static void add(int[] arr1, int[] arr2) {
    int carry = 0;
    ArrayList<Integer> list = new ArrayList<>();
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    while (i >= 0 || j >= 0 || carry > 0) {
      int sum = carry;
      if (i >= 0) {
        sum += arr1[i];
        i--;
      }

      if (j >= 0) {
        sum += arr2[j];
        j--;
      }

      carry = sum / 10;
      sum = sum % 10;
      list.add(sum);
    }
    Collections.reverse(list);
    System.out.println(list);
    // convert arraylist to array
    int[] result = new int[list.size()];
    for (int k = 0; k < list.size(); k++) {
      result[result.length - 1 - k] = list.get(k);
    }

    display(result);
  }

  public static void display(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void intersection(int[] arr1, int[] arr2) {
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
