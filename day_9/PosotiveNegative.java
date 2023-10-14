package day_9;

public class PosotiveNegative  {
	    public static void main(String[] args) {
	        int[] array = {-5, 10, -3, 8, -1, 4};
	        int n = array.length;

	        int[] positiveArray = new int[n];
	        int[] negativeArray = new int[n];
	        int posCount = 0;
	        int negCount = 0;

	        for (int i = 0; i < n; i++) {
	            if (array[i] >= 0) {
	                positiveArray[posCount] = array[i];
	                posCount++;
	            } else {
	                negativeArray[negCount] = array[i];
	                negCount++;
	            }
	        }

	        int[] resultArray = new int[n];
	        System.arraycopy(positiveArray, 0, resultArray, 0, posCount);
	        System.arraycopy(negativeArray, 0, resultArray, posCount, negCount);

	        for (int i : resultArray) {
	            System.out.print(i + " ");
	        }
	    }
	

}
