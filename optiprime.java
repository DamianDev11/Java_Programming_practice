public class optiprime {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeinran(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)==true){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]){
        primeinran(20);
    }
    
}
