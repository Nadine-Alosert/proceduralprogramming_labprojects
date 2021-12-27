/*
AUTHOR NADINE ALOSERT
A program that identifies the making
and whether its electric or not
 */
import java.util.Scanner;
class carSale
{
    public static void main(String[] args)
    {
        String carInput;
        carInput ="";
        carInput=ask(carInput);
        System.exit(0);
    }

    public static String ask(String carInput) {
        print("What car do you want to know about?");//ask user for car available in the shop

        car c1 = new car();//create new record type

        c1 = setmake(c1, "Triumph");
        c1 = setCarType(c1, false);

        car c2 = new car();//create new record type

        c2 = setmake(c2, "Focus");
        c2 =setCarType(c2, false);

        car c3 = new car();//create new record type

        c3 = setmake(c3, "MiniE");
        c3 = setCarType(c3, true);

        Scanner c = new Scanner(System.in);
        carInput = c.next();

            //access record via accessor methods using
        if (carInput.equalsIgnoreCase(getmake(c1)))//get value for first car
        {
            print(getmake(c1) + ": " + getCarType(c1)+ " it isn't electric");
        }
        else if (carInput.equalsIgnoreCase(getmake(c2)))//get value for second car
        {
            print(getmake(c2) + ": " + getCarType(c2)+ " it isn't electric");
        }
        else if (carInput.equalsIgnoreCase(getmake(c3)))//get value for third car
        {
            print(getmake(c3) + ": " + getCarType(c3)+ " it is electric");
        }
        else
            print("Please rewrite chosen car name");
        return carInput;
    }

    public static String getmake(car c)//accessor get method
    {
        return c.make;
    }


    public static car setmake(car c, String carName)//accessor set method
    {
        c.make = carName;
        return c;
    }

    public static boolean getCarType(car c)//accessor get method
    {

        return c.electricOrNot;
    }


    public static car setCarType(car c, boolean carType1)//accessor set method
    {
        c.electricOrNot = carType1;
        return c;
    }

    public static String print(String print)//accessor method for print
    {
        System.out.println(print);
        return print;
    }
}
class car//record type car
{
    String make;
    boolean electricOrNot;
}


