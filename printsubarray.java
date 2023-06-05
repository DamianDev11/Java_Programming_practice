public class printsubarray {
    public static void printsubarr(int num[]){
        int tp=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total dsum of arrays :" + tp);
    }
    //Dry run and calculate the sum of subarrays
    //identify min and max array

    public static void main(String args[]){
        int num[] = {2,3,4,5,6,7};

        printsubarr(num);
    }
    
}
