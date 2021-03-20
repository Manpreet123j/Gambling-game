
//Name: Manpreet Kaur 
//Student ID:201905636
//Date Submitted:03/19/2021
//Class IN2203 Section Number G1
//Name of work: Assignment 1: The gambling Game
import java.util.*;
import java.lang.Math;


public class MainApplicaton {
    public static void main(String[] args){
    Casino c= new Casino();
    c.OrganizeNewGame();
    }
}
class Casino{
    Player p1= new Player();
    Game g1= new Game();
    String userAnswer;
        Scanner s= new Scanner(System.in);
        public void OrganizeNewGame(){
            System.out.println("Welcome to the Casino: Would you like to play a game? (y/n)");
        userAnswer= s.nextLine();
        if(userAnswer.equals("y")){
            System.out.println("Let's get started");
                    g1.PlayGame();
                    p1.PlayerInput();
                    
                    p1.Game_design();
}
else
{System.out.println("Good bye");}
}
}
class Game{
    Random r= new Random();
    int ComputerGuess= r.nextInt(100) ;
    
    public void PlayGame(){
        System.out.println("Guess a number from 1 to 100");
        System.out.println("I'll guess a game ");
        System.out.println("If your guess is within 20 of my guess: then you win . Else i will win  ");
        ComputerGuess= ComputerGuess();
    }
     public int ComputerGuess(){
      int programGuess;
       programGuess = r.nextInt(100);
      return programGuess;
     }
}
class Player extends Game{
    String Name;
    int Age;
    Scanner inp= new Scanner(System.in);
    Game object= new Game();
    public void PlayerInput()
    {
         System.out.println("Enter Name");
        Name= inp.nextLine();
        System.out.println("Enter Age");
        Age= inp.nextInt();
       
    }
    
    public void Game_design()
    {
        int j= 5;
        int number;
        
        for(int k=1; k<= j;k++)
        {
            System.out.println("please guess a number between 1 to 100");
            number= inp.nextInt();
            
            if(Math.abs(number - object.ComputerGuess)< 20 )
            {System.out.println("Player wins");
                System.out.println("The Number is within 20 of " + object.ComputerGuess );
            break;}
            
            else 
            {
                System.out.println(" Computer wins" + number + " is not within 20 of " + object.ComputerGuess);
            }
            if(k==j)
            {
                System.out.println("you are out of trials");
                System.out.println("The number is"+ ComputerGuess);
            }
            
        }
        
        
    }
    
}
        

