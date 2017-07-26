package com.dc.algorithms.technical.linkedlist;

public class KeyValue{
	public KeyValue(int sum, int listId) {
		this.sum = sum;
		this.listId = listId;
	}
	int sum;
	@Override
	public String toString() {
		return "KeyValue [sum=" + sum + ", listId=" + listId + "]";
	}
	int listId;
}