package day_44;

public class Code1 {
	    public static int search(int[] nums, int target) {
	        if(nums.length==1){
	            return nums[0]==target?0:-1;
	        }
	        for(int i=0;i<nums.length;i++){
	            if(target==nums[i]){
	                return i;
	            }
	        }
	        return -1;
	    }
	
	public static void main(String[] args) {
		int[] n= {1,2,33,4,5};
		System.out.println("Index of target:"+search(n,4));
	}
}
