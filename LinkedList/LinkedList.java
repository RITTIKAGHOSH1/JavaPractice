package JavaPractice.LinkedList;


public class LinkedList {

    class  Node{
        String data;
        Node next;

        Node(String data,Node next){
            this.data=data;
            this.next=next;
        }
        Node(String data){
            this.data=data;
        }
    }

    public Node head;
    //add method (normal next)

    public void add(String data){
        Node node=new Node(data);
        if(head==null){
            //first element
            head=node;
        }
        if(head.next==null) head.next=node; //for 2nd element

    }
    public void addFirst(String data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;

    }
    public void display(){
        if(head==null) return;
        Node temp=head;
        System.out.print(temp.data + " --> "); //if only 1 element, loop e dhukbei na.
        while(temp.next!=null){
            temp=temp.next;
            System.out.print(temp.data + " --> ");
        }

    }

}
