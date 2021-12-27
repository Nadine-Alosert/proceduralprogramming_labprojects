/*
Author Nadine Alosert
program that counts how many buses arrive
at a particular bus stop until special
code (0) is reached
 */
import java.util.Scanner;
class busCount{

    public static void main(String[] args)
    {
        //declare variables and initalise them to use as arguments in later methods
        String busNo;
        int timeLate;
        int counter ;
        counter=0;
        timeLate = 0;
        busNo = " ";
        // creat arguments in method
        busNumber(busNo, timeLate,counter);
        System.exit(0);
    }

    public static void busNumber(String busNo, int timeLate,int counter)//arguments/parameters to be changed
    {
        Scanner b = new Scanner(System.in);
        int latest;
        latest = 0;//initlaising to 0 (not late) to compare to so anything more than 0 is later than starting point
        String buslate;
        buslate = " ";

        while (!(busNo.equals("0")))//use while loop to determine when to stop the questions
        {
            counter++;// keep count number of buses pass by
            System.out.println("Which bus passed?");
            busNo = b.next();
            if (busNo.equals("0"))//condition to what to do if 0 is chosen
            {
                System.out.println(counter + " buses passed.The most delayed bus was " + latest + " minutes late on route " + buslate);
            } else
                System.out.println("How many minutes late was it?");
            timeLate = b.nextInt();

            if (latest <= timeLate)// compare time of lateness to previous value(starting from 0) to determine what bus was the latest
            {
                latest = timeLate;
            buslate = busNo;// record which bus was the latest
            }
        }
        System.out.println(counter + " buses passed.The most delayed bus was " + latest + " minutes late on route " + buslate);

    }//busNumber

}//busCount
