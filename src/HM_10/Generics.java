package HM_10;
import java.util.ArrayList;
import java.util.Scanner;


public class Generics <T>{
    /*
 1. Create generic class Storage with 2 methods
 2. With in this class, create collection
 3. Create method put which saves object of any type to this collection
 4. Create method get which returns the latest added object from the collection and removes it from there
  */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Storage object = new Storage();
        System.out.println("Please, enter the element");
        object.putElement(scanner.nextLine());
        object.getElement();
    }
}




