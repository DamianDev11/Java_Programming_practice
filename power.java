public class power {
    public static int optimised(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimised(a, n/2);
        int halfpowersq=halfpower*halfpower;

        //n is odd
        if(n%2!=0){
            halfpowersq = halfpowersq*a;
        }

        return halfpowersq;
    }
    

    public static void main(String args[]){
        System.out.print(optimised(2,11));
    }
}
