/*
 * File: Sequence.java
 * Author: Carrie Miles 
 * Date 4/21/18
 * Purpose: Utility class to hold methods for recursion and iteration
 *
 */



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
	public static int getEfficiency () {
		int efficiency = j;
		j=0; //resets j after each reading
		return efficiency;
	}
	
	
	 }