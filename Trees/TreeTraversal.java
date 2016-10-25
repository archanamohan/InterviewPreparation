package Trees;

public class TreeTraversal
{
	public void inorder(Node root)
	{
		if(root == null)
			return;
		inorder(root.left);
		System.out.println(root);
		inorder(root.right);
	}
	public void preorder()
	{
		
	}
	public void postorder()
	{
		
	}
	public static void main(String[] args)
	{

	}
}
