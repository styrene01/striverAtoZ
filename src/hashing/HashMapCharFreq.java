package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapCharFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			int freq = 0;
			if(map.containsKey(s.charAt(i))) freq = map.get(s.charAt(i));
			//returns value/freq if key
			freq++;
			map.put(s.charAt(i), freq);
		}
		
		int t = sc.nextInt();
		while(t-- != 0) {
			char c = sc.next().charAt(0);
			//fetch
			if(map.containsKey(c)) System.out.println(c + ":" + map.get(c));
			else System.out.println(0);
		}

	}

}
