/*
Q3:Java program to implement two stacks in a single array.
11 5 10 15 7 40
Note: Please check is required to be update in list and then define test case.
Input values :
push1(5); 
push2(10); 
push2(15); 
push1(11); 
push2(7); 
push2(40);
Output: (Required to be printed like this only)
Popped element from stack1 is 11
Popped element from stack2 is 40
[10 marks]

*/
import java.util.*;
class Question
{
	int arr[];
	int size;
	int top1, top2;
	
	Question(int n)
	{
		size = n;
		arr = new int[n];
		top1 = n / 2 + 1;
		top2 = n / 2;
	}
	
	void push1(int a)
	{
		if(top1 > 0)
		{
			top1--;
			arr[top1] = a;
		}
		else
		{
			System.out.println("Stack Overflow ");
			return;
		}
		
	}
	
	void push2(int a)
	{
		if(top2 < size - 1)
		{
			top2++;
			arr[top2] = a;
			
		}
		else
		{
			System.out.println("Stack Overflow");
			return;
		}
	}
	
	int pop1()
	{
		if(top1 <= size / 2)
		{
			int a = arr[top1];
			top1++;
			return a;
		}
		else{
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		return 0;
	}
	
	
	int pop2()
	{
		
		if(top2 >= size /2+1)
		{
			int a = arr[top2];
			top2--;
			return a;
		}
		else{
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		return 1;
	}
}

class Question3
{
	public static void main(String args[])
	{
		Question qq = new Question(10);
		qq.push1(5); 
		qq.push2(10); 
		qq.push2(15); 
		qq.push1(11); 
		qq.push2(7);
		
        System.out.println("Popped element from stack1 is "+qq.pop1());		
		qq.push2(40);
		System.out.println("Popped element from stack2 is "+qq.pop2());
	}
}