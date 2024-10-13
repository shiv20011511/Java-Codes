import java.util.Random;
import java.util.Set;
import java.util.HashSet;
public class Experimental{

private static void myfunc(int x){
String msg="Shivkant pandey";
	int[] randomNumbers=new int[5];
        Set<Integer> uniqueNumbers = new HashSet<>();
        Random random=new Random();

        int index = 0;
        while (index < 5) {
            int randomNumber = random.nextInt(5) + 1;
            if (uniqueNumbers.add(randomNumber)) { 
                randomNumbers[index] = randomNumber;
                index++;
            }

}
for (int i=0;i<randomNumbers.length;i++){
//	System.out.println(randomNumbers[i]);
}

}
public static void main(String args[]){
int[] ns=new int[5];
int temp=0;
for (int i=0;i<3;i++){

myfunc(ns[i]);
System.out.println("value of list "+ns[i]);	
}
for (int i=0;i<5;i++){
	
}

}

}