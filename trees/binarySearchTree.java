package trees;

public class binarySearchTree {
    public binarySearchTree(){

    }
    
    public class Node{
       private int value;
       private Node left;
       private Node right;
       private int height;
        public Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;

    public int height(Node node){
       if(node==null){
        return -1;
       }
       return node.height;
    }


    public boolean isEmpty(){
        if(root==null){
            return true;
        }
        return false;
    }


    public void display(){
        display(root,"Root node: ");
    }
    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.value);
       display(node.left,"Left child of "+node.value+":");
       display(node.right,"right child of "+node.value+":");
    }

    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }


public void populatesorted(int [] nums){
    populatesorted(nums,0,nums.length);
}
private void populatesorted(int []nums,int start,int end){
    if(start>=end){
        return;
    }
    int mid=(start+end)/2;
    this.insert(nums[mid]);
    populatesorted(nums,start,mid);
    populatesorted(nums,mid+1,end);
}

public void insert(int value){
   root= insert(value,root);
}
private Node insert(int value, Node node){
    if(node==null){
        node=new Node(value);
        return node;
    }
    if(value<node.value){
        node.left=insert(value,node.left);
    }
    if(value>node.value){
        node.right=insert(value,node.right);
    }
    node.height=Math.max(height(node.left),height(node.right))+1;
    return node;

}

public boolean balanced(){
    return balanced(root);
}
private boolean balanced(Node node){
     if(node==null){
        return true;
     }
     return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
}

public void inorder(){
    inorder(root);
}
private void inorder(Node node){
    if(node==null){
        return;
    }
    inorder(node.left);
    System.out.print(node.value+" ");
    inorder(node.right);
}


public void preorder(){
    preorder(root);
}
private void preorder(Node node){
    if(node==null){
        return;
    }
    System.out.print(node.value+" ");
    inorder(node.left);
    inorder(node.right);
}




public void postorder(){
    postorder(root);
}
private void postorder(Node node){
    if(node==null){
        return;
    }
    inorder(node.left);
    inorder(node.right);
    System.out.print(node.value+" ");
}


public static void main(String[] args) {
    binarySearchTree tree=new binarySearchTree();
    int [] nums={1,2,3,4,5,6,7,8,9};
   // tree.populate(nums);
    tree.populatesorted(nums);
    tree.display();
    tree.inorder();
    System.out.println();
    tree.preorder();
    System.out.println();
    tree.postorder();
}
}
