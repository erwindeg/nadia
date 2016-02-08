package nl.edegier.codility.lesson6;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
	public int solution(int[] A) {
		return Arrays.stream(A).distinct().map(e -> new Integer(e)).boxed().collect(Collectors.toList()).size();
	}
}