package nl.edegier.codility.lesson4;

import java.util.Arrays;

class Solution {
	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];

		for (int i = 0; i < A.length; i++) {
			if (A[i] <= N) {
				counters[A[i] - 1]++;
			} else if (A[i] == N + 1) {
				int max = Arrays.stream(counters).max().getAsInt();
				Arrays.setAll(counters, e -> max);
			}
		}

		return counters;
	}

}