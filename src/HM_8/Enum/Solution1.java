package HM_8.Enum;

import java.util.Scanner;

public class Solution1 {
    /*
    Implement method getLetterPosition
    It should return position of the letter
    Example: A - 1, B - 2
     */
    public static void main(String[] args) {

        while (true) {
            checkingLetter();
        }
    }

    public enum Alphabet {
        A, B, C, D, E,
        F, G, H, I, J,
        K, L, M, N, O,
        P, Q, R, S, T,
        U, V, W, X, Y, Z;


        int getLetterPosition() {

            return this.ordinal();
        }
    }

    public static int checkingLetter() {

        System.out.println("Please, enter the letter:");
        Scanner scanner = new Scanner(System.in);
        String enteredLetter = scanner.nextLine();
        for (Alphabet alphabet : Alphabet.values()) {
            if (enteredLetter.equals(alphabet.toString())) {
                System.out.println(alphabet.getLetterPosition() + 1);

                return (alphabet.getLetterPosition() + 1);
            }
        }
        return 0;
    }
}