package com.dc.algorithms.technical.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCustom {
	public Node head;

	public static class Node {

		public int data;
		public Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	// Function that detects loop in the list
	int detectAndRemoveLoop(Node node) {
		Node slow = node, fast = node;
		while (slow != null && fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			System.out.println(" SLOW " + slow.data + " FAST " + fast.data);

			// If slow and fast meet at same point then loop is present
			if (slow == fast) {
				removeLoop(slow, node);
				return 1;
			}
		}
		return 0;
	}

	Node reverse(Node current) {
		Node previous = null;
		Node head = current;

		while (current != null && current.next != null) {

			Node temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;

		}
		current.next = previous;
		head = current;

		return head;
	}

	// Function to remove loop
	void removeLoop(Node loop, Node curr) {
		Node ptr1 = null, ptr2 = null;

		/*
		 * Set a pointer to the beging of the Linked List and move it one by one
		 * to find the first node which is part of the Linked List
		 */
		ptr1 = curr;
		while (1 == 1) {

			/*
			 * Now start a pointer from loop_node and check if it ever reaches
			 * ptr2
			 */
			ptr2 = loop;
			while (ptr2.next != loop && ptr2.next != ptr1) {
				ptr2 = ptr2.next;
			}

			/*
			 * If ptr2 reahced ptr1 then there is a loop. So break the loop
			 */
			if (ptr2.next == ptr1) {
				break;
			}

			/* If ptr2 did't reach ptr1 then try the next node after ptr1 */
			ptr1 = ptr1.next;
		}

		/*
		 * After the end of loop ptr2 is the last node of the loop. So make next
		 * of ptr2 as NULL
		 */
		ptr2.next = null;
	}


	public static Node maximumSubSum(Node node1, Node node2) {

		Map<Integer, KeyValue> numMap = new HashMap<>();
		Node newItem = null;

		int sum1 = 0;
		int sum2 = 0;

		Node startNode1 = node1;
		Node startNode2 = node2;

		Node currentItem = null;

		if (node1 == null && node2 == null) {
			return newItem;
		} else if (node1 != null && node2 == null) {
			newItem = new Node(node1.data);
			newItem.next = null;
		} else if (node1 == null && node2 != null) {
			newItem = new Node(node2.data);
			newItem.next = null;
		}

		numMap.put(startNode1.data, new KeyValue(0,1));
		numMap.put(startNode2.data, new KeyValue(0,2));

		while (node1 != null && node2 != null) {
			sum1 += node1.data;
			sum2 += node2.data;

			if (startNode1 == null && startNode2 == null) {
				startNode1 = node1;
				startNode2 = node2;

			}

			/**
			 * Handling case #01, if first members are same
			 */
			if (node1.data == node2.data && startNode1 == node1 && startNode2 == node2) {
				newItem = new Node(node1.data);
				newItem.next = null;
				startNode1.next = node1.next;
				startNode2.next = node2.next;
			} else {

				if (newItem == null && (startNode1.next == null || startNode2.next == null)) {
					if (sum1 >= sum2) {
						newItem = new Node(startNode1.data);
						newItem.next = null;
					} else {
						newItem = new Node(startNode2.data);
						newItem.next = null;
					}
				} else {

					if ((numMap.get(node1.data).listId == 2 || numMap.get(node2.data).listId == 1) || (node1.data == node2.data)) {

						Node tempFinal = null;

						if (sum1 >= sum2) {

							while (startNode1 != null && startNode1.data != node1.data) {
								Node temp = new Node(startNode1.data);

								if (currentItem == null) {
									newItem = temp;
									currentItem = newItem;
								} else
									currentItem.next = temp;

								startNode1 = startNode1.next;
							}

							tempFinal = new Node(startNode1.data);
						} else {
							while (startNode2 != null && startNode2.data != node2.data) {
								Node temp = new Node(startNode2.data);

								if (currentItem == null) {
									newItem = temp;
									currentItem = newItem;
								} else
									currentItem.next = temp;

								startNode2 = startNode2.next;
							}

							tempFinal = new Node(startNode2.data);

						}

						currentItem.next = tempFinal;
						sum1 = sum2 = 0;
						startNode1 = null;
						startNode2 = null;
						currentItem = currentItem.next;

						numMap.remove(node1.data);
						numMap.remove(node2.data);

					}

				}

			}



			numMap.putIfAbsent(node1.data, new KeyValue(sum1-node1.data, 1));
			numMap.putIfAbsent(node2.data, new KeyValue(sum2-node2.data, 2));

			
			node1 = node1.next;
			node2 = node2.next;

		}

		return newItem;
	}

	// Function to print the linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		LinkedListCustom list = new LinkedListCustom();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		// list.head.next.next.next.next.next = new Node(2);

		// Creating a loop for testing
		// head.next.next.next.next.next = head.next;
		// list.detectAndRemoveLoop(head);
		// System.out.println("Linked List after removing loop : ");
		// list.printList(head);

		/**
		 * System.out.println("Linked List"); list.printList(list.head);
		 * 
		 * list.head = list.reverse(list.head);
		 * 
		 * System.out.println("\nLinked List after Reverse");
		 * list.printList(list.head);
		 **/

		subSum();
	}

	public static void subSum() {
		LinkedListCustom list = new LinkedListCustom();
		list.head = new Node(1);
		list.head.next = new Node(3);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(90);
		list.head.next.next.next.next = new Node(120);
		list.head.next.next.next.next.next = new Node(240);
		list.head.next.next.next.next.next.next = new Node(511);

		LinkedListCustom list2 = new LinkedListCustom();
		list2.head = new Node(0);
		list2.head.next = new Node(3);
		list2.head.next.next = new Node(12);
		list2.head.next.next.next = new Node(32);
		list2.head.next.next.next.next = new Node(90);
		list2.head.next.next.next.next.next = new Node(125);
		list2.head.next.next.next.next.next.next = new Node(240);
		list2.head.next.next.next.next.next.next.next = new Node(249);

		LinkedListCustom newList = new LinkedListCustom();
		newList.head = maximumSubSum(list.head, list2.head);

		newList.printList(newList.head);
	}
}
