class Preandpost{
public static void main(String args[]){

int x=5;
//post
//int post=x++;
//System.out.println("Post : " + post);
//pre
//int pre=++x;
//System.out.println("Pre : "+ pre);
System.out.println(++x + x++);
//to check what is printing in octal
//the below code prints 14 instead of 016 because it is in octal format
int[] y={120,200,016};
for (int i=0;i<y.length;i++){
System.out.print(y[i] + " ");
}
int count=1;
while(count < 15){
System.out.println(count % 2==1 ? "***" : "+++++");
++count;
}


}
}

