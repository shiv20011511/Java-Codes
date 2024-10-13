public class Last_Occurence {
    public static void main(String[] args){
        int arr[] = { 8, 2, 5 ,1 ,5 ,7, 1 , 4 , 9};
        int key =5;
       System.out.println( lastOcc(arr,key,0));
    }
    public static int lastOcc(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }

        //looking forward i.e check at i+1 instead of i
        //System.out.println(" value of i " + i);

        int isFound =lastOcc(arr,key,i+1);
        //System.out.println("  value of i after call " + i);
        if(isFound != -1){
           // System.out.println("is found " + isFound);
         return isFound;
        }
    
    //if key is not at i+1 we will check at i i.e with itself
    if(arr[i]==key){
        //System.out.println(" aaaa");
        return i;
    }
    return isFound;

}
}
