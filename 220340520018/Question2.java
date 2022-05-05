/*
Q2:Reverse a Linked List 
Given the pointer to the head node of a linked list, change the next pointers of the nodes so that their 
order is reversed. The head pointer given may be null meaning that the initial list is empty.
Example
head references the list 1->2->3->NULL
Manipulate the next pointers of each node in place and return head, now referencing the head of the 
list.
3->2->1->NULL.
Function Description
Complete the reverse function in the editor below.
reverse has the following parameter:
Node pointer head: a reference to the head of a list
Returns
LinkedListNode pointer: a reference to the head of the reversed list
Input Format
The first line contains an integer t, the number of test cases.
Each test case has the following format:
The first line contains an integer n, the number of elements in the linked list.
Each of the next n lines contains an integer, the data values of the elements in the linked list.
Test case 1:
1
5
1
2
3
4
5
Output :
5 4 3 2 1
Test case 2:
2
4
3
4
2
5
Output:
5 2 4 3
[10 marks]

*/

import java.util.*;
class Question2
{
	static Node head;
	
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	void addnode(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	
    Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while(current!=null)
		{
			next =current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node = prev;
		return node;
	}
	
	static void display(Node node)
	{
		while(node != null)
		{
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
	
	
	
	public static void main(String args[])
	{
		
		
		Question2 q2 = new Question2();
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i =0;i<test;i++)
		{
			int n = sc.nextInt();
			for(int j=0;j<n;j++)
			{
				int x = sc.nextInt();
				q2.addnode(x);
			}
			head = q2.reverse(head);
			q2.display(head);
		}
	}
}