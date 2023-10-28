// Kth Missing Positive Number

import java.util.*;

public class Main {
    public static int missingK(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low ) / 2;
            if (arr[mid]- mid + 1 > = k) {
                ans = mid
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans + k;
    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 10};
        int n = 4, k = 4;
        int ans = missingK(vec, n, k);
        System.out.println("The missing number is: " + ans);
    }
}
