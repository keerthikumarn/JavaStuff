
package com.java.categorytree.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.java.categorytree.CategoryTreeNode;

public class TestCategoryTreeNode {
    @Test
    public void TestParentIsNullOnNewNodeCreation() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        assertNull(parent.getData());
    }

    @Test
    public void TestNodeHasNonNullChildrenListOnNewNodeCreation() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        assertNotNull(parent.getChildren());
    }

    @Test
    public void TestNodeHasZeroChildrenOnNewNodeCreation() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        assertEquals(parent.getNumberOfChildren(), 0);
    }

    @Test
    public void TestNodeHasChildrenReturnsFalseOnNewNodeCreation() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        assertFalse(parent.hasChildren());
    }

    @Test
    public void TestNodeDataIsNonNullWithParameterizedConstructor() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>("I haz data");
        assertNotNull(parent.getData());
    }

    @Test
    public void TestNodeSetAndGetData() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        String data = "Root Node";
        parent.setTreeData(data);
        assertEquals(parent.getData(), data);
    }

    @Test
    public void TestNodeSetAndGetChildren() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        CategoryTreeNode<String> child = new CategoryTreeNode<String>();

        List<CategoryTreeNode<String>> children = new ArrayList<CategoryTreeNode<String>>();
        children.add(child);

        parent.setChildren(children);
        assertEquals(parent.getChildren(), children);
    }

    @Test
    public void TestNodeSetAndGetChildrenHasCorrectParent() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        CategoryTreeNode<String> child = new CategoryTreeNode<String>();

        List<CategoryTreeNode<String>> children = new ArrayList<CategoryTreeNode<String>>();
        children.add(child);

        parent.setChildren(children);
        assertEquals(parent.getChildren(), children);

        for(CategoryTreeNode<String> childNode : children) {
            assertEquals(parent, childNode.getParent());
        }
    }

    @Test
    public void TestNodeRemoveChildren() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        CategoryTreeNode<String> child = new CategoryTreeNode<String>();

        List<CategoryTreeNode<String>> children = new ArrayList<CategoryTreeNode<String>>();
        children.add(child);

        parent.setChildren(children);
        parent.removeChildren();
        assertEquals(parent.getChildren().size(), 0);
    }

    @Test
    public void TestNodeAddChildHasCorrectParent() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        CategoryTreeNode<String> child = new CategoryTreeNode<String>();

        parent.addChild(child);
        assertEquals(parent, child.getParent());
    }

    @Test
    public void TestNodeAddChildHasOneChild() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        CategoryTreeNode<String> child = new CategoryTreeNode<String>();

        parent.addChild(child);
        assertEquals(parent.getNumberOfChildren(), 1);
    }

    @Test
    public void TestNodeAddChildHasChildrenIsTrue() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        CategoryTreeNode<String> child = new CategoryTreeNode<String>();

        parent.addChild(child);
        assertTrue(parent.hasChildren());
    }

    @Test
    public void TestNodeAddAndGetChildAt() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>("root");
        CategoryTreeNode<String> child1 = new CategoryTreeNode<String>("child1");
        CategoryTreeNode<String> child2 = new CategoryTreeNode<String>("child2");

        parent.addChild(child1);
        parent.addChildAt(1, child2);

        assertEquals(parent.getChildAt(1).getData(), child2.getData());
    }

    @Test
    public void TestNodeAddAndRemoveChildAt() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>("root");
        CategoryTreeNode<String> child1 = new CategoryTreeNode<String>("child1");
        CategoryTreeNode<String> child2 = new CategoryTreeNode<String>("child2");

        parent.addChild(child1);
        parent.addChildAt(1, child2);

        parent.removeChildAt(0);

        assertEquals(parent.getNumberOfChildren(), 1);
    }

    @Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void TestNodeAddChildAtThrowsException() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        CategoryTreeNode<String> child = new CategoryTreeNode<String>();

        parent.addChildAt(5, child);
    }

    @Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void TestNodeRemoveChildAtThrowsException() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        parent.removeChildAt(1);
    }

    @Test
    public void TestNodeToString() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        parent.setTreeData("Root Node");
        assertEquals(parent.toString(), "Root Node");
    }

    @Test
    public void TestNodeToStringVerboseNoChildren() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        parent.setTreeData("Root Node");
        assertEquals(parent.toStringVerbose(), "Root Node:[]");
    }

    @Test
    public void TestNodeToStringVerboseOneChild() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        parent.setTreeData("data");

        CategoryTreeNode<String> child = new CategoryTreeNode<String>();
        child.setTreeData("child");

        parent.addChild(child);
        assertEquals(parent.toStringVerbose(), "data:[child]");
    }

    @Test
    public void TestNodeToStringVerboseMoreThanOneChild() {
        CategoryTreeNode<String> parent = new CategoryTreeNode<String>();
        parent.setTreeData("data");

        CategoryTreeNode<String> child1 = new CategoryTreeNode<String>();
        child1.setTreeData("child1");

        CategoryTreeNode<String> child2 = new CategoryTreeNode<String>();
        child2.setTreeData("child2");

        parent.addChild(child1);
        parent.addChild(child2);

        assertEquals(parent.toStringVerbose(), "data:[child1, child2]");
    }
}
