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
public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		// Start typing your Java solution below
		// DO NOT write main() function
		TreeNode root = build(postorder, 0, postorder.length - 1, inorder, 0,
				inorder.length - 1);

		return root;

	}

	private TreeNode build(int[] postorder, int i, int j, int[] inorder,
			int low, int high) {
		if (i > j)
			return null;
		if (i == j)
			return new TreeNode(postorder[j]);

		TreeNode root = new TreeNode(postorder[j]);
		int a = indexOf(inorder, postorder[j], low, high);

		root.left = build(postorder, i, i + (a - low) - 1, inorder, low, a - 1);
		root.right = build(postorder, i + (a - low), j - 1, inorder, a + 1,
				high);

		return root;
	}

	private int indexOf(int[] inorder, int i, int low, int high) {
		// TODO Auto-generated method stub
		for (int k = low; k <= high; k++) {
			if (inorder[k] == i)
				return k;
		}
		return -1;
	}

}
