public class loop {

    static void loop() {
//        System.out.println("test from loop method");

        //first one is counter loop - for
        //second one is conditional loop-while

//        for (int i = 0; i< 10; i+=1){
//            System.out.println(Math.pow(2,i));
//        }
//        for (int i = 10; i> 0; i-=1){
//            System.out.println("2 ^ "+i+" = " +(int)Math.pow(2,i));
//        }
//        for (char i = 65; i<91; i+=1){
//            System.out.println(i+"  ");
//        }
//
//    }
    }

    static void calculateSalary (String name, double salary, double workinghours){
        System.out.println("Hello"+name);
        System.out.format("you are making %.2f CAD/hour", salary/52/workinghours);
    }

    // recursion

    static int factorial(int number){
//        if( number <=1){
//            return -1;
//        }
//
//        if (number==1){
//            return 1;
//        }
//
//        return number * factorial(number: number-1);
        return (number < 1) ? -1 : (number == 1) ? 1 : number * factorial(  number - 1);
    }

    static long fibonacci(int number){
        if ( number < 1) return -1;
        if ( number == 1) return 0;
        if ( number == 1) return 1;
        return factorial(  number - 2) + factorial(  number - 1);

    }



//    public static void main(String[] args){
//
//    }
}
