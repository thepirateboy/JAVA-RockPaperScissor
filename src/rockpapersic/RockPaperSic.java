
package rockpapersic;

import java.util.Random;
import java.util.Scanner;


public class RockPaperSic 
{

  
    public static void main(String[] args) 
    {
        // 1. Declare Vars
        int computer_choice;
        int human_choice;
        Scanner scanner = new Scanner (System.in);
        
        // 2. Get inpout for vars
        // get random values for computer rock, paper, scissor either 1, 2, or 3
        Random random = new Random();
        computer_choice = random.nextInt(3);
        
        System.out.println("Game has been started !");
        
        System.out.println("what do you want? (0 = rock; 1 = paper; 2 = scissor) ");
        human_choice = scanner.nextInt();
        
        // 3. Process and output
        
        //----CONDITION 0 (ROCK)----
        // && is AND -- || is OR
        if (human_choice == 0 && computer_choice == 1)
        {
            System.out.println("loser !");
        }
        else if (human_choice == 0 
                && computer_choice == 2)
        {
            System.out.println("you've won!");
        }
        else if (human_choice == 0 
                && computer_choice == 0)
        {
            System.out.println("DRAW!");
        }
        
        //-----CONDITION 1 (paper)------
        if (human_choice == 1
                && computer_choice == 2)
        {
            System.out.println("looser !");
        }
        else if (human_choice == 1 
                && computer_choice == 0)
        {
            System.out.println("you've won!");
        }
        else if (human_choice == 1 
                && computer_choice == 1)
        {
            System.out.println("DRAW!");
        }
        
        //-----CONDITION 2 (scissor)------
        if (human_choice == 2
                && computer_choice == 0)
        {
            System.out.println("looser !");
        }
        else if (human_choice == 2 
                && computer_choice == 1)
        {
            System.out.println("you've won!");
        }
        else if (human_choice == 2 
                && computer_choice == 2)
        {
            System.out.println("DRAW!");
        }
    }
    
}
