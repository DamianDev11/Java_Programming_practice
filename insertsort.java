import java.util.Arrays;
import java.util.Collections;

public class insertsort {
    public static void insertion_sort(Integer arr[]){
        for (int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev >= 0 && arr[prev]>arr[curr]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void printsort(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        Integer arr[]={5,4,1,3,2};

        
        //insertion_sort(arr);
        //Arrays.sort(arr);
        //printsort(arr);
        //Arrays.sort(arr,0,4);
        Arrays.sort(arr,0,5,Collections.reverseOrder());
        printsort(arr);
    }
}
