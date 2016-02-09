package nl.edegier.codility.lesson6;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
	public int solution(int[] A) {
		return Arrays.stream(A).distinct().boxed().collect(Collectors.toList()).size();
	}
}