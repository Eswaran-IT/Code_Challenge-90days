package day_1;

public class Maxfinder {
    public static void main(String[] args) {
		System.out.println("Max element in Array");
		int a[]= {22,33,65,11,34,5,1},max=a[0];
		for (int i = 0; i < a.length; i++) {
			if(max<=a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println("Max Element is"+max);
	}
}
