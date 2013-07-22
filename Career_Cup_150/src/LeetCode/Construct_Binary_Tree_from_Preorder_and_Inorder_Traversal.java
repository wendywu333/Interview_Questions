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
public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (preorder.length == 0)
			return null;

		return build(preorder, 0, preorder.length - 1, inorder, 0,
				inorder.length - 1);

	}

	private TreeNode build(int[] preorder, int low, int high, int[] inorder,
			int low2, int high2) {
		// TODO Auto-generated method stub
		if (low == high) {
			return new TreeNode(preorder[low]);
		}
		if (low > high) {
			return null;
		}

		TreeNode root = new TreeNode(preorder[low]);
		int a = indexOf(preorder[low], inorder, low2, high2);

		root.left = build(preorder, low + 1, low + (a - low2), inorder, low2,
				a - 1);
		root.right = build(preorder, low + (a - low2) + 1, high, inorder,
				a + 1, high2);

		return root;
	}

	private int indexOf(int i, int[] order, int low, int high) {

		for (int j = low; j <= high; j++) {
			if (order[j] == i) {
				return j;
			}
		}
		return 0;
	}

	public static void main(String args[]) {
		Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal o = new Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal();
		o.buildTree(new int[] { 3, 2, 1, 4 }, new int[] { 1, 2, 3, 4 });
	}

}
