
class LinkedList{
//starting node
private Node head;
//ending node
private Node tail;
//size
private int size;

LinkedList(){
this.size=0;
}

private class Node{
private int value;
private Node next;

public Node(int value){
this.value=value;
}

public Node(int value,Node next){
this.value=value;
this.next=next;
}

}



//method to insert in a linked list in int datatype

public void insertfirst(int val){
Node node=new Node(val);
node.next=head;
head=node;

if(tail ==null){
tail=head;
}
size++;

}

public void insertlast(int val){
Node n=new Node(val);




if(tail==null){
insertfirst(val);
}

tail.next=n;
tail=n;
size++;

/*Node last=head;
while(last.next!=null){
last=last.next;
}
last.next=n;	
*/
}



//method to display a linked list
public void display(){
Node temp=head;

while(temp!=null){
System.out.print(temp.value+" -----> ");
temp=temp.next;
}
System.out.println("END");

}

//display size of linked list

public void getsize(){
System.out.println("Size ** "+size);
}

//method for removing first element in a linked list

public void removefirst(){
Node temp=head;
if(temp==null){
System.out.println("Empty linked list :( ");
}else{
head=head.next;
size--;
}
}
//method for removing last relemt in a linked list

public void removelast(){
if(tail==null){
System.out.println("Empty linked list :( ");
}else{





Node currnode=head;
Node lastnode=head.next;
while(lastnode.next!=null){
currnode=currnode.next;
lastnode=lastnode.next;
}
System.out.println("Removing Tail -> "+tail.value);
currnode.next=null;
tail=currnode;
size--;

}
}

//to reverse a linked list

public void reverse(){
System.out.println("Reversing Linked list ");
if(head==null){
System.out.println("Empty linked list :( ");
}
Node currentnode=head;

Node previous=null;
Node next=null;
System.out.println("\u001b[37m");
while(currentnode!=null){
System.out.println("\u001b[37m");

next=currentnode.next;

currentnode.next=previous;
previous=currentnode;
System.out.println("currentnode "+"\u001b[33m"+currentnode.value);
System.out.println("\u001b[37m");
currentnode=next;
System.out.println("previous "+"\u001b[31m"+previous.value);

}


System.out.println("\u001b[37m");

tail=head;

head=previous;



}



}






public class LLMain{
public static void main(String args[]){
LinkedList ll=new LinkedList();

ll.insertfirst(30);
ll.insertlast(90);
ll.insertfirst(100);
ll.insertlast(200);

ll.insertfirst(20);
ll.insertfirst(40);
ll.insertfirst(50);

ll.display();
ll.getsize();
ll.removefirst();
ll.display();
ll.getsize();
ll.removelast();
ll.removelast();
ll.removelast();
ll.display();
ll.getsize();
ll.insertlast(300);
ll.insertlast(400);
ll.display();
ll.getsize();

ll.reverse();
ll.display();
System.out.println("Removing ");
ll.removelast();
ll.removelast();
ll.removelast();

ll.display();
ll.reverse();
ll.display();

}

}