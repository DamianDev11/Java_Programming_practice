public class linearSrch {
    public static int Linear_Search(int number[],int key){
        for (int i=0;i<number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10,14,16};
        int key = 1;

        int index = Linear_Search(number, key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.print("Key is at index :" + index);
        }
    }
    
}
