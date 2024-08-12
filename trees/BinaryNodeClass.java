package trees;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class BinaryNodeClass<T> {
	static Scanner sc=new Scanner(System.in);
	public T val;
	public BinaryNodeClass<T> left,right;
	BinaryNodeClass(T val)
	{
		this.val=val;
	}
	BinaryNodeClass()
	{
		
	}
	public void print(BinaryNodeClass<T>root) 
	{
		if(root==null) 
		{
			return;
		}
		System.out.println(root.val);
		print(root.left);
		print(root.right);
	}
	public void printDetailed(BinaryNodeClass<T>root) 
	{
		if(root==null) 
		{
			return;
		}
		System.out.print(root.val+" ");
		if(root.left!=null) 
		{
			System.out.print("L:"+root.left.val+" ");
		}
		if(root.right!=null) 
		{
			System.out.print("R"+root.right.val+" ");
		}
		System.out.println();
		printDetailed(root.left);
		printDetailed(root.right);
	}
	public BinaryNodeClass<Integer> input()
	{
		System.out.println("root value");
		int val=sc.nextInt();
		if(val==-1) 
		{
			return null;
		}
		BinaryNodeClass<Integer>root=new BinaryNodeClass<>(val);
		BinaryNodeClass<Integer>leftroot=input();
		BinaryNodeClass<Integer>rightroot=input();
		root.left=leftroot;
		root.right=rightroot;
		return root;
	}
	public BinaryNodeClass<Integer> Detailedinput(boolean isroot,BinaryNodeClass<Integer>parent,boolean isleft)
	{
		if(isroot) 
		{
			System.out.println("root value");
		}
		else 
		{
			if(isleft) 
			{
				System.out.println("Enter the "+parent.val+"leftNode value");
			}
			else 
			{
				System.out.println("Enter tha"+parent.val+"right node value");
			}
		}
		int val=sc.nextInt();
		if(val==-1) 
		{
			return null;
		}
		BinaryNodeClass<Integer>root=new BinaryNodeClass<>(val);
		BinaryNodeClass<Integer>leftroot=Detailedinput(false,root,true);
		BinaryNodeClass<Integer>rightroot=Detailedinput(false,root,false);
		root.left=leftroot;
		root.right=rightroot;
		return root;
	}
	public BinaryNodeClass<Integer> levelWiseInput()
	{
		Queue<BinaryNodeClass<Integer>>que=new LinkedList<>();
		System.out.println("Enter the root value");
		int val=sc.nextInt();
		if(val==-1) 
		{
			return null;
		}
		BinaryNodeClass<Integer> root=new BinaryNodeClass<Integer>(val);
		que.add(root);
		while(!que.isEmpty()) 
		{
			BinaryNodeClass<Integer> node=que.poll();
			System.out.println("Enter the Left childe of "+ node.val);
			val=sc.nextInt();
			if(val!=-1) 
			{
				BinaryNodeClass<Integer> rootleft=new BinaryNodeClass<Integer>(val);
				que.add(rootleft);
				node.left=rootleft;
			}
			System.out.println("Enter the right child of "+node.val);
			val=sc.nextInt();
			if(val!=-1)
			{
				BinaryNodeClass<Integer> rootright=new BinaryNodeClass<Integer>(val);
				que.add(rootright);
				node.right=rootright;
			}
		}
		return root;
	}
	public void printlevelWise(BinaryNodeClass<T> root) 
	{
		if(root==null) 
		{
			return;
		}
		else 
		{
			Queue<BinaryNodeClass<T>>que=new LinkedList<BinaryNodeClass<T>>();
			que.add(root);
			while(!que.isEmpty()) 
			{
				BinaryNodeClass<T> node=que.poll();
				System.out.print(node.val+" ");
				if(node.left!=null) 
				{
					que.add(node.left);
				}
				if(node.right!=null) 
				{
					que.add(node.right);
				}
			}
		}
	}
}
