//Linear Search Algo


public class Linear_Search{
public static void main(String args[]){
int[] arr={14,55,55,333,77,4,5,6,8,3,2,88,99};

int target=400;

int ls=Linear_Search(arr,target);
if(ls>=0){
System.out.println("The element "+target+" is at Index "+ls);
}else{
System.out.println("The element "+target+" is not found ");
}
}

static int Linear_Search(int[] arr,int target){
for(int i=0;i<arr.length;i++){
//Searching one by one by iterating

if(arr[i]==target){


return i;
}


}

return -1;
}

}