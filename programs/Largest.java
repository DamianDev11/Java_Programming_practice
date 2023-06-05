public class Largest {
    public static int LargestValue(int number[]){
        int Large = Integer.MIN_VALUE;  // - infinity(lowest possible value)
        int Small = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(Large < number[i]){
                Large = number[i];
            }
            if(Small>number[i]){
                Small=number[i];
            }
            
        }
        System.out.println("Smallest value is :" + Small);

        return Large;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,5,3};

        System.out.println("Largest value is :" + LargestValue(numbers));

    }
    
}
