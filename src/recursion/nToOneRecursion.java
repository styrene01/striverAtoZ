package recursion;

import java.util.Scanner;

public class nToOneRecursion {
	
	public static void print(int i, int n) {
		if(i<1) {
			return;
		}
		System.out.println(i);
		print(i-1,n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n,n);
		

	}

}
