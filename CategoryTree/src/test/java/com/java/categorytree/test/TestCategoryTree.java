
package com.java.categorytree.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.java.categorytree.CategoryTree;
import com.java.categorytree.CategoryTreeNode;
import com.java.categorytree.CategoryTreeTraversalOrderEnum;

public class TestCategoryTree{
    @Test
    public void TestRootIsNullOnNewTreeCreation() {
        CategoryTree<String> tree = new CategoryTree<String>();
        assertNull(tree.getRoot());
    }

    @Test
    public void TestNumberOfNodesIsZeroOnNewTreeCreation() {
        CategoryTree<String> tree = new CategoryTree<String>();
        assertEquals(tree.getNumberOfNodes(), 0);
    }

    @Test
    public void TestIsEmptyIsTrueOnNewTreeCreation() {
        CategoryTree<String> tree = new CategoryTree<String>();
        assertTrue(tree.isEmpty());
    }

    @Test
    public void TestExistsIsFalseOnNewTreeCreation() {
        CategoryTree<String> tree = new CategoryTree<String>();
        String dataToFind = "";

        assertFalse(tree.exists(dataToFind));
    }

    @Test
    public void TestFindReturnsNullOnNewTreeCreation() {
        CategoryTree<String> tree = new CategoryTree<String>();
        String dataToFind = "";

        assertNull(tree.find(dataToFind));
    }

    @Test
    public void TestPreOrderBuildReturnsNullListOnNewTreeCreation() {
        CategoryTree<String> tree = new CategoryTree<String>();

        assertNull(tree.build(CategoryTreeTraversalOrderEnum.PREV_ORDER));
    }

    @Test
    public void TestPostOrderBuildReturnsNullListOnNewTreeCreation() {
        CategoryTree<String> tree = new CategoryTree<String>();

        assertNull(tree.build(CategoryTreeTraversalOrderEnum.POST_ORDER));
    }

    @Test
    public void TestPreOrderBuildWithDepthReturnsNullMapOnNewTreeCreation() {
        CategoryTree<String> tree = new CategoryTree<String>();
        assertNull(tree.buildWithDepth(CategoryTreeTraversalOrderEnum.PREV_ORDER));
    }

    @Test
    public void TestPostOrderBuildWithDepthReturnsNullMapOnNewTreeCreation() {
        CategoryTree<String> tree = new CategoryTree<String>();
        assertNull(tree.buildWithDepth(CategoryTreeTraversalOrderEnum.POST_ORDER));
    }

    @Test
    public void TestToStringReturnsEmptyStringOnNewTreeCreation() {
        CategoryTree<String> tree = new CategoryTree<String>();
        assertEquals(tree.toString(), "");
    }

    @Test
    public void TestToStringWithDepthReturnsEmptyStringOnNewTreeCreation() {
        CategoryTree<String> tree = new CategoryTree<String>();
        assertEquals(tree.toStringWithDepth(), "");
    }

    @Test
    public void TestSetRootGetRoot() {
        CategoryTree<String> tree = new CategoryTree<String>();
        CategoryTreeNode<String> root = new CategoryTreeNode<String>();
        tree.setRoot(root);

        assertNotNull(tree.getRoot());
    }

    @Test
    public void TestNumberOfNodesIsOneWithNonNullRoot() {
        CategoryTree<String> tree = new CategoryTree<String>();
        CategoryTreeNode<String> root = new CategoryTreeNode<String>();
        tree.setRoot(root);
        assertEquals(tree.getNumberOfNodes(), 1);
    }

    @Test
    public void TestEmptyIsFalseWithNonNullRoot() {
        CategoryTree<String> tree = new CategoryTree<String>();
        CategoryTreeNode<String> root = new CategoryTreeNode<String>();
        tree.setRoot(root);

        assertFalse(tree.isEmpty());
    }

    @Test
    public void TestPreOrderBuildListSizeIsOneWithNonNullRoot() {
        CategoryTree<String> tree = new CategoryTree<String>();
        CategoryTreeNode<String> root = new CategoryTreeNode<String>("root");
        tree.setRoot(root);
        assertEquals(tree.build(CategoryTreeTraversalOrderEnum.PREV_ORDER).size(), 1);
    }

    @Test
    public void TestPostOrderBuildListSizeIsOneWithNonNullRoot() {
        CategoryTree<String> tree = new CategoryTree<String>();
        CategoryTreeNode<String> root = new CategoryTreeNode<String>("root");
        tree.setRoot(root);
        assertEquals(tree.build(CategoryTreeTraversalOrderEnum.POST_ORDER).size(), 1);
    }

    @Test
    public void TestPreOrderBuildWithDepthSizeIsOneWithNonNullRoot() {
        CategoryTree<String> tree = new CategoryTree<String>();
        CategoryTreeNode<String> root = new CategoryTreeNode<String>("root");
        tree.setRoot(root);
        assertEquals(tree.buildWithDepth(CategoryTreeTraversalOrderEnum.PREV_ORDER).size(), 1);
    }

    @Test
    public void TestPostOrderBuildWithDepthSizeIsOneWithNonNullRoot() {
        CategoryTree<String> tree = new CategoryTree<String>();
        CategoryTreeNode<String> root = new CategoryTreeNode<String>("root");
        tree.setRoot(root);
        assertEquals(tree.buildWithDepth(CategoryTreeTraversalOrderEnum.POST_ORDER).size(), 1);
    }

    @Test
    public void TestNumberOfNodes() {
        CategoryTree<String> tree = new CategoryTree<String>();
        CategoryTreeNode<String> rootA = new CategoryTreeNode<String>("A");
        CategoryTreeNode<String> childB = new CategoryTreeNode<String>("B");
        CategoryTreeNode<String> childC = new CategoryTreeNode<String>("C");
        CategoryTreeNode<String> childD = new CategoryTreeNode<String>("D");

        childC.addChild(childD);
        rootA.addChild(childB);
        rootA.addChild(childC);

        tree.setRoot(rootA);
        assertEquals(tree.getNumberOfNodes(), 4);
    }

    @Test
    public void TestExistsReturnsTrue() {
        CategoryTree<String> tree = new CategoryTree<String>();
        CategoryTreeNode<String> rootA = new CategoryTreeNode<String>("A");
        CategoryTreeNode<String> childB = new CategoryTreeNode<String>("B");
        CategoryTreeNode<String> childC = new CategoryTreeNode<String>("C");
        CategoryTreeNode<String> childD = new CategoryTreeNode<String>("D");

        childC.addChild(childD);
        rootA.addChild(childB);
        rootA.addChild(childC);

        tree.setRoot(rootA);
        String dataToFindD = "D";
        assertTrue(tree.exists(dataToFindD));
    }

    @Test
    public void TestFindReturnsNonNull() {
        CategoryTree<String> tree = new CategoryTree<String>();

        CategoryTreeNode<String> rootA = new CategoryTreeNode<String>("A");
        CategoryTreeNode<String> childB = new CategoryTreeNode<String>("B");
        CategoryTreeNode<String> childC = new CategoryTreeNode<String>("C");
        CategoryTreeNode<String> childD = new CategoryTreeNode<String>("D");

        childC.addChild(childD);
        rootA.addChild(childB);
        rootA.addChild(childC);

        tree.setRoot(rootA);

        String dataToFindD = "D";

        assertNotNull(tree.find(dataToFindD));
    }

    @Test
    public void TestExistsReturnsFalse() {
        CategoryTree<String> tree = new CategoryTree<String>();

        CategoryTreeNode<String> rootA = new CategoryTreeNode<String>("A");
        CategoryTreeNode<String> childB = new CategoryTreeNode<String>("B");
        CategoryTreeNode<String> childC = new CategoryTreeNode<String>("C");
        CategoryTreeNode<String> childD = new CategoryTreeNode<String>("D");

        childC.addChild(childD);
        rootA.addChild(childB);
        rootA.addChild(childC);

        tree.setRoot(rootA);

        String dataToFindE = "E";

        assertFalse(tree.exists(dataToFindE));
    }

    @Test
    public void TestFindReturnsNull() {
        CategoryTree<String> tree = new CategoryTree<String>();

        CategoryTreeNode<String> rootA = new CategoryTreeNode<String>("A");
        CategoryTreeNode<String> childB = new CategoryTreeNode<String>("B");
        CategoryTreeNode<String> childC = new CategoryTreeNode<String>("C");
        CategoryTreeNode<String> childD = new CategoryTreeNode<String>("D");

        childC.addChild(childD);
        rootA.addChild(childB);
        rootA.addChild(childC);

        tree.setRoot(rootA);

        String dataToFindE = "E";

        assertNull(tree.find(dataToFindE));
    }

    @Test
    public void TestPreOrderBuild() {
        CategoryTree<String> tree = new CategoryTree<String>();

        CategoryTreeNode<String> rootA = new CategoryTreeNode<String>("A");
        CategoryTreeNode<String> childB = new CategoryTreeNode<String>("B");
        CategoryTreeNode<String> childC = new CategoryTreeNode<String>("C");
        CategoryTreeNode<String> childD = new CategoryTreeNode<String>("D");

        childC.addChild(childD);
        rootA.addChild(childB);
        rootA.addChild(childC);

        tree.setRoot(rootA);

        List<CategoryTreeNode<String>> preOrderList = new ArrayList<CategoryTreeNode<String>>();
        preOrderList.add(new CategoryTreeNode<String>("A"));
        preOrderList.add(new CategoryTreeNode<String>("B"));
        preOrderList.add(new CategoryTreeNode<String>("C"));
        preOrderList.add(new CategoryTreeNode<String>("D"));

        assertEquals(tree.build(CategoryTreeTraversalOrderEnum.PREV_ORDER).toString(), preOrderList.toString());
    }

    @Test
    public void TestPostOrderBuild() {
        CategoryTree<String> tree = new CategoryTree<String>();

        CategoryTreeNode<String> rootA = new CategoryTreeNode<String>("A");
        CategoryTreeNode<String> childB = new CategoryTreeNode<String>("B");
        CategoryTreeNode<String> childC = new CategoryTreeNode<String>("C");
        CategoryTreeNode<String> childD = new CategoryTreeNode<String>("D");

        childC.addChild(childD);
        rootA.addChild(childB);
        rootA.addChild(childC);

        tree.setRoot(rootA);

        List<CategoryTreeNode<String>> postOrderList = new ArrayList<CategoryTreeNode<String>>();
        postOrderList.add(new CategoryTreeNode<String>("B"));
        postOrderList.add(new CategoryTreeNode<String>("D"));
        postOrderList.add(new CategoryTreeNode<String>("C"));
        postOrderList.add(new CategoryTreeNode<String>("A"));
        assertEquals(tree.build(CategoryTreeTraversalOrderEnum.POST_ORDER).toString(), postOrderList.toString());
     }

    @Test
    public void TestPreOrderBuildWithDepth() {
        CategoryTree<String> tree = new CategoryTree<String>();

        CategoryTreeNode<String> rootA = new CategoryTreeNode<String>("A");
        CategoryTreeNode<String> childB = new CategoryTreeNode<String>("B");
        CategoryTreeNode<String> childC = new CategoryTreeNode<String>("C");
        CategoryTreeNode<String> childD = new CategoryTreeNode<String>("D");

        childC.addChild(childD);
        rootA.addChild(childB);
        rootA.addChild(childC);

        tree.setRoot(rootA);

        Map<CategoryTreeNode<String>, Integer> preOrderMapWithDepth = new LinkedHashMap<CategoryTreeNode<String>, Integer>();
        preOrderMapWithDepth.put(new CategoryTreeNode<String>("A"), 0);
        preOrderMapWithDepth.put(new CategoryTreeNode<String>("B"), 1);
        preOrderMapWithDepth.put(new CategoryTreeNode<String>("C"), 1);
        preOrderMapWithDepth.put(new CategoryTreeNode<String>("D"), 2);

        assertEquals(tree.buildWithDepth(CategoryTreeTraversalOrderEnum.PREV_ORDER).toString(), preOrderMapWithDepth.toString());
     }

    @Test
    public void TestPostOrderBuildWithDepth() {
        CategoryTree<String> tree = new CategoryTree<String>();

        CategoryTreeNode<String> rootA = new CategoryTreeNode<String>("A");
        CategoryTreeNode<String> childB = new CategoryTreeNode<String>("B");
        CategoryTreeNode<String> childC = new CategoryTreeNode<String>("C");
        CategoryTreeNode<String> childD = new CategoryTreeNode<String>("D");

        childC.addChild(childD);
        rootA.addChild(childB);
        rootA.addChild(childC);

        tree.setRoot(rootA);

        Map<CategoryTreeNode<String>, Integer> postOrderMapWithDepth = new LinkedHashMap<CategoryTreeNode<String>, Integer>();
        postOrderMapWithDepth.put(new CategoryTreeNode<String>("B"), 1);
        postOrderMapWithDepth.put(new CategoryTreeNode<String>("D"), 2);
        postOrderMapWithDepth.put(new CategoryTreeNode<String>("C"), 1);
        postOrderMapWithDepth.put(new CategoryTreeNode<String>("A"), 0);

        assertEquals(tree.buildWithDepth(CategoryTreeTraversalOrderEnum.POST_ORDER).toString(), postOrderMapWithDepth.toString());
    }

    @Test
    public void TestToString() {
        CategoryTree<String> tree = new CategoryTree<String>();

        CategoryTreeNode<String> rootA = new CategoryTreeNode<String>("A");
        CategoryTreeNode<String> childB = new CategoryTreeNode<String>("B");
        CategoryTreeNode<String> childC = new CategoryTreeNode<String>("C");
        CategoryTreeNode<String> childD = new CategoryTreeNode<String>("D");

        childC.addChild(childD);
        rootA.addChild(childB);
        rootA.addChild(childC);

        tree.setRoot(rootA);

        List<CategoryTreeNode<String>> preOrderList = new ArrayList<CategoryTreeNode<String>>();
        preOrderList.add(new CategoryTreeNode<String>("A"));
        preOrderList.add(new CategoryTreeNode<String>("B"));
        preOrderList.add(new CategoryTreeNode<String>("C"));
        preOrderList.add(new CategoryTreeNode<String>("D"));

        assertEquals(tree.toString(), preOrderList.toString());
    }

    @Test
    public void TestToStringWithDepth() {
        CategoryTree<String> tree = new CategoryTree<String>();

        CategoryTreeNode<String> rootA = new CategoryTreeNode<String>("A");
        CategoryTreeNode<String> childB = new CategoryTreeNode<String>("B");
        CategoryTreeNode<String> childC = new CategoryTreeNode<String>("C");
        CategoryTreeNode<String> childD = new CategoryTreeNode<String>("D");

        childC.addChild(childD);
        rootA.addChild(childB);
        rootA.addChild(childC);

        tree.setRoot(rootA);

        Map<CategoryTreeNode<String>, Integer> preOrderMapWithDepth = new LinkedHashMap<CategoryTreeNode<String>, Integer>();
        preOrderMapWithDepth.put(new CategoryTreeNode<String>("A"), 0);
        preOrderMapWithDepth.put(new CategoryTreeNode<String>("B"), 1);
        preOrderMapWithDepth.put(new CategoryTreeNode<String>("C"), 1);
        preOrderMapWithDepth.put(new CategoryTreeNode<String>("D"), 2);

        assertEquals(tree.toStringWithDepth(), preOrderMapWithDepth.toString());
    }
}
