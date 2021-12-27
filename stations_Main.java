//Author Nadine Alosert
/* A program that uses
records to give information about
toilets in train stations
 */
import java.util.Scanner;

class stations
{
    public static void main (String[]p)
    {
        ask();
        String ans= "";
        ans=  answer(ans);
        System.exit(0);
    }
    //Greet user and ask them what they'd like to know
    public static void ask ()
    {
        String question;
        question = "Welcome. What station would you like to find about";
        System.out.println(question);
    }
    // Create variable s1 of record type toilets
    public static void trainOne ()
    {
        trainStations s1 = new trainStations();
        s1.stationName = "Stepney Green";
        s1.availableToilets = Boolean.FALSE;
        System.out.println("No toilets available in Stepney Green");

    }
        public static void trainTwo ()
        {
            trainStations s2 = new trainStations();
            s2.stationName = "Kings Cross";
            s2.availableToilets = Boolean.TRUE;
            s2.price = 10;
            System.out.println("There is a toilet at Kings cross costing " + s2.price + "p");

    }
        public static void trainThree ()
        {
            trainStations s3 = new trainStations();
            s3.stationName = "Green Park";
            s3.availableToilets = Boolean.TRUE;
            s3.price = 30;
            System.out.println("There is a toilet at Green Park costing " + s3.price + "p");

        }
        public static void trainFour ()
        {
            trainStations s4 = new trainStations();
            s4.stationName = "Oxford Circus";
            s4.availableToilets = Boolean.FALSE;
            System.out.println("No toilets available in Oxford Circus");

        }

    //Create a series of if statements that calls the methods appropriate based on user's input
        public static String answer(String ans)
        {
            Scanner v = new Scanner(System.in);
            ans = v.nextLine();

            if (ans.equals("Stepney Green")) {
                trainOne();
            } else if (ans.equals("Kings Cross")) {
                trainTwo();
            } else if (ans.equals("Green Park")) {
                trainThree();
            } else if (ans.equals("Oxford Circus")) {
                trainFour();
            } else {
                System.out.print("Please rewrite your station correctly");
            }
            return ans;
        }//END answer
}//END class stations

//create a type called toilets
    class trainStations
    {
    String stationName;
    Boolean availableToilets;
    int price;
        }
