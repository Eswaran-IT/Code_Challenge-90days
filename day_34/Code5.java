package day_34;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;



public class Code5 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while (t-- > 0) {
	            int n = sc.nextInt();
	            int[] a = new int[n];
	            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
	            Solution g = new Solution();
	            ArrayList<Integer> ans = Solution.duplicates(a, n);
	            for (Integer val : ans) System.out.print(val + " ");
	            System.out.println();
	        }
	    
	    sc.close();
	    }
	    
	}

	// } Driver Code Ends


	class Solution {
	    public static ArrayList<Integer> duplicates(int arr[], int n) {
	        // code here
	    ArrayList<Integer> result = new ArrayList<>();
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    // Check if the element is not already in the result list
	                    if (!result.contains(arr[i])) {
	                        result.add(arr[i]);
	                    }
	                    break;  // Break to avoid adding the same element multiple times
	                }
	            }
	        }

	        // If no duplicates are found, add -1 to the list
	        if (result.isEmpty()) {
	            result.add(-1);
	        }

	        // Sort the result list
	        Collections.sort(result);

	        return result;
	    
	}
}
