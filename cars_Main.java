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
        String input;
        input="";
	    ask(input);
        System.exit(0);
    }

    public static void ask(String input) {
        print("What car do you want to know about?");
        ;
        car c1 = new car();

        c1 = setmake1(c1, "Triumph");

        car c2 = new car();

        c2 = setmake2(c2, "");

        car c3 = new car();

        c3 = setmake3(c3, "Mini E");

        input = inputCar();

        if (input.equalsIgnoreCase(String.valueOf(c1))) {
            print(getmake(c1) + " is" + getCarType(c1));
        }
        else if (input.equalsIgnoreCase(String.valueOf(c2)))
        {
            print(getmake2(c2) + " is" + getCarType2(c2));
        }
        else if (input.equalsIgnoreCase(String.valueOf(c3)))
        {
            print(getmake3(c3) + " is" + getCarType3(c3));
        }
        else
            print("Please rewrite chosen car name");
    }
    public static String inputCar()
    {
        Scanner c = new Scanner(System.in);
        String carInput;
        carInput = c.next();
        return carInput;
    }
    public static String getmake(car c1)
    {
        return c1.make;
    }

    public static String getmake2(car c2)
    {
        return c2.make;
    }

    public static String getmake3(car c3)
    {
        return c3.make;
    }

    public static car setmake1(car c1, String carName1)
    {
        c1.make = carName1;
        return c1;
    }
    public static car setmake2(car c2, String carName2)
    {
        c2.make = carName2;
        return c2;
    }
    public static car setmake3(car c3, String carName3)
    {
        c3.make = carName3;
        return c3;
    }
    public static boolean getCarType(car c1)
    {
            c1.electricOrNot = false;

        return c1.electricOrNot;
    }

    public static boolean getCarType2(car c2)
    {
        c2.electricOrNot = false;
        return c2.electricOrNot;
    }

    public static boolean getCarType3(car c3)
    {
        c3.electricOrNot = true;
        return c3.electricOrNot;
    }

    public static car setCarType1(car c1, boolean carType1)
    {
        c1.electricOrNot = carType1;
        return c1;
    }
    public static car setCarType2(car c2, boolean carType2)
    {
        c2.electricOrNot = carType2;
        return c2;
    }
    public static car setCarType3(car c3, boolean carType3)
    {
        c3.electricOrNot = carType3;
        return c3;
    }
    public static void print(String print)
    {
        System.out.println(print);
    }
}
class car
{
    String make;
    boolean electricOrNot;
}
