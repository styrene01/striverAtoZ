package sorting;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(int arr[], int n) {
		for(int i=0;i<=n-2;i++) {//no need to include last element
			int mini = i;//assuming first to be the min in every iteration
			//compare
			for(int j=i;j<=n-1;j++) {//from i to last checking
				if(arr[j]<arr[mini]) {
					mini = j;
				}
			}
			//swap
			int temp = arr[i];
			arr[i]=arr[mini];
			arr[mini]=temp;
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
		selectionSort(arr, n);
		
		//after sorting
		System.out.println("After Sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
		

	}

}
