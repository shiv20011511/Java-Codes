
class LinkedList_Creating{

static class Node{
int data;
Node next;

}

static class LinkedList{
Node head;
Node tail;
int size;

void AddLast(int val){
Node temp = new Node();

if(size==0){
temp.data = val;
temp.next=null;
head = tail = temp;
size++;
}
else{
Node last=head;

while(last.next!=null){

last=last.next;
//System.out.println("-->> "+last.data);
}

temp.data=val;
temp.next=null;
last.next = tail = temp;
size++;


}


}

//Display

 void Display(){
Node last = head;

while(last!=null){

System.out.print(last.data+"->");

last=last.next;

}
System.out.print(last);


}


//adding at first

void addfirst(int val){



Node temp=new Node();
if(size==0){
temp.data=val;
head=temp;
temp.next=null;

head=tail=temp;
size++;
System.out.println("Data if size 0 in addfirst --> "+head.data);
}else{

temp.data=val;

temp.next=head;
head=temp;
System.out.println("Data --> "+head.data);
size++;
}

}
//tail.data=second;
//tail.next=null;

//get the size of linkedlist

void GetSize(){

//Node temp=new Node();
LinkedList link = new LinkedList();
System.out.println();
//System.out.println("Size -->> "+link.size);
System.out.println("Size of Linked List -->>>>> "+size);
}



}

//

public static void main(String args[]){
LinkedList link = new LinkedList();


link.addfirst(1);
link.AddLast(10);
link.addfirst(2);
link.AddLast(20);
link.AddLast(30);
link.AddLast(40);

link.addfirst(4);
link.addfirst(546647);
link.Display();
link.GetSize();
}


}