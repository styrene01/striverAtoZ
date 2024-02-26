package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNumberFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		//compute using hashmap
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int freq = 0;
			if(map.containsKey(arr[i])) freq = map.get(arr[i]); //returns value/freq of key/arr[i]
			freq++;
			map.put(arr[i], freq);
			
		}
		
		int t = sc.nextInt();
		while(t-- != 0) {
			int number = sc.nextInt();
			if(map.containsKey(number)) System.out.println(map.get(number));//returns value/freq
			else System.out.println(0);
		}
	}
}
