public class fib {
    public static int Fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        // int fibnm1=Fibonacci(n-1);
        // int fibnm2=Fibonacci(n-2);
        int fibn=Fibonacci(n-1)+Fibonacci(n-2);
        return fibn;
    }

    public static boolean isSorted(int arr[],int i){
        if( i == arr.length-1){
            return true;
        }
        if(arr[i] > arr [i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static int Firstoccur(int arr[],int key,int i){
        if(arr[i]==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return Firstoccur(arr, key, i+1);
    }

    public static int Lastoccurance(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = Lastoccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1 = pow(x, n-1);
        int xn=x*xnm1;
        return xn;
        // return x*pow(x,n-1);
    }


    public static void main(String args[]){
        // int m[]={5,1,2,4,3,2,3,4,5};
        ;
        // System.out.println(Fibonacci(m+1));
        // System.out.println(Fibonacci(m+2));
        // System.out.println(Fibonacci(m+3));
        // System.out.println(Fibonacci(m+3));
        // System.out.println(Fibonacci(m+4));
        // System.out.println(isSorted(m, 0));
        // System.out.print(Firstoccur(m,10,0));
        // System.out.print(Lastoccurance(m,2,0));
        System.out.print(pow(2, 3));
    }
    
}
