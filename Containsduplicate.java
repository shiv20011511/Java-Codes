//contains duplicate 
public class Containsduplicate{
public static void main(String args[]){
int dub=0;
int dubcount=0;
int[] intarr={1,2,2,3,3,4,5,1};
String[] strarr={"shiv","rajan","shashank","shiv"};
for (int i=0;i<intarr.length;i++){
for (int j=1;j<intarr.length;j++){
if (intarr[i]==intarr[j]){
dub=intarr[i];
dubcount+=1;
System.out.print(dub+" ");
}

}


}
System.out.println();
System.out.println("total duplicate value"+" "+dubcount);
}


}