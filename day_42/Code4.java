package day_42;

public class Code4 {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};
	        int indexToInsert = 2;
	        int valueToInsert = 10;
	        int[] newArray = new int[numbers.length + 1];
	        System.arraycopy(numbers, 0, newArray, 0, indexToInsert);
	        newArray[indexToInsert] = valueToInsert;
	        System.arraycopy(numbers, indexToInsert, newArray, indexToInsert + 1, numbers.length - indexToInsert);
	        System.out.print("Modified Array: ");
	        for (int number : newArray) {
	            System.out.print(number + " ");
	        
	    }
	}

}
