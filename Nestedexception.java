public class Nestedexception{
	public static void main(String args[]){
		int[] ar={1,2,3};
		try{
			System.out.println(9/0);
		}catch (ArithmeticException e){
			System.out.println("Exception found --- "+e);
			
		}
		try{
			System.out.println(ar[9]);
		}catch (Exception d){
			System.out.println("Array out of bounds "+d);
		}
		try{
			System.out.println(9+9);
		}
		catch (Exception f){
			System.out.println(f);
		}
}

}