public class Hello {

    public static void main(String[] args){

        System.out.println("Hello world");
        //byte short int long
        byte bytenumber = Byte.MIN_VALUE;
        short shortnumber = Short.MIN_VALUE;
        int intminnumber = Integer.MIN_VALUE;
        int intmaxnumber = Integer.MAX_VALUE;
        System.out.println("Type number value is"+ bytenumber);
        System.out.println("Type number value is"+ shortnumber);
        System.out.println("Type number value is"+ intminnumber);
        System.out.println("Type number value is "+ intmaxnumber);
        byte aByteValue=60;
        byte anotherByteValue=(byte)(aByteValue/2);
        System.out.println(anotherByteValue);

        int a =128;
        byte b = (byte)a;
        System.out.println(b);

        byte x = 127;
        int y = x;
        System.out.println(y);

    }
}
