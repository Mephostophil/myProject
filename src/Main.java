public class Main {
    public static void main(String[] args) {
        String phrase = "Hello, guys!";
        printMessage(phrase);

        int numberOne = 5;
        int numberTwo = 4;
        printSum(numberOne, numberTwo);


    }

    public static void printMessage(String phrase) {
        System.out.println(phrase);

    }

    public static void printSum(int a, int b){
        System.out.println("Sum = " + (a + b));
    }
}
