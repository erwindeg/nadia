package nl.edegier.codility.lesson8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().solution(new int[]{4,3,4,4,4,2}));
	}
	
	public int solution(int[] A) {
		int numberOfEquiLeaders =0;
		for(int i=0;i<A.length;i++){
			if(hasEqualLeader(i,A)){
				numberOfEquiLeaders++;
			}		
		};
		
		return numberOfEquiLeaders;
	}

	private boolean hasEqualLeader(int index, int[] a) {
		Map<Integer,Integer> sequence1 = new HashMap<>();
		Map<Integer,Integer> sequence2 = new HashMap<>();
		for(int i=0;i < a.length;i++){
			if(i <= index){
				if(sequence1.containsKey(a[i])){
					sequence1.put(a[i],1+sequence1.get(a[i]));
				}else {
					sequence1.put(a[i], 1);
				}
			} else {
				if(sequence2.containsKey(a[i])){
					sequence2.put(a[i],1+sequence2.get(a[i]));
				}else {
					sequence2.put(a[i], 1);
				}
			}
		}
		return compareHighest(sequence1,sequence2);
	}

	private boolean compareHighest(Map<Integer, Integer> sequence1, Map<Integer, Integer> sequence2) {
		if(sequence1.isEmpty() || sequence2.isEmpty()) return false;
		int highest1 = sequence1.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
		int highest2 = sequence2.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
		int count1 = isLeader(highest1,sequence1);
		int count2 = isLeader(highest2,sequence2);
		return leader1 > -1 && leader2 > -1 && leader1 == leader2;
	}

	private int isLeader(int highest1, Map<Integer, Integer> sequence1) {
		// TODO Auto-generated method stub
		return 0;
	}
}
