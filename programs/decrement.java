import java.util.*;

public class decrement {
    public static void main(String args[]){
         Scanner dam = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = dam.nextInt();
       // System.out.println("Enter Second number");
        // int b = dam.nextInt();
        if (a%2==0) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd");
        }
    }
    
}
