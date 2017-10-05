package com.dc.algorithms.technical;


import org.junit.Test;
import static org.junit.Assert.*;


import com.dc.algorithms.technical.linkedlist.LinkedListCustom;
import com.dc.algorithms.technical.linkedlist.LinkedListCustom.Node;


public class LinkedListTest {

	public void test1(){
    	LinkedListCustom list = new LinkedListCustom();
        list.head = new Node(5);

    	LinkedListCustom list2 = new LinkedListCustom();
        list2.head = new Node(5);
        
        Node answer = LinkedListCustom.maximumSubSum(list.head, list2.head);
        

        assertEquals(5, answer.data);
        assertEquals(null, answer.next);
	}
	
	public void test2(){
    	LinkedListCustom list = new LinkedListCustom();
        list.head = new Node(7);

    	LinkedListCustom list2 = new LinkedListCustom();
        
        Node answer = LinkedListCustom.maximumSubSum(list.head, list2.head);

        assertEquals(7, answer.data);
        assertEquals(null, answer.next);
	}
	
	public void test3(){
    	LinkedListCustom list = new LinkedListCustom();
        list.head = new Node(3);

        LinkedListCustom list2 = new LinkedListCustom();
    	list2.head = new Node(4);
    	
        Node answer = LinkedListCustom.maximumSubSum(list.head, list2.head);
        assertEquals(4, answer.data);
        assertEquals(null, answer.next);
	}

	@Test
	public void test4(){
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
        
        LinkedListCustom list3 = new LinkedListCustom();
        list3.head = new Node(1);
        list3.head.next = new Node(3);
        list3.head.next.next = new Node(12);
        list3.head.next.next.next = new Node(32);
        list3.head.next.next.next.next = new Node(90);
        list3.head.next.next.next.next.next = new Node(125);
        list3.head.next.next.next.next.next.next = new Node(240);
        list3.head.next.next.next.next.next.next.next = new Node(511);

        Node answer = LinkedListCustom.maximumSubSum(list.head, list2.head);
        
        Node testNode = list3.head;
        while (answer != null && testNode != null) {
        	System.out.println("Answer " + answer.data + " / TestNode " + testNode.data);
        	assertEquals(testNode.data, answer.data);
		}
	}


}
