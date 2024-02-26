package sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(int arr[], int n) {
		for(int i=n-1;i>=1;i--) {
			int swapdone = 0;
			for(int j=0;j<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapdone =1 ;
				}
			}
			if(swapdone == 0) { //checks if in 1st iteration swapping is done if not 
								//means it is in correct order and best case O(N)
				break;
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
		bubbleSort(arr, n);
		
		//after sorting
		System.out.println("After Sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
				

	}

}
