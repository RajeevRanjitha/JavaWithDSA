package binarySearchTrees;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryNodeClass <T>{
	T val;
	BinaryNodeClass<T> left;
	BinaryNodeClass<T> right;
	BinaryNodeClass(T val)
	{
		this.val=val;
	}
	public BinaryNodeClass()
	{
		
	}
	static Scanner sc=new Scanner(System.in);
	public  BinaryNodeClass<Integer> createBinary()
	{
		System.out.print("Enter the number of Elements");
		int n=sc.nextInt();
		System.out.println("Enter the values of the BinaryTree");
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0;i<n;i++) 
		{
			int x=sc.nextInt();
			a.add(x);
		}
		Collections.sort(a);
		BinaryNodeClass<Integer>root=create(a,0,a.size()-1);
		return root;
	}
	
	private BinaryNodeClass<Integer> create(ArrayList<Integer>a,int start,int end) {
		if(start>end) 
		{
			return null;
		}
		Integer mid=(start+end)/2;
		BinaryNodeClass<Integer>root=new BinaryNodeClass<>(a.get(mid));
		root.left=create(a,start,mid-1);
		root.right=create(a,mid+1,end);
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