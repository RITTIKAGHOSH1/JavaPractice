package JavaPractice.LinkedList;

public class FunctionCheck {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();


        /*ll.addFirst("3");
        ll.addFirst("2");
        ll.addFirst("3");
        ll.display();*/

        ll.add(1); ll.add(2); ll.add(3); ll.add(4);ll.add(5); ll.add(6);ll.add(7); ll.addFirst(0);
        ll.display();
        ll.removeFirst();  ll.removeFirst();  ll.removeFirst();  ll.removeFirst();  ll.removeFirst();  ll.removeFirst();  ll.removeFirst(); ll.removeFirst(); ll.removeFirst();
        ll.display();

       /* ll.remove();
        ll.display();
        ll.remove(); ll.remove();  ll.remove();  ll.remove();  ll.remove(); ll.remove();
        ll.display();*/
        ll.addFirst(1); ll.add(2); ll.add(3);
        ll.display();
        ll.update(8,0);
        ll.update(2, 1);
        ll.display();

    }

}
