package nodeSearch;

public class NodeSums {

	String path;
	public void hasPath(Node root, int sum, String path){
		if(root!=null){
			if(root.data>sum){ // if root is greater than Sum required, return
				return;
			}else{
				path+=" " + root.data; //add root to path
				sum=sum-root.data; // update the required sum
				if(sum==0){ //if sum required =0, means we have found the path
					System.out.println(path);
				}
				hasPath(root.left, sum, path);
				hasPath(root.right, sum, path);
			}			
		}
	}	
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		NodeSums i = new NodeSums();
		i.hasPath(root, 10, "");
		
		
		

	} // Ends main 
	
	

} // Ends Class 


class Node {
	int data; 
	
	Node left, right;
	
	public Node(int data) {
		this.data = data;
	}
	
	
	
} // End Node Class 
