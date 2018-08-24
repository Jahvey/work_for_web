package com.adonai.test;

public class StringUtilsDemo1 {
	
	
	
	
	
	
	
	
	
	
	public static void bubblesort3(int []arr) {
		
		boolean flag=true;
		
		do {
			
			flag=false;
			
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=true;
				}
			}
			
			
		} while (flag);
		
	}
	
	
	
	
	
	public static void bubblesort2(int[]arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
	
	
	
	
	public static void bubblesort1(int []arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
	}
	
	
	
	public static void quicksort2(int[]arr,int start,int end) {
		
		if(start<end) {
			
			int base=arr[start];
			int i=start;
			int j=end;
			
			while(i<end&& arr[i]<base)i++;
			
			while(j>start&&arr[j]>base)j--;
			
			if(i<=j) {
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				i++;
				j--;
			}
			
			if(i<end) quicksort2(arr, i, end);
			
			if(j>start) quicksort2(arr, start, j);
			
			
			
			
		}
		
		
	}
	
	
	public static void quicksort1(int[]arr,int start,int end) {
		
		if(start<end) {
			int base=arr[start];
			int i=start;
			int j=end;
			
			while(i<end&&arr[i]<base)i++;
			
			while(j>start&&arr[j]>base)j--;
			
			
			if(i<=j) {
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				i++;
				j--;
			}
			
			
			if(i<end)quicksort1(arr, i, end);
			
			if(j>start) quicksort1(arr, start, j);
			
		}
		
	}
	
	public static void show(int []arr) {
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int []arr1= {
			-1,-2,-3,-4,-66,-5,-9,0,100,9,11,12,31,3,2,1	
		};
		
		show(arr1);
		//quicksort2(arr1, 0, arr1.length-1);
		//bubblesort1(arr1);
		//bubblesort2(arr1);
		bubblesort3(arr1);
		show(arr1);
	}

}
