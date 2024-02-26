package recursion;

import java.util.Scanner;

public class NTo1UsingBacktracking {
	
	public static void print(int i, int n) {
		if(i>n) {//when i is more than n function ends and returns values from 5 to 1
			return;
		}
		print(i+1,n);//we generally do i-1 for nto1 but using backtracking we do opposite
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(1,n);

	}

}
