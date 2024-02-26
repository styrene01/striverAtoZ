package sorting;

import java.util.Scanner;

public class InsertionSort {
	
	public static void InsertionSort(int arr[], int n) {
		for(int i=0;i<n-1;i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		//print before sorting
		System.out.println("Before Sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		InsertionSort(arr, n);
		
		System.out.println("After Sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
