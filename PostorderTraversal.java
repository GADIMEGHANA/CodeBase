import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    Node root;
    public void insert(int data){
        root=insertAt(root,data);
    }
    public Node insertAt(Node root,int data){
        if(root ==null){
            root=new Node(data);
        }
        else if(data< root.data){
            root.left=insertAt(root.left,data);
        }
        else if(data> root.data){
            root.right=insertAt(root.right,data);
    }
        return root;
    }
    public void postOrder(){
        postOrderAt(root);
    }
    public void postOrderAt(Node root){
        if(root==null){
            return ;
        }
        postOrderAt(root.left);
        postOrderAt(root.right);
        System.out.println(root.data);
    }
    
    
}

public class PostorderTraversal {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BinaryTree bt=new BinaryTree();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            bt.insert(a);
        }
        bt.postOrder();
        sc.close();
        
    }
}