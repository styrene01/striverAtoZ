package recursion;

import java.util.Scanner;

public class nameFivetimes {
	
	public static void print(int i,int n) {
		if(i<=n) {
			System.out.println("Harsh");
			print(i+1,n);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(1,n);

	}

}
