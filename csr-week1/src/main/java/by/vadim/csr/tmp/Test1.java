package by.vadim.csr.tmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		int[] a = { 7, 1, 4, 6, 8, 2, 3, 10, 14, 0, 5 };

		List<List<Integer>> r = calc(a);

	}

	private static List<List<Integer>> calc(int[] a) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (a.length < 3) {
			return result;
		}
		
		int[] half1 = Arrays.copyOfRange(a, 0, a.length / 2);
		int[] half2 = Arrays.copyOfRange(a, a.length / 2, a.length);
		
		result.addAll(calc(half1));
		result.addAll(calc(half2));
		
		result.addAll(calcSplit(half1, half2));
		result.addAll(calcSplit(half2, half1));
		return result;
	}

	private static List<List<Integer>> calcSplit(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			
		}
		return null;
	}

}
