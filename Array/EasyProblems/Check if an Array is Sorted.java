// Check if an Array is Sorted
//Brute force  T.C: O(N^2),  S.C: O(1)

public class Main {
  public static boolean isSorted(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[i])
          return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    int arr[] = {1, 2, 3, 4, 5}, n = 5;
    System.out.println(isSorted(arr, n));
  }
}

// Output: True
