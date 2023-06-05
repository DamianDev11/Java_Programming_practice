public class Nqueens {

    public static void nQueen(char board[] [] ,int row){
//base case
        if(row == board.length){
            printBoard(board);
            return;
        }

        //column loop
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            nQueen(board, row+1);
            board[row][j]='x';
        }
    }

    public static void printBoard(char board[] []){
        System.out.println("---------Chess board----------");   
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    

    public static void main(String args[]){
        int n=2;
        char board [] [] = new char[n] [n];
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                board[i][j]='x';
            }
        }

        nQueen(board,0);
    }
    
}
