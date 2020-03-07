package com.cde;

public class Test {

	final static int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        	
	int arr[]= {5,9,7,1,3};
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length-1;i++) {
		
		if(arr[i]>max) {
			max=arr[i];
		}
		else if(arr[i]<min) {
			
			min=arr[i];
		}
		
	}
	
	
	System.out.print("max :"+max + "min :"+min);
	
	
	
	//System.out.print("Max :"+max +"second :"+second);
	
	}
	

}
