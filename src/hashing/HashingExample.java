package hashing;

import java.util.Scanner;

public class HashingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//compute hash array
		int[] hash = new int[n+1];
		for(int i=0;i<n;i++) {
			hash[arr[i]] += 1;
		}
		
		int t = sc.nextInt();
		while(t-- != 0) {
			int a = sc.nextInt();
			//fetch
			System.out.println(a + ":" + hash[a]);
		}
	}

}
