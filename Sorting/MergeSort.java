package diy.learnings.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	static List<Integer> mergeSort(List<Integer> arr) {

		int arrLength = arr.size();

		// base criteria for recursive calls
		// to stop infinite recursive calling and return value
		if (arrLength == 1) {
			return arr;
		}
		int subArr1Length = arrLength / 2;
		int subArr2Index = (arrLength / 2);

		List<Integer> subArray1 = new ArrayList<>();
		List<Integer> subArray2 = new ArrayList<>();

		// approach to divide the larger array elements to atomic levels
		for (int i = 0; i < subArr1Length; i++) {
			subArray1.add(arr.get(i));
		}
		for (int j = subArr2Index; j < arrLength; j++) {
			subArray2.add(arr.get(j));
		}

		// recursive calls to divide the array to its atomic or individual elements
		subArray1 = mergeSort(subArray1);
		subArray2 = mergeSort(subArray2);

		// call to sort and merge elements of an array
		return merge(subArray1, subArray2);
	}

	static List<Integer> merge(List<Integer> subArray1, List<Integer> subArray2) {

		List<Integer> subList3 = new ArrayList<>();

		// two array list's first elements will be compared and added to the final
		// sorted array list
		// NB: after updating the final array list, data are removed from the sub array
		// list
		while (subArray1.size() > 0 && subArray2.size() > 0) {
			if (subArray1.get(0) > subArray2.get(0)) {
				subList3.add(subArray2.get(0));
				subArray2.remove(0);
			} else {
				subList3.add(subArray1.get(0));
				subArray1.remove(0);
			}
		}

		while (subArray1.size() > 0) {

			subList3.add(subArray1.get(0));
			subArray1.remove(0);
		}

		while (subArray2.size() > 0) {

			subList3.add(subArray2.get(0));
			subArray2.remove(0);
		}

		return subList3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = { 50, 5, 2, 98, 89, 74, 32, 46 };
		List<Integer> sortedArr = mergeSort(Arrays.asList(arr));
		for (int i = 0; i < sortedArr.size(); i++) {
			System.out.print(sortedArr.get(i) + " ");
		}
	}

}
