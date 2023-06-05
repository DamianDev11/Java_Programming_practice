public class DoubleLL {

    public class Node{
        int data;
        Node  prev;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null; 
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }

    //print
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " <-> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    //remove-last

    public int removeFirst(){
        if(head==null){
            System.out.print("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }

        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);

        dll.print();
        //System.out.println(dll.size);

        //dll.removeFirst();
        //dll.print();
        //System.out.print(dll.size);
        dll.reverse();
        dll.print();
    }
    
}
