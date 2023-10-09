package day_4;

import java.util.ArrayList;

class ArraylistSubarray
{
	public static void main(String[] args) {
	 int array[] = {1,2,3,4,5};
		subarraySum(array, 5, 3);
		 ArrayList<Integer> result = subarraySum(array, 5, 3);
	        System.out.println("Output will be:");
	        for (Integer num : result) {
	            System.out.print(num + " ");
	        }
		
	}
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int num=0;
        ArrayList<Integer> hi=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {  num=0;
            num+=arr[i];
            if(num==s){
                hi.add(i+1);
                hi.add(i+1);
                return hi;
            }
            
            for(int j=i+1;j<arr.length;j++)
            
        {
            num+=arr[j];
            if(s<num){
                break;
            }
            
            if(num==s){
                hi.add(i+1);
                hi.add(j+1);
                return hi;
            }
            
        }
    }
    hi.add(-1);
    return hi;
    }}