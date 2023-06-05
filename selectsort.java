public class selectsort {
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos] > arr[j]){  //if(arr[minpos] > arr[j])  for decreasing order
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        selection_sort(arr);
        printarr(arr);
    }
    
}
