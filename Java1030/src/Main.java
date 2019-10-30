public class Main {
    public static void main(String[] args) {

        System.out.println("welcome");

        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e){
            System.out.println("Error : "+e.getMessage());
        } finally {
            System.out.println("arithmeteic exception done");
            System.out.println("------------");
        }

        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Error : "+e.getMessage());
        } finally {
            System.out.println("NullPointer exception done");
            System.out.println("------------");
        }

        try{
            int [] nums = {1,2,3,4,5};
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error : "+e.getMessage());
        } finally {
            System.out.println("ArrayIndexOutOfBounds exception done");
            System.out.println("------------");
        }

        try{
            double result = divide(5,0);
            System.out.println(result/2);
            System.out.println(result/2);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("exception done");
            System.out.println("------------");
        }

        try {
            String num1 = "10a";
            String num2 = "0";

            System.out.println(divide(Double.parseDouble(num1),Double.parseDouble(num2)));
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException Error "+e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException Error "+e.getMessage());
        } finally{
            System.out.println("custom divide by zero exception done");
            System.out.println("------------");
        }
        System.out.println("B".hashCode());
        System.out.println("thanks");

        String[] array = new String[];



    }

    static double divide(double a, double b){
        if (b==0) throw new ArithmeticException("divide by zero exception detected");
        return a/b;
    }




}
