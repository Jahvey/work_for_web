package com.wh.test2;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 
 * @author Adonai
 * @qq 2807867265
 * @time 2018年9月14日 上午11:13:59
 * @address chengdu
 */
class Node {
	int item;
	Node left;
	Node right;

	public Node(Node left, int element, Node right) {
		// TODO Auto-generated constructor stub

		this.left = left;
		this.item = element;
		this.right = right;
	}
}

/**
 * 
 * @author Adonai
 * @qq 2807867265
 * @time 2018年9月14日 上午11:10:13
 * @address chengdu
 */
public class BiTreeTest001 {

	// preOrder recursive traverse
	public static void preOrderRecur(Node root) {
		if (root != null) {
			System.out.print(root.item + " ");
			preOrderRecur(root.left);
			preOrderRecur(root.right);
		}
	}

	// inOrder recursive traverse
	public static void inOrderRecur(Node root) {
		if (root != null) {
			inOrderRecur(root.left);
			System.out.print(root.item + " ");
			inOrderRecur(root.right);
		}
	}

	// postOrder recursive traverse
	public static void postOrderRecur(Node root) {
		if (root != null) {
			postOrderRecur(root.left);
			postOrderRecur(root.right);
			System.out.print(root.item + " ");
		}
	}

	// preOrder in non-recursive
	public static void preOrder(Node root) {

		Node p = root;

		Stack<Node> stack = new Stack<Node>();
		if (p != null) {

			while (!stack.isEmpty() || null != p) {
				// 沿着p的左指针非空进栈走到最左
				while (null != p) {
					System.out.print(p.item + " ");// 先序遍历，先访问结点，存入栈中是为了查找右子树
					stack.push(p);
					p = p.left;
				}

				// 我理解此时，栈必不为空；所以无需判断栈空
				p = stack.pop();
				p = p.right;// 右子树无论空或非空直接下一个while就行
			}
		}

		System.out.println("\npreOrder in non-recursive finished!");

	}

	// inOrder in non-recursive
	public static void inOrder(Node root) {

		Node p = root;

		Stack<Node> stack = new Stack<Node>();
		if (p != null) {

			while (!stack.isEmpty() || null != p) {
				// 沿着p的左指针非空进栈走到最左
				while (null != p) {

					stack.push(p);
					p = p.left;
				}

				// 我理解此时，栈必不为空；所以无需判断栈空
				p = stack.pop();
				System.out.print(p.item + " ");// 中序遍历
				p = p.right;// 右子树无论空或非空直接下一个while就行
			}
		}

		System.out.println("\ninOrder in non-recursive finished!");

	}

	// postOrder recursive traverse
	public static void postOrder(Node root) {
		if (root == null)
			return;

		Stack<Node> stack = new Stack<>();

		Node lastVisit = null;// 记录上一次访问的节点

		Node p = root;

		// if (p != null) {
		while (null != p || !stack.isEmpty()) {
			// 后序遍历也需要走到最后
			while (p != null) {
				stack.push(p);
				p = p.left;
			}

			// 栈必不为空，直接弹出
			p = stack.pop();

			// 如果此节点的右子树为空，或者上次访问的
			// 节点 是在此节点的右子树 ，表明现在可以访问
			if (p.right == null || lastVisit == p.right) {
				System.out.print(p.item + " ");
				lastVisit = p;
				p = null;// p在这里必须变成空，否则会造成死循环
			} else {
				// 对于刚才的出栈，现已知是错误的选择，所以再入栈
				stack.push(p);
				p = p.right;// 再从P的右子树开始新的循环
			}

		}

		// }

		System.out.println("\npostOrder in non-recursive finished!");
	}

	// levelOrder recursive traverse
	public static void levelOrder(Node root) {
		LinkedList<Node> list = new LinkedList<>();

		Node p = root;

		list.add(p);

		while (list.size() > 0) {

			p = list.remove(0);

			if (p != null) {
				System.out.print(p.item + " ");
			}

			if (p.left != null) {
				list.add(p.left);
			}

			if (p.right != null) {
				list.add(p.right);
			}
		}

		System.out.println("\nlevelOrder in non-recursive finished!");
	}

	// level traverse,use LinkedList instead of queue data structure
	public static void levelTraverse2(Node root) {
		LinkedList<Node> list = new LinkedList<Node>();
		Node cur;
		list.add(root);
		while (list.size() != 0) {
			cur = list.removeFirst();
			if (cur != null) {
				System.out.print(cur.item + " ");
			}
			if (cur.left != null) {
				list.add(cur.left);
			}
			if (cur.right != null) {
				list.add(cur.right);
			}
		}
	}

	public static void main(String[] args) {

		Node node9 = new Node(null, 9, null);
		Node node7 = new Node(node9, 7, null);

		Node node12 = new Node(null, 12, null);
		Node node13 = new Node(null, 13, null);

		Node node8 = new Node(node12, 8, node13);
		Node node3 = new Node(node7, 3, node8);
		Node node4 = new Node(null, 4, null);
		Node node1 = new Node(node3, 1, node4);

		preOrder(node1);
		preOrderRecur(node1);

		System.out.println("\n=============");
		inOrder(node1);
		inOrderRecur(node1);
		System.out.println("\n=============");
		postOrder(node1);
		postOrderRecur(node1);
		System.out.println("\n=============");
		levelOrder(node1);
		levelTraverse2(node1);
		System.out.println("\n=============");

	}

}

// https://blog.csdn.net/a2320064997/article/details/70494786
// http://www.cnblogs.com/pangblog/p/3397948.html
// https://blog.csdn.net/jianyuerensheng/article/details/51240068