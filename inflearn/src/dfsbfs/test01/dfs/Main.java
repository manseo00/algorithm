package dfsbfs.test01.dfs;

public class Main {
	/*
	 * 문제 : DFS - 전위순회, 중위순회, 후위순회
	 */
	
	Node root;//null
	
	void dfs(Node root) {
		if(root==null) return;
		else {
			System.out.print(root.data + " > ");//전위순회출력
			dfs(root.lt);
//			System.out.print(root.data + " > ");//중위순회출력
			dfs(root.rt);
//			System.out.print(root.data + " > ");//후위순회출력
		}
	}
	
	public static void main(String[] args) {
		
		Main tree = new Main();
		tree.root = new Node(1);//가상주소 100
		tree.root.lt = new Node(2);//가상주소 200
		tree.root.rt = new Node(3);//가상주소 300
		tree.root.lt.lt = new Node(4);//가상주소 400
		tree.root.lt.rt = new Node(5);//가상주소 500
		tree.root.rt.lt = new Node(6);//가상주소 600
		tree.root.rt.rt = new Node(7);//가상주소 700
		
		tree.dfs(tree.root);
		
	}
}

class Node{
	int data;
	Node lt;//left
	Node rt;//right
	
	public Node(int data) {
		this.data = data;
	}
}
