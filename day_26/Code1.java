package day_26;

public class Code1 {
public static void main(String[] args) {
	System.out.println("Array operations");
	int a[]= {2,3,4,5,6};
	int target=-1;
	try {
		if (target>0) {
			
		
		for (int i = 0; i < a.length; i++) {
			int b=a[i];
		  for (int j = i+1; j < a.length; j++) {
			  b+=a[j];
			if(target==b){
			System.out.println("Found"+i +" and "+j);
			}
		  }}}
		else {
			throw new  Exception("Not a valid data valid  ");
		}}
	 catch (Exception e) {
		System.out.println(e);
	}
	
	
}
}
