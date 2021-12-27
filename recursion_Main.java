
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int a = 0; //current value
        int b = 0;
        int sum = 0;
        int number=0;
        int numberIn = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Please input the expression");
        String input = in.next();
        if (input=="1"||input=="2"||input=="3"||input=="4"||input=="5"||input=="6"||input=="7"||input=="8"||input=="9")
        {
            number = Integer.parseInt(input);
        }
        numberIn = in.nextInt();
        sum =askExpression(input, numberIn);
        System.out.println("The answer is: "+ sum);

        System.exit(0);
    }
    public static int addTogether(int a, int b){
        return (a+b);
    }
    public static int oneExpression( String input,int numberIn ) {

        int answer;
        int num=0;

        if (numberIn >= 0 & numberIn < 10) {
            if (input.equalsIgnoreCase("S") & numberIn == 0) {
                num = num0();
                return num;
            } else if (input.equalsIgnoreCase("S") & numberIn == numberIn) {
                num = numberIn + onExpression("S", numberIn - 1);

            }
        } else if (input.equalsIgnoreCase("A")) {
            num = numA();
            System.out.println(num);
        } else if (input.equalsIgnoreCase("B")) {
            num = numB();
            System.out.println(num);
        } else if (input.equalsIgnoreCase("C")) {
            num = numC();
            System.out.println(num);
        } else if (input.equalsIgnoreCase("D")) {
            num = numD();
            return num;
        } else if (input.equalsIgnoreCase("E")) {
            num = numE();

            return num;
        } else if (input.equalsIgnoreCase("F")) {
            num = numF();
            return num;
        }
        else if(input.equalsIgnoreCase("+"))
        {
          num=addTogether(numberIn,numberIn);
          return num;
        }
        else
        {
            System.out.println("That is not a possible option-please rewrite");
            num =askExpression(input,numberIn);
        }

        return num;
    }
    public static int num0()
    {
        return 0;
    }
    public static int numA()
    {
        int num =10;
        return num;
    }
    public static int numB()
    {
        int num =11;
        return num;
    }
    public static int numC()
    {
        int num =12;
        return num;
    }
    public static int numD()
    {
        int num =13;
        return num;
    }
    public static int numE()
    {
        int num = 14;
        return num;
    }
    public static int numF()
    {
        int num = 15;
        return num;
    }

    public static int sum(char charIn, int numberIn)
    {
        int sum;
        if (numberIn ==0){ //base case
            sum = num0();
            return sum;
        } else
       sum = numberIn + sum('S', numberIn-1);//step case
        return sum;
    }





    {
        // let S==;
        // Sn = 15 - (
        /* S1 = 0+1=1
                        difference: 2   difference from : 14
        S2 =0+1+2=3
                        difference: 3   difference from 15: 12
        S3=0+1+2+3=6
                        difference: 4   difference from 15: 9
        S4 = 0+1+2+3+4=10

        S5 = 0+1+2+3+4+5=15


        Sn = n+ n-1 +n-2..0




         */


    }







}
