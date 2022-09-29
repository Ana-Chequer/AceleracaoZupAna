package JavaBasic.SortingArray;

import java.util.Arrays;

public class SortingAges {
		
	public int[] sortNumbers(int[] numbers) {
		Arrays.sort(numbers);
		return numbers;	
	}
	
	public int[] presentResult(int[] numbers) {
		int[] result = new int[2];
		result[0] = numbers[numbers.length-2];
		result[1] = numbers[numbers.length-1];
		return result;
	}
	
}
