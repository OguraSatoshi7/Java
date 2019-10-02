

public class Variable1002 {
    static int intVal;
    static boolean isSleeping;

    public static void test() {

        boolean isSleeping = true;
        boolean amINotSleeping = !isSleeping;
        System.out.println("is light on" + isSleeping);
        System.out.println("am I sleeping " + amINotSleeping);

        char initial1 = 'S';
        char initial2 = '\u0040';
        System.out.println("initial1 is " + initial1 + "\n");
        System.out.println("initial2 is " + initial2);

        String name = "I love icecream";
        System.out.println(name + "\n");


    }
}
