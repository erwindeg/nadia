package nl.edegier.codility.lesson7;

import java.util.Arrays;
/*
* Fish
*/
public class Solution {
	public int solution(int[] A, int[] B) {
		for (int i = 0; i < B.length; i++) {
			if (B[i] == 1) {
				for (int j = i + 1; j < B.length; j++) {
					if (B[j] == 0) {
						if (A[i] > A[j]) {
							B[j] = -1;
						} else if (A[i] < A[j]) {
							B[i] = -1;
						}
					}
				}
			}
		}
		
		return (int) Arrays.stream(B).filter(e -> e == 1 || e == 0).count();
	}

	public static void main(String[] args) {

		System.out.println(new Solution().solution(new int[] { 4, 3, 2, 1, 5 }, new int[] { 0, 1, 0, 0, }));
	}
}
