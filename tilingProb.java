public class tilingProb {
    public static int tilingPriblem(int n){
        if(n==0 || n==1){
            return 1;
        }

        //work
        //vertical way
        // int fnm1=tilingPriblem(n-1);

        // //horizontal way
        // int fnm2=tilingPriblem(n-2);

        // int totalways=fnm1+fnm2;
        //return totalways;
        return tilingPriblem(n-1) + tilingPriblem(n-2);
    }

    public static void main(String args[]){
        System.out.print(tilingPriblem(4));
    }
    
}
