//creating a tree

public class BinaryTree{



static class Node{
int data;
Node left;
Node right;

Node(int data){
this.data=data;
this.left=null;
this.right=null;
}

}

static class Buildingbinarytree{
static int index=-1;

public static Node binarytree(int ar[]){
index++;
if(ar[index]==-1){
return null;
}
Node newNode = new Node(ar[index]);
newNode.left=binarytree(ar);
newNode.right=binarytree(ar);

return newNode;

}

}



public static void main(String args[]){
int ar[]={1,2,-1,3,4,5,6,-1};
Buildingbinarytree b=new Buildingbinarytree();
Node root=b.binarytree(ar);
System.out.println("root "+root.data);
}








}