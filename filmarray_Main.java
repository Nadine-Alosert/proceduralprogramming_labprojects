//AUTHOR NADINE ALOSERT
/* program that uses the user's
input and uses it to give info about
the film and how much in pounds it has mad
 */

import java.util.Scanner;
class FilmStatus
{
    public static void main(String[] args)
    {
        int i = 0;
        int[]profit=new int [6];
        film(profit,i);
        System.exit(0);
    }//END MAIN

    //Declare and initialise two different arrays
    // ask for user input on film name and profit made
    public static int [] film(int[] profit, int i)
    {
        Scanner f = new Scanner(System.in);
        String[]film = new String[6];
        int total;
        total = 0;//final variable

        for (i=0;i<=4;i++)// fill in all arrays first
        {
            System.out.println("What film?");
            film[i] = f.next();

            System.out.println("and how much did " + film[i] + " make in millions?");
            profit[i] = f.nextInt();
        }
        System.out.println("The films and the amount they made are");

        for (i=0;i<=4;i++)// fill in all arrays first
        {
            total += profit[i];
            System.out.println(film[i]+ " , " +profit[i]+ "Million pounds");// printed all together
        }

        System.out.println("Together these 5 films took " + total + " million pounds at the box office");

        return profit;
    }//end film

}//END class Filmstatus

