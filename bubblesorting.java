public class bubblesorting {
    public static  void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]= {20,19,18,17,16,15,14};
        for(int i=0;i<arr.length-1;i++){
            System.out.println("pass number : "+i+"----------------");
            for (int j=0;j<arr.length-i-j;j++){
                  if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    printarray(arr);
                }
            }
        }
    }
}
