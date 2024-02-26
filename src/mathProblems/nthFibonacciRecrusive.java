package mathProblems;
import java.util.Scanner;

public class nthFibonacciRecrusive {
	static int Fib(int n) {
		if(n==0)
			return 0;
		else if(n==1 || n==2)
			return 1;
		int nfib=Fib(n-1)+Fib(n-2);
		return nfib; 	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nth=Fib(n);
		System.out.println(nth);
	}

}
