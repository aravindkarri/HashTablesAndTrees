package com.bridgelabz.hashtables;

import java.util.Objects;

public class HashNode 
{
	String key;
	Integer value;
	HashNode next;

	//Generating constructor
	public HashNode(String key, Integer value, HashNode next) {
		super(); 
		this.key = key;
		this.value = value;
		this.next = next;
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, next, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashNode other = (HashNode) obj;
		return Objects.equals(key, other.key) && Objects.equals(next, other.next) && Objects.equals(value, other.value);
	}

}
