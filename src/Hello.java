import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {


//        Methods.calculateSalary( name: "Joe doe", salary: 50_000d, workinghours: 37.5d);
//        for (int i = 0; i < 10; i += 1) {
//            System.out.println("factorial" + i + " + " + loop.factorial(i));
//        }
//
//
//        int number = 100;
//        increment(number);
//    }
//
//    static  void increment ( int number) {
//        number +=1;
//
//
//        feeCaluculation(22000, 1);
        Scanner sn = new Scanner(System.in);
        double FEE = 15.00;


        System.out.println("Whta is the length of wall");
        double length = sn.nextDouble();
        System.out.println("Whta is the width of wall");
        double width = sn.nextDouble();

        System.out.println("Your total is "+ length * width*FEE);


    }
        static void feeCaluculation (double fee, int payment) {
            if(payment==1){
                System.out.format("You need to pay %.2f %s every month", fee/12, "CAD");

            }
        }





//        aa
//        Variable1002.test();

//        System.out.println("Hello world");
//        //byte short int long
//        byte bytenumber = Byte.MIN_VALUE;
//        short shortnumber = Short.MIN_VALUE;
//        int intminnumber = Integer.MIN_VALUE;
//        int intmaxnumber = Integer.MAX_VALUE;
//        System.out.println("Type number value is"+ bytenumber);
//        System.out.println("Type number value is"+ shortnumber);
//        System.out.println("Type number value is"+ intminnumber);
//        System.out.println("Type number value is "+ intmaxnumber);
//        byte aByteValue=60;
//        byte anotherByteValue=(byte)(aByteValue/2);
//        System.out.println(anotherByteValue);
//
//        int a =128;
//        byte b = (byte)a;
//        System.out.println(b);
//
//        byte x = 127;
//        int y = x;
//        System.out.println(y);
//
//        long longValue = 9_223_372_036_854_775_807L;
//        System.out.println(longValue);
//
//        double coffeePrice = 2.75d; //d is optional but better to use it
//        float teaPrice = 2.99f; // f is must
//        int coffee = (int)coffeePrice;
//        System.out.println("the int coffee price as :"+ coffee);
//        System.out.println("the rounded tea price as :"+ Math.round(teaPrice));//3
//        System.out.println("the rounded tea price as :"+ Math.floor(teaPrice));//2
//
//        double q = 25d /2;
//        System.out.println("25d/2="+q);
//
//        int test = (int)Math.pow(2,32);
//        System.out.println("2 power of 32 =:"+test);
//
//        double dVal = 0.012;
//        System.out.println(dVal+dVal+dVal);
//
//        BigDecimal bigValue= new BigDecimal(Double.toString(dVal));
//        BigDecimal total = bigValue.add(bigValue).add(bigValue);
//        System.out.println(total);
//        int year = 2019;
//        year +=1;
//        System.out.println(year+1);
//        System.out.println(++year);//pre increment
//        System.out.println(year++);//post increment


//    }



}

