public class bintoDec {
    public static void binTodec(int bnum){
        int mynum=bnum;
        int pow=0;
        int decNum=0;
        while (bnum>0){
            int lastdigit = bnum%10;
            decNum = decNum + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            bnum=bnum/10;
        }   
        System.out.println("Decimal of " + mynum +" = " +decNum);
    }

    public static void dectobin(int n){
        int mynum=n;
        int pow=0;
        int binnum = 0;
         
        while(n>0){
            int rem = n%2;
            binnum=binnum + (rem * (int)(Math.pow(10,pow)));
            pow++;
            n=n/2;
        }

        System.out.println("Binary form of " + mynum + " = " + binnum);
    }

    public static void main(String args[]){
        binTodec(111); 
        dectobin(7);
    }
    
}
