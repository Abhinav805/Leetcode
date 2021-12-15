import java.util.ArrayList;
import java.util.List;

public class TopBottomSumPath {
	
	List<Integer> list = new ArrayList<Integer>();
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(10);
		
		// Input 1 starts here
		root.right = new TreeNode(-3);
		root.right.right = new TreeNode(11);
		
		
		root.left = new TreeNode(5);
		root.left.right = new TreeNode(2);
		root.left.right.right = new TreeNode(1);
			
		root.left.left = new TreeNode(3);
		root.left.left.right = new TreeNode(-2);
		root.left.left.left = new TreeNode(3);
		
		// Input 1 ends here
		
		//Input 2 starts here
		
		/*root = new TreeNode(5);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		
		
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(11);
		root.left.left.right = new TreeNode(2);
		
		root.left.left.left = new TreeNode(7); */
		
		
		
		// Input 2 ends here
		
		
		
		int targetSum = 8;// Target for Input 1
		//int targetSum = 22; // Target for Input 2
		
		TopBottomSumPath obj = new TopBottomSumPath();
		obj.pathSum(root, targetSum);
		System.out.print(count);
		
	}
	 
	    
	  public void pathSum(TreeNode root, int targetSum) {
	    	
	    	if(root == null)
	    	{
	    		return;
	    	}
	    	
	    	list.add(root.val);
	    	
	    	
	    	pathSum(root.left, targetSum);
	    	pathSum(root.right, targetSum);
	    	
	    	int currentSum = 0;
	    	
	    	for(int i= list.size()-1; i>=0; i--)
	    	{
	    		currentSum = currentSum + list.get(i);
	    		if(currentSum == targetSum)
	    		{
	    			++count;
	    		}
	    		
	    	}
	    	
	    	list.remove(list.size()-1);
	    }
}
