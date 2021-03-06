package others;

import java.util.LinkedList;
import java.util.Queue;

import LeetCode.TreeNode;

public class Useful_pieces {

	// string to char array
	String str = "testString";
	char[] charArray = str.toCharArray();

	// Character[] charObjectArray = ArrayUtils.toObject(charArray);

	public Character[] toCharacterArray(String s) {
		if (s == null) {
			return null;
		}
		Character[] array = new Character[s.length()];
		for (int i = 0; i < s.length(); i++) {
			array[i] = new Character(s.charAt(i));
		}

		return array;
	}

	Boolean a = Character.isUpperCase(charArray[1]);
	Boolean b = Character.isLowerCase(charArray[2]);

	char c = '9';
	int i = Character.getNumericValue(c);

	// Binary tree breath first traversal

	Queue<TreeNode> queue = new LinkedList<TreeNode>();

	public void breadth(TreeNode root) {
		if (root == null)
			return;
		queue.clear();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.remove();

				System.out.print(node.val + " ");

			if (node.left != null) {
				queue.add(node.left);
			} 
			if (node.right != null) {
				queue.add(node.right);
			} 
		}

	}
}
