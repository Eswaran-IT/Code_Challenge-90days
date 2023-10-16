package day_11;

import java.util.LinkedList;
import java.util.List;
public class DupRem {
public static void main(String[] args) {
	System.out.println("Remove the duplicate");
	List<Integer> l1=new LinkedList<Integer>();
	l1.add(100);
	l1.add(200);
	l1.add(300);
	l1.add(400);
	l1.add(500);
	l1.add(100);
	l1.add(100);
	l1.add(200);
	l1.add(80);
	l1.add(400);
	l1.add(500);
	l1.add(600);
	for (Integer integer : l1) {
		System.out.println(integer);
		
	}
	//Count duplicates
  System.out.println("Count Duplicates");
  int size = l1.size();

  for (int i = 0; i < size; i++) {
      int current = l1.get(i);

      for (int j = i + 1; j < size; j++) {
          if (current == l1.get(j)) {
              l1.remove(j);
              size--;
              j--;
          }
      }
  }

  System.out.println("List after removing duplicates: " + l1);
}
}
