package day_22;
public class Code1 {
	    public static int majorityElement(int []v) {
	        int n = v.length;
	        for (int i = 0; i < n; i++) {
	            int cnt = 0;
	            for (int j = 0; j < n; j++) {
	                if (v[j] == v[i]) {
	                    cnt++;
	                }
	            }
	            if (cnt > (n / 2))
	                return v[i];
	        }

	        return -1;
	    }

	    public static void main(String args[]) {
	        int[] arr = {2, 2, 1, 1, 1, 2, 2};
	        int ans = majorityElement(arr);
	        System.out.println("The majority element is: " + ans);

	    

	} 


}
