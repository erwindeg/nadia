package nl.edegier.codility.lesson5;

import java.util.Arrays;

public class Solution {


	public static void main(String[] args) {
		new Solution().solution(new int[]{4,2,2,5,1,5,8});

	}

	public int solution(int[] A){
		int start = A.length;
		double lowestAverage = 0;
		for(int i=0;i<A.length-2;i++){
			for(int j=i+1;j<A.length;j++){
				int[] slice = Arrays.copyOfRange(A, i, j+1);
				double average = Arrays.stream(slice).average().getAsDouble();
				if(start == A.length || average < lowestAverage){
					start = i;
					lowestAverage = average;
				}
			}
		}
		return start;
	}
}
