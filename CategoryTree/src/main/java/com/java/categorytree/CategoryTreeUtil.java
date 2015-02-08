package com.java.categorytree;

import java.util.List;
import java.util.Map;

public class CategoryTreeUtil {
	
	public static <T> int getNodes(CategoryTreeNode<T> node) {
		int numberOfNodes = node.getNumberOfChildren();
		for (CategoryTreeNode<T> child : node.getChildren()) {
			numberOfNodes += getNodes(child);
		}
		return numberOfNodes;
	}
	
	public static <T> CategoryTreeNode<T> auxiliaryFind(CategoryTreeNode<T> currentNode, T dataToFind) {
		CategoryTreeNode<T> returnNode = null;
		int i = 0;

		if (currentNode.getData().equals(dataToFind)) {
			returnNode = currentNode;
		}
		else if (currentNode.hasChildren()) {
			i = 0;
			while (returnNode == null && i < currentNode.getNumberOfChildren()) {
				returnNode = auxiliaryFind(currentNode.getChildAt(i),
						dataToFind);
				i++;
			}
		}
		return returnNode;
	}
	
	public static <T> void buildPreOrder(CategoryTreeNode<T> node,
			List<CategoryTreeNode<T>> traversalResult) {
		traversalResult.add(node);

		for (CategoryTreeNode<T> child : node.getChildren()) {
			buildPreOrder(child, traversalResult);
		}
	}

	public static <T> void buildPostOrder(CategoryTreeNode<T> node,
			List<CategoryTreeNode<T>> traversalResult) {
		for (CategoryTreeNode<T> child : node.getChildren()) {
			buildPostOrder(child, traversalResult);
		}
		traversalResult.add(node);
	}
	
	public static <T> void buildPreOrderWithDepth(CategoryTreeNode<T> node,
			Map<CategoryTreeNode<T>, Integer> traversalResult, int depth) {
		traversalResult.put(node, depth);

		for (CategoryTreeNode<T> child : node.getChildren()) {
			buildPreOrderWithDepth(child, traversalResult, depth + 1);
		}
	}

	public static <T> void buildPostOrderWithDepth(CategoryTreeNode<T> node,
		Map<CategoryTreeNode<T>, Integer> traversalResult, int depth) {
		for (CategoryTreeNode<T> child : node.getChildren()) {
			buildPostOrderWithDepth(child, traversalResult, depth + 1);
		}
		traversalResult.put(node, depth);
	}
	
}
