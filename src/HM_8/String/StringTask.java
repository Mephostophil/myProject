package HM_8.String;

public class StringTask {
    public static void main(String[] args) {
        String s = "Hey how are you";

        //print the length of the string
        System.out.println("Length of 's' = " + s.length());
        System.out.println();

        //print the last char of the string (use the previous method to calculate the index - do not use hardcoded indexes)
        System.out.println("The last char of the 's' string is: " + s.toCharArray()[s.length() - 1]);
        System.out.println();

        //print the index of 'a'
        System.out.println("The index of 'a' is: " + s.indexOf('a'));
        System.out.println();

        //substirng the string by the second space " " - result should be "Hey how"
        int secondAppearance = s.indexOf(" ", s.indexOf(" ") + 1);
        System.out.println(s.substring(0, secondAppearance));
        System.out.println();


        //check if the string start with 'h', with 'H', end with '\'
        System.out.println("Does the 's' string start with 'h'?");
        System.out.println(s.startsWith("h"));
        System.out.println("Does the 's' string start with 'H'?");
        System.out.println(s.startsWith("h"));
        System.out.println("Does the 's' string start with '\''?");
        System.out.println(s.startsWith("\'"));
        System.out.println();

        //check if the string contains "are you" contains "are you "
        System.out.println("Does the 's' string contain 'are you'?");
        System.out.println(s.contains("are you"));
        System.out.println();

        //replace "how" to "who"
        System.out.println("'how' is replaces to 'who':");
        System.out.println(s.replace("how", "who"));
        System.out.println();

        //split the string via space " " and print each word from the new line
        String[] stringArray = s.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
        System.out.println();


        //create the method that takes String and char parameters and return the quantity of letters that exist in that string
        System.out.println("The quantity of 'e' letters in string: " + getCharQuantityInTheString(s, 'e'));
        System.out.println();
        //create the greeting method that takes name and age and print the string - "Hey, my name is Andrii, and I'm 41 years old"
        // (Use String.format function)
        greeting("Viktor", 29);


    }
    public static int getCharQuantityInTheString(String s, char c) {
        char[] charArray = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                counter++;
            }
        }
        return counter;
    }

    public static void greeting(String name, int age) {
        System.out.println(String.format("Hey, my name is %s and I'm %d years old", name, age));
    }
}
