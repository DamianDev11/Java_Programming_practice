public class BinaryStrings {
    public static void printBinaryString(int n,int Lastplace,String str){
        if(n==0){
            System.out.print(str);
            return;
        }

        printBinaryString(n-1, 0, str+"0");
        if(Lastplace == 0){
            printBinaryString(n-1, 1, str+"1"); 
        }
    }

    public static void main(String args[]){
        printBinaryString(4 ,0," ");
    }

}