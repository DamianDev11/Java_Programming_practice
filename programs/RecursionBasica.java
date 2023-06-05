public class RecursionBasica {
    public static void PrintDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        PrintDec(n-1);
    }

    public static void PrintInc(int n){
        if(n==1){
            System.out.print(1 + " ") ;
            return;
        }
        PrintInc(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }

    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int Snm1=calcSum(n-1);
        int Sn=n+Snm1;
        return Sn;
    }

    public static void main(String args[]){
        int n=5;
        //PrintDec(n);
        //PrintInc(n);
        // System.out.print(fact(n));
        System.out.print(calcSum(n));

    }
}
