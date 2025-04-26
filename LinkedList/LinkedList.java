package JavaPractice.LinkedList;

public class LinkedList {

    class  Node{
        int data;
        Node next;

        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
        Node(int data){
            this.data=data;
        }
    }

    public Node head;

    //add method (normal next)
    public void add(int data){
        Node node=new Node(data);
        if(head==null){
            //first element
            addFirst(data);
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next; //traverse till the node whose next is null
        }
        temp.next=node;
    }
    public void addFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    public void display(){
        if(head==null){
            System.out.println("Empty List..nothing to display"); return;}
        Node temp=head;
        System.out.print(temp.data + " --> "); //if only 1 element, loop e dhukbei na.
        while(temp.next!=null){
            temp=temp.next;
            System.out.print(temp.data + " --> ");
        }
        System.out.println("END");
    }

    public void remove(){//from end
        if(head==null){
            System.out.println("Empty list, no element present to be deleted..");
            return;
        }
        Node temp=head;
        if(temp.next==null){  //case1: only 1 element present
            removeFirst(); return;
        }
        while(temp.next.next!=null){ //case2: multiple elements, remove from end
            temp=temp.next;
        }
        temp.next=null;
    }
    public void removeFirst(){//remove the node where head is pointing, here 2cases possible.
        if(head==null){
            System.out.println("Empty list..no element to delete");
            return;
        }
        if(head.next==null){
            head=null; //Case1: only 1 element present
            System.out.println("Deleted, now Empty list..");
            return;
       }
        head=head.next; //case2: other nodes also present
    }

    public void update(int position,int data){
        if(head==null){
            System.out.println("Empty list.");
            return;
        }
        Node temp=head;
        for(int i=2 ; i<=position;i++){ //this loop is to traverse and reach the node where u want to update its data
            if(temp.next!=null) {
                temp = temp.next;
            }else{
                System.out.println("invalid position " + position +","+ " no node present..");
                return;
            }
        }
        temp.data=data; //it also checks if i want to undate data in 1st head position=1
    }

}
