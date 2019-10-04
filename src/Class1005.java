import java.sql.SQLOutput;
import java.util.Scanner;

public class Class1005 {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        int j = 0;
//        while (j < 10) {
//            System.out.println("this");
//            j += 1;
//        }
//
//        //do while
//        j=0;
//        do {
//            System.out.println("do while loop");
//            j += 1;
//        } while (j < 10);
//        int i=0;
//        while(i<10) {
//            if (i % 2 == 1) {
//                i+=1;
//                continue;
//            }
//            System.out.println("i value "+ i);
//            i+=1;
//        }
        Scanner sn = new Scanner(System.in);
//        System.out.println("hey how old are you?");
//        int age;
//        age= sn.nextInt();
//
//        System.out.println("What is your name?");
//        String name;
//        name = sn.next();
//
//        System.out.println("hi "+ name + " nice to meet you");
//        System.out.println("You are "+ age + " years old");
//        String password;
//        System.out.println("Your password?");
//        password = sn.next();
//        System.out.println("your password is");
//        for (int i = 0; i < password.length(); i+=1){
//            System.out.print("*");
//        }
//        System.out.println("Email?");
//        String email = sn.next();
//        for (int i = email.length()-1; i >= 0 ; i -=1 ){
//            System.out.println(email.charAt(i));
//        }
//        System.out.println("\n\n");

        boolean exit = false;
        do {
            System.out.println("select one");
            System.out.println("1 - Multiples of 3 and 5");
            System.out.println("2 - numbers1To100");
            System.out.println("3 - add 2 input number");
            System.out.println("4 - under construction");
            System.out.println("5 - multiply calculation");
            System.out.println("6 - ");

            int userChoice = sn.nextInt();

            if( userChoice ==1) {
                int n =1;
                int sum=0;
                for(int i=n; i<1000; i++){
                    if(i%3==0 || i%5==0)
                    {sum+=i;}
                }
                System.out.println("sum is "+ sum);
            } else if( userChoice ==2) {
                numbers1To100();
                                         
            } else if( userChoice ==3) {
                int num1, num2;
                System.out.println("number 1 ? : ");
                num1 = sn.nextInt();
                System.out.println("number 2 ? : ");
                num2 = sn.nextInt();
                System.out.println(num1+" + "+ num2+" = "+ add(num1,num2));
            } else if( userChoice ==4) {
                int num1, num2;
                System.out.println("number 1 ? : ");
                num1 = sn.nextInt();
                System.out.println("number 2 ? : ");
                num2 = sn.nextInt();


                System.out.println(num1+" + "+ num2+" = "+ add(num1,num2));
            } else if( userChoice ==5) {
                System.out.println( multiply( 2,5,10));
            }  else if( userChoice ==6) {
                System.out.println("which number");
                int number = sn.nextInt();
                System.out.println(isPrime(number));
            }
            else {
            System.out.println("bye");
            exit=true;
        } }while (!exit);

    }
    public static void numbers1To100() {
        int n = 1;
        int sum = 0;
        for (int i = n; i <= 100; i++) {
                sum += i;
        }
        System.out.println("sum is "+ sum);
    }

    private static int add(int number1, int number2) {
        return number1+number2;
    }
     private static int add(int number1, int number2, int number3) {
         return number1+number2+number3;
     }

     private static int multiply(int ... nums){
        int result = 1;

        for (int i =0; i < nums.length; i++){
            result *= nums[i];
        }

        return result;
     }

     static boolean isPrime (int number){
        boolean flag = false;
        if (number<2) return false;
        if(number==2)return false;
        for(int i =2; i*i<= number; i++)
            if (number % i ==0)
                return false;

            return true;

        }


}