public class bitmanip {
    public static void oddoreve(int n){
        int bitmask=1;
        if((n & bitmask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("odd number");

        }
    }

    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
    }

    public static int Clearithbit(int n,int i){
        int bitwise=~(1<<i);
        return n & bitwise;
    }

    public static int updateIthbit(int n,int i,int newbit){
        // if(newbit == 0){
        //     return Clearithbit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        n=Clearithbit(n, i);
        int bitmask=newbit<<i;
        return n | bitmask;
    }

    public static int ClearlastIthbit(int n,int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }

    public static int clearbitsinrange(int i,int n,int j){
        int a=(~0<<(j+1));
        int b=(1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean isPowerof2(int n){
        return ((n&(n-1)) == 0);
    }

    public static void main(String args[]){
        // oddoreve(4);
        // oddoreve(3);
        //System.out.print(getIthBit(10,3));
        //System.out.print(setIthBit(10,2));
        //System.out.print(Clearithbit(10, 1));
        //System.out.print(updateIthbit(10,2,1));
        //System.out.print(Clearithbit(10, 2));
        //System.out.print(clearbitsinrange(10, 2, 4));
        System.out.print(isPowerof2(7));
    }
    
}
