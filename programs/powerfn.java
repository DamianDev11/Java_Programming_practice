public class powerfn {

    public static int power3(int a,int n){
        if(n==0){
            return 1;
        }

        int halfpower = power3(a,n/2);
        int halfpowersq = halfpower * halfpower;

        if(n%2!=0){
            return a * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String args[]){
        int a=2,n=3;
        System.out.print(power3(a,n));
    }
    
}
