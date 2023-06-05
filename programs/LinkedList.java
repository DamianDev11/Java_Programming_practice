public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step1 -create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next=head;

        //step3 - head = neewNode
        head = newNode;
    }

    public void addLast(int data){

        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }

    public void print(){
        if(head == null){
            System.out.print("LL is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");

            temp=temp.next;
        }
        System.out.println();
    }

    public void add(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i < idx -1){
            temp=temp.next;
            i++;

        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val=head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev:  i =size - 2
        Node prev = head;
        for(int i =0;i<size - 2;i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrsearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int recursivehelper(Node head,int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = recursivehelper(head.next,key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
        
    }

    public int recursiveSearch(int key){
        return recursivehelper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next =  curr.next;
            curr.next= prev;
            prev = curr;
            curr=next;
        }
        head = prev;
    }

    public void deletenthfromend(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;
            return;
        }

        //sz-n
        int  i=1;
        int itofind = sz-n;
        Node prev = head;
        while(i<itofind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    //slow-fast approach
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;

        }
        return slow; //slow = mid node
    }

    public boolean checkpalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //find mid
        Node midNode=findmid(head);

        //step2-reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right = prev; //right half head
        Node left = head;

        //ste[3 - left half = right half?
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right=right.next;
        }
        return true;

    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next !=null){
            slow =slow. next;
            fast = fast.next.next;
            if(slow == fast){
                return true;//cycle exist
            }
        }
        return false;//cycle doesnt exist
    }

    public static void removecycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle=false;
        while(fast!=null  && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }

        }
        if(cycle==false){
            return;
        }

        //find meeting point
        slow=head;
        Node prev = null;//last node

        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //remove cycle -> last.next=null
        prev.next=null;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp = mergedLL;

        while(head1!= null && head2 != null){
            if(head1.data <= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1=head1.next;
            temp=temp.next;
        }

        while(head2 !=null){
            temp.next = head2;
            head2=head2.next;
            temp=temp.next;
        }

        return mergedLL.next;
    }

    public Node mergesort(Node head){
        if(head == null || head.next==null){
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left and right MS
        Node righthead = mid.next;
        mid.next=null;
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);

        //merge
        return merge(newleft,newright);
    }

    public void zigzag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;


        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr!=null ){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        //zigzag merge
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }


    public static void main(String args[]){
        // LinkedList ll = new LinkedList();
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(3   );
        // ll.print();
        // ll.addLast(1);
        // ll.print();
        // ll.addLast(2);
        // ll.print();
        // ll.add(4,3);
        // ll.print();
        //System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();

        //ll.removeLast();
        //  ll.print();
        //System.out.print(ll.size);

        //System.out.println(ll.itrsearch(3));
        //System.out.print(ll.itrsearch(10));
        // System.out.println(ll.recursiveSearch(3));
        // System.out.println(ll.recursiveSearch(10));
        // ll.reverse();
        // ll.print();
        // ll.deletenthfromend(3);
        // ll.print();

        //System.out.print(ll.checkpalindrome());
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;

        // head= new Node(1);
        // Node temp=new Node(2);
        // head.next=temp;
        // head.next.next=new Node(3);
        // head.next.next.next=temp;
        // //1->2->3->1
        // //1->2->3->2
        // System.out.println(isCycle());
        // removecycle();
        // System.out.print(isCycle());
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        //5->4->3->2->1
        //1->2->3->4->5->6

        // ll.print();
        // ll.head=ll.mergesort(ll.head);
        // ll.print();

        ll.print();ll.zigzag();
        ll.print();
    }
    
}
