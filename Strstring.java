import java.util.Scanner;

import java.util.*;

public class Strstring {

    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // char ch[]={'a','b','c','d'};
        // String str = "damian";
        // String str2 = new String();
        // Scanner sc=new Scanner(System.in);
        // String dam = sc.nextLine();
        // System.out.print(dam);

        // String damm = "Damian Prakash Murmu";
        // System.out.println(damm.length());

        String Firstname="Dam";
        String Lastname="ian";
        String fullname = Firstname + Lastname + " : ";
        System.out.println(fullname.charAt(1));
        printletters(fullname);
    }
    
}
