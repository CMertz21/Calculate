/*
 * File: Sequence.java
 * Author: Carrie Miles 
 * Date 4/21/18
 * Purpose: Utility class to hold methods for recursion and iteration
 *
 */

package project;

public final class Sequence {
	private static  int j=0;
	
	
	private Sequence() {
	//private constructor to keep objects from being made	
	}
	//calculated using iterative method
	public static int computeIterative(int z) {
			
			
			int i=0, result=2, prevResult=1 , temp=0;
			if (z==0 || z==1) {
				return z;
			}
			for (i=2;i<z;i++) {
				j++; //used to calculate efficiency
				temp = result;
				result = 2 *result + prevResult;
				prevResult=temp;
			}
			return result;
			
		}
	//calculated using recursive method
	public static int computeRecursive(int n) {
		j++; //used to calculate efficiency
		if (n==0) {
			return 0;
		}else if (n==1){
			return 1;
		}else {
			return 2*(computeRecursive(n-1))+computeRecursive(n-2);
		}
		
	}
	//calculates efficiency of each method
	public static int getEfficiency (int i) {
		if (i==0) {
		int efficiency = j;
		j=0; //resets j after each reading
		return efficiency;
	}
		//computes the efficiency of n = 0-10 on exit and stores in array
		if (i==2) {
			for (int e=0;e<11;e++) {
				//Iterative results
				computeIterative(e);
				BuildGUI.results[0][e]=String.valueOf(getEfficiency(0));
				//Recursive results
				computeRecursive(e);
				BuildGUI.results[1][e]=String.valueOf(getEfficiency(0));
			}
			
		}
		return 0;
		}
	 }
	
	

