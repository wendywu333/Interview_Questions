/**
 * 
 */
package LeetCode;

/**
 * @author Wenzhe
 * @date Jul 22, 2013
 * 
 * passed all tests
 */
public class Convert_Sorted_Array_to_Binary_Search_Tree {

	public TreeNode sortedArrayToBST(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function
		TreeNode root = build(num, 0, num.length - 1);

		return root;
	}

	private TreeNode build(int[] num, int low, int high) {
		// TODO Auto-generated method stub
		if (low > high)
			return null;
		if (low == high)
			return new TreeNode(num[low]);

		TreeNode root = new TreeNode(num[low + (high - low) / 2]);
		root.left = build(num, low, low + (high - low) / 2 - 1);
		root.right = build(num, low + (high - low) / 2 + 1, high);
		return root;
	}

}
