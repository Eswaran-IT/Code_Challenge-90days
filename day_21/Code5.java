package day_21;

import java.util.*;

public class Code5 {
    public static void main(String[] args) {
      Scanner get=new java.util.Scanner(System.in);
      char a[]=new char[10];
      int d=65;
      for (int i = 0; i < 10; i++) {
		a[i]=(char)d;
		d++;
	}
      System.out.println("Data in array->");
      for (char c : a) {
		System.out.print(c+" ");
	}
      get.close();
    }



}
