package com.bridgelabz.hashtables;

public class HashLinkedList 
{
	HashNode head;

	/**
	 * Method to search for a particular key 
	 * @param key
	 * @return
	 */
	public HashNode search(String key)
	{
		HashNode temp = head;
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				return temp;
			}
			temp = temp.next;
		}
		return null;

	}
	/**
	 * Method to insert new key,value pair to hash table
	 * @param key
	 * @param value
	 */
	public void add(String key, Integer value)
	{
		HashNode newNode = new HashNode(key,value,null);
		newNode.next = head;
		head = newNode;
	}
}
