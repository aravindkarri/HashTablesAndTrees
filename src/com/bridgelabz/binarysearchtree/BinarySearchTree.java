package com.bridgelabz.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>>
{
	BinaryNode<T> root;
	
	
	/**
	 * Method to insert a node in binary search tree
	 * @param data
	 */
	public void insert(T data)
	{
		BinaryNode<T> newNode=new BinaryNode<>();
		newNode.data = data;
		newNode.left = null;
		newNode.right = null;
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			BinaryNode<T> tempNode = root;
			while(tempNode != null)
			{
				if(data.compareTo(tempNode.data) > 0)
				{
					if(tempNode.right == null)
					{
						tempNode.right = newNode;
						break;
					}
					else
					{
						tempNode = tempNode.right;
					}
				}
				else if(data.compareTo(tempNode.data) < 0)
				{
					if(tempNode.left == null)
					{
						tempNode.left = newNode;
						break;
					}
					else
					{
						tempNode = tempNode.left;
					}
				}
				else
				{
					System.out.println("Duplicate data not allowed in binarytrees ");
					break;
				}
			}
		}
	}
	
	public int numOfNodes() 
	{
		return size(root);
	}
	/**
	 * Method to count number of nodes in binary search tree
	 * @param root
	 * @return
	 */
    public int size(BinaryNode<T> root)
    {
        if(null == root)
            return 0;
        int nodesLeftSubtree = size(root.left);
        int nodesRightSubtree = size(root.right);
        return nodesLeftSubtree + nodesRightSubtree + 1;
    }
}
