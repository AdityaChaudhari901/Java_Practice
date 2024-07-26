
import java.util.Scanner;

public class Loops_ReverseNumber {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            while (n!=0) {
                int Lastdigit = n%10;
                System.out.print( Lastdigit);
                
                n = n/10;
            }
        }
       
    }
}
