import java.util.ArrayList;
import java.util.Collections;

public class Arrlist {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //add elements in array list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(33);
        list.add(121);
        int idx1 = 1,idx2 = 3;
        //list.add(2,122);

        System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        //int element = list.get(3);  get element at index
        //System.out.println(element);

        //remove element
        //list.remove(2);
        //System.out.println(list);

        //insert at index
        //list.set(2,30);
        //System.out.println(list);

        // System.out.println(list.contains(10));
        // System.out.println(list.contains(11));

        // System.out.println(list.size());
        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i) + " ");
        // }
        // System.out.println();

        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     if(max < list.get(i)){
        //         max=list.get(i);
        //     }
        //     //max = Math.max(max,list.get(i));
        // }
        // System.out.println("Max number is :" + max);
    }
    
}
