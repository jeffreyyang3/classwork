import java.util.*;
public class ContactList {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Person 1");
        System.out.println("Enter name:");
        String name1 = scan.nextLine();
        System.out.println("Enter phone number:");
        String number1 = scan.nextLine();
        System.out.println("You entered: " + name1 + ", " + number1);
        System.out.println();


        System.out.println("Person 2");
        System.out.println("Enter name:");
        String name2 = scan.nextLine();
        System.out.println("Enter phone number:");
        String number2 = scan.nextLine();
        System.out.println("You entered: " + name2 + ", " + number2);
        System.out.println();


        System.out.println("Person 3");
        System.out.println("Enter name:");
        String name3 = scan.nextLine();
        System.out.println("Enter phone number:");
        String number3 = scan.nextLine();
        System.out.println("You entered: " + name3 + ", " + number3);
        System.out.println();
        ContactNode one = new ContactNode(name1, number1);
        ContactNode two = new ContactNode(name2, number2);
        ContactNode three = new ContactNode(name3, number3);
        one.insertAfter(two);
        two.insertAfter(three);

        System.out.println("CONTACT LIST");
        //System.out.println("Name: " + test.getName());
        //System.out.println("Phone number: " + test.getPhoneNumber());
        //System.out.println();

        for(ContactNode temp=one;temp!=null;temp=temp.getNext()){
            temp.printContactNode();
            System.out.println("");
        }
//
//
//            System.out.println("Name: " + one.getName());
//            System.out.println("Phone number: " + one.getPhoneNumber());
//            System.out.println();
//        System.out.println("Name: " + two.getName());
//        System.out.println("Phone number: " + two.getPhoneNumber());
//        System.out.println();
//        System.out.println("Name: " + three.getName());
//        System.out.println("Phone number: " + three.getPhoneNumber());
//        System.out.println();


        //System.out.println(one.getNext().getName());



    }
}

