package com.srinu.problems;

public class Sorting {
	
	public static void main(int[] args) {
		
	}
	
	/*
	 * Question: Given two sorted arrays A and B, A has large enough buffer at the end to 
	 * hold B. Write a method to merge A and B
	 * 
	 * Solution: Will use merge sort
	 * to merge the two arrays, this will take linear time
	 * 
	 * pseudo code: 
	 * 1create pointers A-pointer=A.size-1, B-pointer=B.size-1
	 * 2) compare A[left] and B[right] and the highest will go into A[right] and decrement the lowest side index 
	 * 3) if elements in A are left, then no need to worry, all are inplace already, if elements in B are 
	 * left, then we copy them in the front of A
	 * 
	 */
	
	

}