package recursion;

import java.util.Scanner;

public class OneToNBachtricking {
	//we assume not to go i+1 but only i-1
	public static void print(int i, int n) {
		if(i<1) {//if i goes negative then we want to break loop
			return;
		}
		print(i-1,n);//
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n,n);

	}

}
