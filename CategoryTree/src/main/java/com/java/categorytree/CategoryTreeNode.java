package com.java.categorytree;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CategoryTreeNode<T> {

    private T data;
    private List<CategoryTreeNode<T>> children;
    private CategoryTreeNode<T> parent;

    public CategoryTreeNode() {
        super();
        children = new ArrayList<CategoryTreeNode<T>>();
    }

    public CategoryTreeNode(T data) {
        this();
        setTreeData(data);
    }

    public CategoryTreeNode<T> getParent() {
        return this.parent;
    }

    public List<CategoryTreeNode<T>> getChildren() {
        return this.children;
    }

    public int getNumberOfChildren() {
        return getChildren().size();
    }

    public boolean hasChildren() {
        return (getNumberOfChildren() > 0);
    }

    public void setChildren(List<CategoryTreeNode<T>> children) {
        for(CategoryTreeNode<T> child : children) {
           child.parent = this;
        }

        this.children = children;
    }

    public void addChild(CategoryTreeNode<T> child) {
        child.parent = this;
        children.add(child);
    }

    public void addChildAt(int index, CategoryTreeNode<T> child) throws IndexOutOfBoundsException {
        child.parent = this;
        children.add(index, child);
    }

    public void removeChildren() {
        this.children = new ArrayList<CategoryTreeNode<T>>();
    }

    public void removeChildAt(int index) throws IndexOutOfBoundsException {
        children.remove(index);
    }

    public CategoryTreeNode<T> getChildAt(int index) throws IndexOutOfBoundsException {
        return children.get(index);
    }

    public T getData() {
        return this.data;
    }

    public void setTreeData(T data) {
        this.data = data;
    }

    public String toString() {
        return getData().toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
           return true;
        }
        if (obj == null) {
           return false;
        }
        if (getClass() != obj.getClass()) {
           return false;
        }
        CategoryTreeNode<?> other = (CategoryTreeNode<?>) obj;
        if (data == null) {
           if (other.data != null) {
              return false;
           }
        } else if (!data.equals(other.data)) {
           return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
       final int prime = 25;
       int result = 1;
       result = prime * result + ((data == null) ? 0 : data.hashCode());
       return result;
    }

    public String toStringVerbose() {
        String stringRepresentation = getData().toString() + ":[";

        for (CategoryTreeNode<T> node : getChildren()) {
            stringRepresentation += node.getData().toString() + ", ";
        }

        //Pattern.DOTALL causes ^ and $ to match. Otherwise it won't. It's retarded.
        Pattern pattern = Pattern.compile(", $", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(stringRepresentation);

        stringRepresentation = matcher.replaceFirst("");
        stringRepresentation += "]";

        return stringRepresentation;
    }
}

