package JavaBasic.SortingArray;

import java.util.Arrays;

public class SortOfArray {

	public static void main(String[] args) {

		ArrayOfAge arrayOfAge = new ArrayOfAge();
		int[] originalArray = arrayOfAge.getAge();

		if (originalArray.length >= 2) {
			SortingAges sortingAges = new SortingAges();
			int[] sortedArray = sortingAges.sortNumbers(originalArray);

			int[] resultArray = sortingAges.presentResult(sortedArray);

			System.out.println(Arrays.toString(resultArray));
		} else {
			System.out.println("É necessário que haja ao menos dois números no array");
		}

	}

}
