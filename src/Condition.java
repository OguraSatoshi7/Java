public class Condition {
    public static void main(String[] args) {
        int age = 250;
        if (age >= 120) {
            System.out.println("Sorry you are dead :(");
        } else if (age >= 18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are NOT adult");
        }

        boolean islightson = false;

        if (islightson == true) {
            System.out.println("Can you turn off the light");
        } else {
            System.out.println("Can you turn off the light");
        }


        // ternary operator
        int studentMark = 70;
        double gpa;
        // Mark >= 80 gpa =4.0 otherwise gpa =3.0
        if (studentMark > 80) {
            gpa = 4.0;
        } else {
            gpa = 3.0;
        }

        gpa = (studentMark > 80) ? 4.0 : 3.0;
        System.out.println(gpa);
        int age1 = 20;
        boolean parentPermission = false;
        if (age1 >= 18 || parentPermission) {
            System.out.println("You are allowed to do staff");
        } else {
            System.out.println("You need to grow up");
        }
        int dayOfWeek = 1;
        switch (dayOfWeek) {
            case 0:
                System.out.println("It's sunday");
                break;
            case 1:
                System.out.println("It's monday");
                break;
        }

    }
}
