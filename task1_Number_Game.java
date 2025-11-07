import java.util.Random;
import java.util.Scanner;

public class task1_Number_Game {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
    
        int guess=0;

        int num=rand.nextInt(100)+1;
        System.out.println("guess a number between 1 to 100:");
        
        while(guess!=num){
            System.out.println("enter your guess:");
            guess=sc.nextInt();
            
            if (guess==num){
                System.out.println("your guess is correct!");
            }
            else if (guess>num){
                System.out.println("your guess is to high");
            }
            else{
                System.out.println("your guess is low");
            }
        }
        

    }
    
}