/*
 * Kieran Bates 
 * January 25, 2020
 * This program makes performs user selected calculations based on the contents of a data file
 */

package datamanagmentprogram;

/**
 *
 * @author kibat6204
 */
import java.io.*;
import java.util.Scanner;
public class DataManagmentProgram {

    /**
     * @param args the command line arguments
     */
    String teamName[] = new String[4];
    String wins[] = new String[4];
    String losses[] = new String[4];
    int winsInteger[] = new int[4];
    int lossesInteger[] = new int[4];
    
    /**
     * Code for calculation option 1
     */
    public void option1()
    {
        int winsTeamOne = winsInteger[0];
        int lossesTeamOne = lossesInteger[0];
        int winsTeamTwo = winsInteger[1];
        int lossesTeamTwo = lossesInteger[1];
        int winsTeamThree = winsInteger[2];
        int lossesTeamThree = lossesInteger[2];
        int winsTeamFour = winsInteger[3];
        int lossesTeamFour = lossesInteger[3];
            
        System.out.println("Team 1: "+(winsTeamOne/(winsTeamOne+lossesTeamOne)*100));
        System.out.println("Team 2: "+(winsTeamTwo/(winsTeamTwo+lossesTeamTwo))*100);
        System.out.println("Team 3: "+(winsTeamThree/(winsTeamThree+lossesTeamThree))*100);
        System.out.println("Team 4: "+(winsTeamFour/(winsTeamFour+lossesTeamFour))*100);
    }
    
    /**
     * Code for calculation option 2
     */
    public void option2()
    {
        int winsTeamOne = winsInteger[0];
        int lossesTeamOne = lossesInteger[0];
        int winsTeamTwo = winsInteger[1];
        int lossesTeamTwo = lossesInteger[1];
        int winsTeamThree = winsInteger[2];
        int lossesTeamThree = lossesInteger[2];
        int winsTeamFour = winsInteger[3];
        int lossesTeamFour = lossesInteger[3];
            
        System.out.println("Team 1: "+(lossesTeamOne/(winsTeamOne+lossesTeamOne)*100));
        System.out.println("Team 2: "+(lossesTeamTwo/(winsTeamTwo+lossesTeamTwo))*100);
        System.out.println("Team 3: "+(lossesTeamThree/(winsTeamThree+lossesTeamThree))*100);
        System.out.println("Team 4: "+(lossesTeamFour/(winsTeamFour+lossesTeamFour))*100);
    }
    public void main(String[] args) {
        
        
        int counter = 0;
        
        try
        {
        FileReader file = new FileReader("scoreInfo");
        BufferedReader buffer = new BufferedReader(file);
        
        for(int i = 0; i<4; i++) //Store contents of file within array
        {
            teamName[counter] = buffer.readLine();
            wins[counter] = buffer.readLine();
            winsInteger[counter] = Integer.parseInt(wins[counter]);
            losses[counter] = buffer.readLine();
            lossesInteger[counter] = Integer.parseInt(losses[counter]);
            counter = counter+1;
        }
        
        counter = 0;
        for(int i = 0; i<4; i++)
        {
            System.out.println(teamName[counter]);
            System.out.println(wins[counter]);
            System.out.println(losses[counter]+ "\n");
            counter = counter+1;
        }
        
        Scanner input = new Scanner(System.in);
        
        boolean repeat = true;
        
        while(repeat == true) //Loop selection program until user chooses to exit
        {
        System.out.println("Would you like to:");
        System.out.println("1...print percent wins for each team");
        System.out.println("2...print percent losses for each team");
        System.out.println("3...exit");
        System.out.print("Type number -->");
        
        int selection = input.nextInt();
        
        if(selection == 1)
        {
            option1();
        }
        if(selection == 2)
        {
            option2();
        }
        if(selection == 3)
        {
            repeat = false;
        }
        }
        
        }
        catch(Exception e)
        {
            System.out.println("Sorry, the data file could not be found.");
        }
    
}
}