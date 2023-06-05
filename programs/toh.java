public class toh {
    public static void TowerofHanoi(int n,char src,char helper,char dest){
        if(n == 1){
            System.out.println("Move disk"+n+"from"+src+" to"+dest);
            return;
        }
        TowerofHanoi(n-1, src, helper, dest);
        System.out.println("Move disk"+n+"from"+src+" to"+dest);
        TowerofHanoi(n-1,helper, dest, src);
    }

    public static void main(String args[]){
        int n=3;
        TowerofHanoi(n, 'A', 'C', 'B');
    }
    
}
