import java.util.*;

public class arrayCC {
    public static void main(String args[]){
        int marks[]=new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();


        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("maths : " + marks[2]);

        marks[2] = marks[1] -2;
        System.out.println("maths : " + marks[2]);
        int Percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage : "+ Percentage + "%" );
        System.out.print("Length of array marks : " + marks.length);
    }
    
}
