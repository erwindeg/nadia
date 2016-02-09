package nl.edegier.codility.lesson8;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().solution(new int[] { 4, 3, 4, 4, 4, 2 }));
	}

	public int solution(int[] A) {
		int numberOfEquiLeaders = 0;
		for (int i = 0; i < A.length; i++) {
			int[] left = Arrays.copyOf(A, i+1);
			int[] right = Arrays.copyOfRange(A, i+1, A.length);
			if (getLeader(left) == getLeader(right)) {
				numberOfEquiLeaders++;
			}
		}

		return numberOfEquiLeaders;
	}

	private int getLeader(int[] a) {
		if(a.length==0)return 0;
		int currentLeader = a[0];
		int counter = 0;
		for (int e : a) {
			if (e == currentLeader) {
				counter++;
			} else {
				counter--;
			}
			if (counter == -1) {
				currentLeader = e;
				counter = 0;
			}
		}

		int occurence = 0;
		for (int e : a) {
			if (e == currentLeader) {
				occurence++;
			}
		}

		return occurence > (a.length / 2) ? currentLeader : 0;
	}
}
