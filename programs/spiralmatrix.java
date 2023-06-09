public class spiralmatrix {
    public static void printspiral(int matrix[] []){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j] + " ");
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }

    public static int diagonalsum(int matrix[][]){
        int sum=0;
       // for(int i=0;i<matrix.length;i++){
           // for(int j=0;j<matrix[0].length;j++){
         //       if(i==j){
         //           sum+=matrix[i][j];
          //      }
           //     if(i+j==matrix.length-1){
          //          sum+=matrix[i][j];
           //     }
            //} 
        //}
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            } 
        }
        return sum;
    }

    public static boolean staircase_search(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.print("key found at (" + row+"," + col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.print("key not found");
        return false;
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,18}};
         
        //printspiral(matrix);    
        //System.out.print(diagonalsum(matrix));  
        int key=100;
        staircase_search(matrix, key);         
    }
}
