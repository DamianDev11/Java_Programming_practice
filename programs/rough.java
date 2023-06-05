import java.util.*;

public class rough {

    public static boolean search(int matrix[] [] ,int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.print("key found at pos: " + i + ","   +j );
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static int max_value(int matrix[][]){
        int maxval=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] > maxval){
                    maxval=matrix[i][j];
                }
            }
        }
        return maxval;
    }

    public static void main(String args[]){
        int matrix [] [] = new int[3] [3];
        int m=matrix.length,n=matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter value at pos " + i + ","+ j + ":" );
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 5);
        max_value(matrix);
    }
    
    
}
