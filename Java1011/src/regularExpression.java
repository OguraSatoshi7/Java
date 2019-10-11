public class regularExpression {
    public static void main() {
        String str = "I love. my love but love doesnt love my as I love my love";
        String betterStr = str.replace("doesnt","doesn't");
        System.out.println(betterStr);
        System.out.println(betterStr.replaceAll("'","="));
        System.out.println(betterStr.replaceAll("'","!"));

        // for escape the char we use \\ escape
        System.out.println(betterStr.replaceAll("\\.","!"));

        //for checking the first part of string we are using ^ at the beginning
        System.out.println(betterStr.replaceAll("^I love","I am in love"));

        //for checking the last part of string we are using $ at the end
        System.out.println(betterStr.replaceAll("love$","LOVE"));
        System.out.println("\u001B[31m" + "this is going to be red" + "\u001B[0m");
        red("this is going to be red");
        red(betterStr.toUpperCase());
        red(betterStr.toLowerCase());

        //all the v and t chars which is after o or u will be replaced
        red(betterStr.replaceAll("[ou][vt]", "x"));

        String password = "your email password is iTdCanada2019!";
        //change all the itdc chars to ITDC, check both the upper case and lower case
        System.out.println(password.replaceAll("[i|I][t|T][d|D][c|C]", "ITDC"));

        //replace every char except i t d c with *
        System.out.println(password.replaceAll("[youremailpasswordITDCn2019!]", "*"));
        //easier way to check
        red(password.replaceAll("[^a2 ]", "*"));
        //you can check with range
        red(password.replaceAll("[b-zA-Z0-13-9!]", "*"));
        red(password.replaceAll("(?i)[b-z0-13-9!]", "*"));
        //replace the digits only
        red(password.replaceAll("\\d", "*"));
        //replace not the digits only
        red(password.replaceAll("\\D", "*"));

        //replace if its not a whitespace exclusive punc
        red(password.replaceAll("\\w", "*"));
        //replace if its not a whitespace or punc
        red(password.replaceAll("\\W", "*"));
        //replace whitespaces including punc
        red(password.replaceAll("\\s", "*"));
        //replace if its not a whitespace or punc
        red(password.replaceAll("\\S", "*"));

        String secret = "11aa222bbb333cc44dd";
        //{} will check the char before
        System.out.println(secret.replaceAll("^1{2}a{2}", "x"));
        //+ will check the char before if repeats any time (in this case all a will be)
        System.out.println(secret.replaceAll("^11a+", "x"));

        //* will check if there is 0 or more char after previous
        System.out.println(secret.replaceAll("^11a*", "x"));

        //check if repeated min and max limit
        System.out.println(secret.replaceAll("b{2,5}", "-"));

        String tel = "(604) 704 4234";

        System.out.println(tel.matches("^[0-9]{3}"));
        System.out.println(tel.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[ ]{1}[0-9]{4})"));

        //"I love. my love but love doesnt love my as I love my love";

        System.out.println(betterStr.matches(".*my love*."));

        String ref1 = new String("peter pan");
        String ref2 = new String("peter pan");

        //== operator will check the references are pointing to the same memory address
        //if(ref1 == ref2){

        //.equals() will check the values are same
        if(ref1.equals(ref2)){
            System.out.println("ref1 and ref2 are same");
        } else {
            System.out.println("ref1 and ref2 are not same");
        }

        //select * from table WHERE id = 10;
        StringBuilder query = new StringBuilder("SELECT * FROM");
        query.append(" table");
        query.append(" WHERE");
        query.append(" id =");
        query.append(" 10");

        red(query.toString());

        String name = "Helloworld";
        char[] charArr = name.toCharArray();
        for(char i : charArr){
            System.out.println(i);
        }
        //

        String email = "      aaa@gmail.com      ";
        red(email.trim());
    }

    public static void red(String msg) {
        System.out.println("\u001B[31m" + msg + "\u001B[0m");

    }

}
