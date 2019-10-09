import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

    }

    public static void array(){
        String[] students = new String[6];

        students[0] ="daniel";
        students[1] ="sina";
        students[2] ="hamed";
        students[3] ="satoshi";
        students[4] ="jose";
        students[5] ="mariana";

        System.out.println("students[2] : "+students[2]);

        //integer numbers array
        int[] numbers = {5,17,35,4,2,7,4,2,6,8};
        System.out.println("numbers[5] : "+numbers[5]);

        //double numbers array
        double[] marks = new double[] {95.8, 94.2, 99.6, 100.0, 94.5, 75.3};
        for (int i = 0; i<6; i++){
            System.out.println("marks["+i+"] = " +marks[i]);
        }

        String[] emptyarray = new String[10];
        for (int i = 0; i<10; i++){
            System.out.println("emptyarray["+i+"] = " +emptyarray[i]);
        }

        //sort marks array
        Arrays.sort(marks);
        for (int i = 0; i<6; i++){
            System.out.println("marks["+i+"] = " +marks[i]);
        }

        int indexForMarks = Arrays.binarySearch(marks, 94.5);
        System.out.println("the index of 94.5 is " +indexForMarks);

        for (String student : students){
            System.out.println(student);
        }

        for (int num : numbers){
            System.out.println(num);
        }
    }

    public static void twoDArray(){
        //create 2 dimensional array
        int[][] num = new int[10][10];
        int row = num.length;
        int col = num[0].length;

        for (int i= 0; i<10; i++){
            for(int j = 0; j<10; j++){
                num [i][j] =(j+1)+i*10;
            }
        }

        for (int i= 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(num[i][j]<10){
                    System.out.print(" "+num[i][j]+" ");
                } else {
                    System.out.print(num[i][j]+" ");
                }

            }
            System.out.println(" ");
        }
        System.out.println(" ");

        double[][] twoDarray ={
                {1.0, 2.0, 3.0, 4.0},
                {1.1, 1.2 ,1.3, 1.4},
                {2.1, 2.2, 2.3}
        };
        //System.out.print(twoDarray[2][2]);

        //4, 2, 3
        int[][][]threeDarray = new int [][][]{
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {7,8,9},
                        {10,11,12}
                },
                {
                        {13,14,15},
                        {16,17,18}
                },
                {
                        {19,20,21},
                        {22,23,24}
                }

        };
        for (int i= 0; i<threeDarray.length; i++) {
            for (int j = 0; j < threeDarray[0].length; j++) {
                for (int k = 0; k < threeDarray[0][0].length; k++) {
                    System.out.print(threeDarray[i][j][k]+" ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }

        int[] primeNumbers = new int []{2, 3, 5 ,7, 11, 13, 17, 19, 23};
        int[] reference = primeNumbers;

        System.out.println("reference[2] : "+reference[2]);
        reference[2] = 0;
        System.out.println("reference[2] : "+reference[2]);

        //int[] copy = primeNumbers.clone();
        int[] copy = Arrays.copyOf(primeNumbers, 8);
        System.out.println("copy[2] : "+copy[2]);
        copy[2] = 50;
        System.out.println("primeNumbers[2] : "+primeNumbers[2]);
        printArr(primeNumbers);
        printArr(reference);
        printArr(copy);

        int[] revArr = reverseArr(primeNumbers);
        printArr(revArr);



    }

    public static int[] reverseArr (int[] arr){
        int[] newArr = arr.clone();
        int middle = newArr.length/2;
        int lastIndex = newArr.length-1;
        int temp;

        for(int i = 0; i<middle; i++){
            temp=newArr[i];
            newArr[i]= newArr[lastIndex];
            newArr[lastIndex] = temp;
            lastIndex -=1;
        }
        return newArr;
    }

    private static void printArr(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }

            System.out.println(" ");

    }

}
