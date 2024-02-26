package hashing;

import java.util.Scanner;

public class CharacterHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String upperString = sc.next();
		int t = sc.nextInt();
		
		//computing hash
		
		//for only lowercase or only uppercase letters
		int[] hash = new int[26];//since only 26 alphabets
		for(int i=0;i<s.length();i++) {
			hash[s.charAt(i)-'a']++;
		}
		
		//for any character
		int[] hashh = new int [256];
		for(int i=0;i<upperString.length();i++) {
			hashh[upperString.charAt(i)]++;
		}
		
		
		while(t-- != 0) {
			char c = sc.next().charAt(0);
//			System.out.println(c + ":" + hash[c-'a']);
			System.out.println(c + ":" + hashh[c]);
		}
		

	}

}
