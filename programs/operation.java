import java.util.*;

public class operation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Second first number");
        int b = sc.nextInt();
        System.out.println("1:Add 2:Subtract 3:Multiply 4:Divide 5:Remainder");
        int operation = sc.nextInt();
        switch (operation){
            case 1:System.out.println(a+b);
                    break;
            case 2:System.out.println(a-b);
                    break;
            case 3:System.out.println(a*b);
                    break;
            case 4:System.out.println(a/b);
                    break;
            case 5:System.out.println(a%b);
                    break;
            default:System.out.println("Invalid Input");
        }
    }
    
}
