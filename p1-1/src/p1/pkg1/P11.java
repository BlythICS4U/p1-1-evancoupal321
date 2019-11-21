/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1.pkg1;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class P11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan  = new Scanner(System.in);
        System.out.println("QUESTION 1");
        int numSet1 = rand.nextInt(6) + 1;
        int numSet2 = rand.nextInt(2);
        int numSet3 = rand.nextInt(52) + 1;
        int numSet4 = rand.nextInt(8);
        int numSet5 = rand.nextInt(10) + 1;
        int numSet6 = rand.nextInt(100) + 1;
        int numSet7 = rand.nextInt(10) - 10;
        int numSet8 = rand.nextInt(101) - 50;
        System.out.println(numSet1);
        System.out.println(numSet2);
        System.out.println(numSet3);
        System.out.println(numSet4);
        System.out.println(numSet5);
        System.out.println(numSet6);
        System.out.println(numSet7);
        System.out.println(numSet8);
        System.out.println();
        System.out.println("QUESTION 2");
        int heads = 0;
        int tails = 0;
        int coinToss, numTosses;
        System.out.println("Enter the number of coin tosses.");
        numTosses = scan.nextInt();
        while (numTosses <= 0)
        {
            System.out.println("This is not a valid number. Try again.");
            numTosses = scan.nextInt();
        }
        for (int i = 0; i < numTosses; i++)
        {
            coinToss = rand.nextInt(2);
            if (coinToss == 0)
            {
                heads++;
            }
            else
            {
                tails++;
            }
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println();
        System.out.println("QUESTION 3");
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;
        int eleven = 0;
        int twelve = 0;
        int dieRoll1 = 0;
        int dieRoll2 = 0;
        int totalRoll = 0;
        int numRolls = 0;
        System.out.println("Enter the number of dice rolls.");
        numRolls = scan.nextInt();
        while (numRolls <= 0)
        {
            System.out.println("This is not a valid number. Try again.");
            numRolls = scan.nextInt();
        }
        for (int i = 0; i < numRolls; i++)
        {
            dieRoll1 = rand.nextInt(6) + 1;
            dieRoll2 = rand.nextInt(6) + 1;
            totalRoll = dieRoll1 + dieRoll2;
            switch (totalRoll)
            {
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
                case 7:
                    seven++;
                    break;
                case 8:
                    eight++;
                    break;
                case 9:
                    nine++;
                    break;
                case 10:
                    ten++;
                    break;
                case 11:
                    eleven++;
                    break;
                case 12:
                    twelve++;
                    break;
                    
            }
        }
        System.out.print("Twos: ");
        for (int i = 0; i < two; i++)
        {
            System.out.print("*");
        }
        System.out.println("(" + two + ")");
        System.out.print("Threes: ");
        for (int i = 0; i < three; i++)
        {
            System.out.print("*");
        }
        System.out.println("(" + three + ")");
        System.out.print("Fours: ");
        for (int i = 0; i < four; i++)
        {
            System.out.print("*");
        }
        System.out.println("(" + four + ")");
        System.out.print("Fives: ");
        for (int i = 0; i < five; i++)
        {
            System.out.print("*");
        }
        System.out.println("(" + five + ")");
        System.out.print("Sixes: ");
        for (int i = 0; i < six; i++)
        {
            System.out.print("*");
        }
        System.out.println("(" + six + ")");
        System.out.print("Sevens: ");
        for (int i = 0; i < seven; i++)
        {
            System.out.print("*");
        }
        System.out.println("(" + seven + ")");
        System.out.print("Eights: ");
        for (int i = 0; i < eight; i++)
        {
            System.out.print("*");
        }
        System.out.println("(" + eight + ")");
        System.out.print("Nines: ");
        for (int i = 0; i < nine; i++)
        {
            System.out.print("*");
        }
        System.out.println("(" + nine + ")");
        System.out.print("Tens: ");
        for (int i = 0; i < ten; i++)
        {
            System.out.print("*");
        }
        System.out.println("(" + ten + ")");
        System.out.print("Elevens: ");
        for (int i = 0; i < eleven; i++)
        {
            System.out.print("*");
        }
        System.out.println("(" + eleven + ")");
                System.out.print("Twelves: ");
        for (int i = 0; i < twelve; i++)
        {
            System.out.print("*");
        }
        System.out.println("(" + twelve + ")");
    }
}
