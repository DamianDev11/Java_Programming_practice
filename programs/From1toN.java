import java.util.*;

public class From1toN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last value : ");
        int dam = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter <= dam){
            sum = sum+counter;
            
            counter++;
        }
        System.out.println(sum);
    }
}