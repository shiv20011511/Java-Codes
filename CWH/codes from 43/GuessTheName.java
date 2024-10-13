
import java.util.Random;
import java.util.Scanner;
//creating a class which randomly genrates numbers between 1-20 and user has to guess the correct one with number of guess shown
public class GuessTheName{
public static void main(String args[]) {

    GuessTheName g=new GuessTheName();
    g.Guessing(g.random());


}
int random(){
    Random r = new Random();
    int number = r.nextInt(20);
    return number;
}
  int Guessing(int n){
    Scanner s=new Scanner(System.in);
      int guess=0;
    int count=0;
    do {
        System.out.print("\u001b[31m"+"Enter Your Guess -> ");
        guess=s.nextInt();
        count++;
        if (guess > n) {
            System.out.println("\u001b[36m"+"Number is Smaller than your guess ");
        } else if (guess < n) {
            System.out.println("\u001b[33m"+"Number is greater than your guess ");
        } else if (guess == n) {
            System.out.println("\u001b[32m"+"You Guessed the correct Number in  " +"\u001b[34m"+ count + "\u001b[32m Guesses");
            break;
        }
//        return guess;
    }while(true);
    return guess;
    }

}