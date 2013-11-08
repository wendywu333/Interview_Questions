package LeetCode;

/**
 * @author Wenzhe
 * @date 4/24/2013
 * passes all test cases
 */

public class Plus_One {

	public int[] plusOne(int[] digits) {

		int offset = 0;
		int one = 1;
		for (int i = digits.length - 1; i > -1; i--) {
			digits[i] = digits[i] + one + offset;
			one = 0;
			if(digits[i] == 10){
				digits[i] = 0;
				offset = 1;
			}else{
				offset = 0;
			}
		}
		
		if(digits[0] == 0 && offset == 1){
			int[] newdigits = new int[digits.length + 1];
			newdigits[0] = 1;
			for(int i = 0; i < digits.length; i++){
				newdigits[i+1] = digits[i];
			}
			return newdigits;
		}

		return digits;
		// Start typing your Java solution below
		// DO NOT write main() function

	}

}
