package bst;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTree {

	ArrayList<Integer> list=new ArrayList<>();
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		Node root=null;
		Node nn=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of nodes");
		int sizes=sc.nextInt();
		int i;
		for(i=1;i<=size;i++)
		{
			System.out.println("Please enter data for the node :");
			int item=sc.nextInt();
			nn=new Node(item);
			if(root==null)
				      root=nn;
			else
				bst.insert(root,nn);
			
		}
		//System.out.print("\nInorder Traversal : ");
		bst.inorder(root);
		System.out.println(bst.list);
		
		System.out.println("Please enter the sum ");
		int sum=sc.nextInt();
		int flag=0;
		for(i=0;i<bdst.list.size();i++)
		{
			int n1=bst.list.get(i); //n1=25
			int n2=sum-n1;
			if(bst.list.contains(n2) && n1!=n2 && n1<n2)
			{
				System.out.println("FOUND");
				flag=1;
				System.out.println("+n1+","+n2+"]");
						//break;
						
			}
		}
		if(falg==0)
			System.out.println("No elements found");
		
		//          System.out.print("\nPreOrder Traversal : ");
		//          bst.preOrder(root)
		//
		//          System.out.print("\nPostOrder Traversal : ");
		//          bst.postOrder(root);
		            sc.close();
		            
	}

	private void postOrder(Node root) {
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
			
		}
	}
	private void insert(Node root) {
		
		if(root!=null)
		{
			System.out.print(root.data + " ");
			perOrder(root.left);
			preOrder(root.right);
			
		}
	}
	private void inOrder(Node root) //LDR
	{
		if(root!=null)
		{
			inOrder(root.left);
			list.add(root.data);
			inOrder(root.right);
			
		}
	}
	
	private void insert(Node root, Node nn) {
		
		if(nn.data>root.data) //go in right direction
		{
			if(root.right==null)
			{
				root.right=nn;
				
			}
			else
			{
				insert(rooot.right,nn);
			}
		}
		else
		{
			if(root.left==null)
			{
				root.left=nn;
				
			}
			else
			{
				insert(root.left,nn);
			}
		}
	}
}

