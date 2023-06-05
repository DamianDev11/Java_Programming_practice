import java.util.*;

public class functions {
    public static int calcsum(int num1, int num2){ // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calcsum(a,b);  // arguments or actual arguments   
        System.out.println("Sum is : " + sum);
    }
}
