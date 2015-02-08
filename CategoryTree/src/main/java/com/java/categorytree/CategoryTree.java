package com.java.categorytree;

import java.util.*;

public class CategoryTree<T> {

	private CategoryTreeNode<T> parent;

	public CategoryTree() {
		super();
	}

	public CategoryTreeNode<T> getRoot() {
		return this.parent;
	}

	public void setRoot(CategoryTreeNode<T> parent) {
		this.parent = parent;
	}

	public int getNumberOfNodes() {
		int numberOfNodes = 0;
		if (parent != null) {
			numberOfNodes = CategoryTreeUtil.getNodes(parent) + 1;
		}
		return numberOfNodes;
	}

	public boolean exists(T dataToFind) {
		return (find(dataToFind) != null);
	}

	public CategoryTreeNode<T> find(T dataToFind) {
		CategoryTreeNode<T> returnNode = null;
		if (parent != null) {
			returnNode = CategoryTreeUtil.auxiliaryFind(parent, dataToFind);
		}
		return returnNode;
	}

	public boolean isEmpty() {
		return (parent == null);
	}

	public List<CategoryTreeNode<T>> build(
		CategoryTreeTraversalOrderEnum traversalOrder) {
		List<CategoryTreeNode<T>> returnList = null;

		if (parent != null) {
			returnList = build(parent, traversalOrder);
		}
		return returnList;
	}

	public List<CategoryTreeNode<T>> build(CategoryTreeNode<T> node,
			CategoryTreeTraversalOrderEnum traversalOrder) {
		List<CategoryTreeNode<T>> traversalResult = new ArrayList<CategoryTreeNode<T>>();

		if (traversalOrder == CategoryTreeTraversalOrderEnum.PREV_ORDER) {
			CategoryTreeUtil.buildPreOrder(node, traversalResult);
		}

		else if (traversalOrder == CategoryTreeTraversalOrderEnum.POST_ORDER) {
			CategoryTreeUtil.buildPostOrder(node, traversalResult);
		}

		return traversalResult;
	}

	public Map<CategoryTreeNode<T>, Integer> buildWithDepth(
			CategoryTreeTraversalOrderEnum traversalOrder) {
		Map<CategoryTreeNode<T>, Integer> returnMap = null;

		if (parent != null) {
			returnMap = buildWithDepth(parent, traversalOrder);
		}

		return returnMap;
	}

	public Map<CategoryTreeNode<T>, Integer> buildWithDepth(
			CategoryTreeNode<T> node,
			CategoryTreeTraversalOrderEnum traversalOrder) {
		Map<CategoryTreeNode<T>, Integer> traversalResult = new LinkedHashMap<CategoryTreeNode<T>, Integer>();

		if (traversalOrder == CategoryTreeTraversalOrderEnum.PREV_ORDER) {
			CategoryTreeUtil.buildPreOrderWithDepth(node, traversalResult, 0);
		}

		else if (traversalOrder == CategoryTreeTraversalOrderEnum.POST_ORDER) {
			CategoryTreeUtil.buildPostOrderWithDepth(node, traversalResult, 0);
		}

		return traversalResult;
	}

	public String toString() {
		String stringRepresentation = "";
		if (parent != null) {
			stringRepresentation = build(
					CategoryTreeTraversalOrderEnum.PREV_ORDER).toString();
		}

		return stringRepresentation;
	}

	public String toStringWithDepth() {
		String stringRepresentation = "";

		if (parent != null) {
			stringRepresentation = buildWithDepth(
					CategoryTreeTraversalOrderEnum.PREV_ORDER).toString();
		}
		return stringRepresentation;
	}
}
