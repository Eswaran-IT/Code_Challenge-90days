package day_59;

public class Code2 {
	  static int evenlyDivides(int N){
	        Boolean b=true;
	        int temp=0;
	        String a=Integer.toString(N);
	        System.out.println(a);
	        System.out.println(a.length());
	       for(int i=0;i<a.length();i++)
	       {
	          temp=a.charAt(i);
	           b=(N%temp==0)?true:false;
	       }
	        return (b==false)?0:temp;
	    }
	public static void main(String[] args) {
		System.out.println("EVEN DIVIDES");
		System.out.println(evenlyDivides(12));
	}
}
