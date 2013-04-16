import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 
 */

/**
 * @author Wenzhe
 * @date 3/7/2013
 */
public class Sort {

	public static int[] quickSort(int[] arr, int low, int high) {

		int lowStart = low;
		int highEnd = high;
		if (low < high) {
			int pivokey = arr[low];
			while (low < high) {

				while (low < high && arr[high] > pivokey) {
					high--;
				}

				if (low < high)
					arr[low++] = arr[high];

				while (low < high && arr[low] < pivokey) {
					low++;
				}

				if (low < high)
					arr[high--] = arr[low];
			}
			arr[low] = pivokey;
			quickSort(arr, lowStart, low - 1);
			quickSort(arr, low + 1, highEnd);
		}
		return arr;
	}

	public static int[] bubbleSort(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length - 1; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}

			}
		}
		return ar;
	}

	public static int[] mergeSort(int[] ar) {
		if (ar.length == 1 || ar.length == 0) {
			return ar;
		}
		int middle = ar.length / 2;
		int[] left = mergeSort(subArray(ar, 0, middle - 1));
		int[] right = mergeSort(subArray(ar, middle, ar.length - 1));
		int[] result = new int[ar.length];
		int dPtr = 0;
		int lPtr = 0;
		int rPtr = 0;
		while (dPtr < ar.length) {
			if (lPtr == left.length) {
				result[dPtr] = right[rPtr];
				rPtr++;
			} else if (rPtr == right.length) {
				result[dPtr] = left[lPtr];
				lPtr++;
			} else if (left[lPtr] < right[rPtr]) {
				result[dPtr] = left[lPtr];
				lPtr++;
			} else {
				result[dPtr] = right[rPtr];
				rPtr++;
			}
			dPtr++;
		}
		return result;
	}

	private static int[] subArray(int[] ar, int start, int end) {
		int[] result = new int[end - start + 1];
		for (int i = 0; i < end - start + 1; i++) {
			result[i] = ar[start + i];
		}// TODO Auto-generated method stub
		return result;
	}

	public static int[] heapSort(int[] ar) {
		PriorityQueue<Integer> temp = new PriorityQueue<Integer>();
		for (int a : ar) {
			temp.add(a);
		}
		int[] result = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			result[i] = temp.remove();
		}
		return result;
	}

	public static ArrayList<Integer> anotherQuickSort(ArrayList<Integer> ar) {

		if (ar.size() <= 1) {
			return ar;
		}
		int middle = ar.get((int) ar.size() / 2);
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		for (int i = 0; i < ar.size(); i++) {
			if (i != (int) ar.size() / 2) {
				if (ar.get(i) <= middle) {
					left.add(ar.get(i));
				} else {
					right.add(ar.get(i));
				}
			}
		}

		return concatenate(anotherQuickSort(left), middle,
				anotherQuickSort(right));

	}

	private static ArrayList<Integer> concatenate(ArrayList<Integer> list1,
			int middle, ArrayList<Integer> list2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> result = new ArrayList<Integer>(list1.size()
				+ list2.size() + 1);
		for (int i = 0; i < list1.size(); i++) {
			result.add(list1.get(i));
		}
		result.add(middle);
		for (int j = 0; j < list2.size(); j++) {
			result.add(list2.get(j));
		}
		return result;
	}

	public static void main(String args[]) {
		int[] newarr = { 5, 4, 7, 8, 1, 9, 12 };
		// printArray(quickSort(newarr, 0, 6));
		// printArray(bubbleSort(newarr));
		// printArray(mergeSort(newarr));
		// printArray(heapSort(newarr));
		ArrayList<Integer> newarrl = new ArrayList<Integer>();
		for(int q:newarr){
			newarrl.add(q);
		}
		printArray(anotherQuickSort(newarrl).toArray());
	}

	public static void printArray(Object[] objects) {
		for (Object q : objects) {
			System.out.print(q + " ");
		}
		System.out.println("");
	}

}
