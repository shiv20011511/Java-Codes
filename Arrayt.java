class Arrayt{
	public static void main(String args[]){
            int arr[][]= {{1,2},{3,4},{7,9}};
		System.out.println("index values "+arr[0][1]);
            for (int i=0;i<arr.length;i++)
	      for (int j=0;j<arr.length-1;j++){
                 System.out.println(arr[i][j]);
		}     
        }
}