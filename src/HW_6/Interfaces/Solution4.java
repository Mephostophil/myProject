package HW_6.Interfaces;

public class Solution4 {
      /*
    Create class Human
    Create interfaces Run, Swim
    Add 1 method to each interface
    Add these interfaces to class Human without method implementation
    Create Human class as abstract
     */

    public abstract class Human implements Run, Swim{

    }

    public interface Run{
        default void deerRun(){
            System.out.println("run like deer!");
        }
    }

    public interface Swim{
        default void crawlSwim(){
            System.out.println("swim, like crawl!");
        }
    }

    public class Man extends Human{

    }

    public void main(String[] args) {
        Man man = new Man();
        man.crawlSwim();
        man.deerRun();
    }
}
