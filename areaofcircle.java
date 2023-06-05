import java.util.*;

public class areaofcircle {
    public static void main(String args[]){
        Scanner dam = new Scanner(System.in);
        int r = dam.nextInt();
        Float areaofcircle = 3.14f * r *r;   // 3.14f --> specifies that this is floating value
        System.out.println(areaofcircle);
    }
}
