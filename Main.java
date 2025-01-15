package JAVA101;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("muhammed ali",20,100,95,60);
        Fighter f2 = new Fighter("mike tyson",15,90,100,70);
        Match match = new Match(f1,f2,70,120);
        match.run();

    }
}
