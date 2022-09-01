package while_loop;

public class SSquare {
    /*
    print to console a square 10*10 with 'S'
    using loop while
     */

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        while (i < 10) {
            while (j < 10) {
                System.out.print("S  ");
                j++;
            }
            j=0;
            System.out.println();
            i++;
        }
    }
}
