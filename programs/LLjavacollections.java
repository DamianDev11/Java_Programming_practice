import java.util.LinkedList;

public class LLjavacollections {

    public static void main(String args[]){
        //create
        LinkedList<Integer> ll=new LinkedList<>();

        //add
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(3);

        //0->1->2
        System.out.println(ll);

        //remove

        ll.removeLast();    
        ll.removeLast();
        System.out.print(ll);

    }
    
}
