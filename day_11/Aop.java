package day_11;

import java.util.Arrays;
import java.util.List;

public class Aop {

	public static void main(String[] args) {
		System.out.println("Final Array Operations");
		int a[]=new int[10];
		int []b =new int [10];
		Integer wrapInteger[]=new Integer[10];
		for (int i = 0; i < a.length; i++) {
			b[i]=i;
			wrapInteger[i]=i+1;
		}
		for (Integer integer : wrapInteger) {
			System.out.println(integer);
		}
		for (int integer : b) {
			System.out.println(integer);
		}
		
		
		
		System.out.println("UsinG Methods");
	String nameString=	Arrays.toString(wrapInteger);
		System.out.println(nameString);
    List<Integer> ar=Arrays.asList(wrapInteger);
    //compare lexicographically
 int s=   Arrays.compare(a, b);
 System.out.println(s);
		System.out.println(ar);
		//binary search
	int ans=	Arrays.binarySearch(wrapInteger, 6);
		System.out.println(ans);
//to string 
Arrays.sort(a);		
System.out.println(a);
	}

}
