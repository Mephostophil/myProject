package while_loop;

public class MultiplicationTable {
    /*
    Print to console multiplication table 10*10
    using while loop
    numbers are divided with space " "

    Example output:
    1  2  3  4  5  6  7  8  9 10
    2  4  6  8 10 12 14 16 18 20
    3  6  9 12 15 18 21 24 27 30
     */
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (i <= 3) {
            while (j <= 10) {
                System.out.print((j * i) + " ");
                if ((j * i) < 10) System.out.print("  ");
                else System.out.print(" ");
                j++;
            }
            j = 1;
            i++;
            System.out.println();
        }
    }
}
