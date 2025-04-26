package JavaPractice.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to go in loop? Enter Y/N ");
        String ans=sc.nextLine();
        if(ans.equalsIgnoreCase("y")) {
            while (true) {

                System.out.println("which method you want to use? \n 1. Add \n 2. Delete \n 3. Display  \n 4. Update \n  type -1 to stop ");
                int no = sc.nextInt();
                sc.nextLine();
                if(no==-1) break;
                switch (no) {
                    case 1:
                        System.out.println("You chose to add node in linkedlist, going into loop..");
                        while (true) {

                            System.out.println("enter \n 1. add at First \n 2. add from end \n 3. Display \n   type 'exit' if you dont want to add any: ");
                            String data = sc.nextLine();
                            if (data.equalsIgnoreCase("exit")) break;

                            try {
                                int d = Integer.parseInt(data);
                                switch (d){
                                    case 1:
                                    {
                                        System.out.println("enter data: ");
                                        int ele=sc.nextInt();
                                        sc.nextLine();
                                        list.addFirst(ele); break;  }
                                    case 2:

                                        System.out.println("enter data: ");
                                        int ele=sc.nextInt();
                                        sc.nextLine();
                                        list.add(ele); break;
                                    case 3:
                                        list.display(); break;
                                }

                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                                System.out.println("Enter either integer options 1/2/3 or type 'exit' to stop ");
                            }
                        }
                        break;
                    case 2:
                       // sc.nextLine();
                        System.out.println("You chose to delete node in linkedlist, going into loop..");
                        while (true) {
                            System.out.println("enter- \n 1. to delete First node\n 2. to delete from end \n 3. Display \n  type 'exit' to stop : ");
                            String input = sc.nextLine();
                            if (input.equalsIgnoreCase("exit")) break;

                            try {
                                int d = Integer.parseInt(input);
                                switch (d) {
                                    case 1:
                                        System.out.println("removing the first node, ");
                                        list.removeFirst();
                                        break;
                                    case 2:
                                        System.out.println("removing 1 node from end ");
                                        list.remove();
                                        break;
                                    case 3:
                                        list.display();
                                }
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                                System.out.println("Enter correct input either 1/2 or type 'exit' to stop ");
                            }
                        }
                        break;

                    case 3:
                        list.display();
                        break;
                    case 4:
                        //sc.nextLine(); // clear buffer at start
                        while (true) {
                            System.out.println("to update-first give position(following 1 based indexing) or type 'exit' to stop ");
                            String input = sc.nextLine();
                            if (input.equalsIgnoreCase("exit")) break;
                            try {
                                int pos = Integer.parseInt(input);
                                System.out.println("now enter the new data for position:" + pos+": ");
                                int data = sc.nextInt();
                                sc.nextLine();
                                list.update(pos, data);
                                list.display();
                            } catch (NumberFormatException e) {
                                System.out.println("to use update, enter in integer, or exit in string format. ");
                            }
                        }
                        break;

                }
            }


        }
    }
}
