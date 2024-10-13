import java.util.Scanner;

//in this file i will implementing binary tree using linked representation

public class BinaryTreeImplementation{
BinaryTreeImplementation(){

}

private static class Node{
int value;
Node right;
Node left;

public Node(int value){
this.value=value;
}
}

private Node root;

//inserting elements
public void populate(Scanner s){
System.out.println("Enter the root node : ");
int value=s.nextInt();
root=new Node(value);
populate(s,root);
}

private void populate(Scanner s,Node node){
System.out.println("Do you want to enter the left of "+node.value);
boolean left=s.nextBoolean();
if(left){
System.out.println("Enter the value of left of : "+node.value);
int value=s.nextInt();
node.left=new Node(value);
populate(s,node.left);
}

System.out.println("Do you want to enter the right of "+node.value);
boolean right=s.nextBoolean();
if(right){
System.out.println("Enter the value of right of : "+node.value);
int value=s.nextInt();
node.right=new Node(value);
populate(s,node.right);
}

}





public void Display(){
Display(this.root," ");
}
private void Display(Node node,String indent){
if (node==null){
return;
}
System.out.println(indent+node.value);
Display(node.left,indent+"\t");
Display(node.right,indent+"\t");


}


public static void main(String args[]){
Scanner s=new Scanner(System.in);
BinaryTreeImplementation bt=new BinaryTreeImplementation();
bt.populate(s);
bt.Display();
}

}