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
        two.insertAfter(one);
        three.insertAfter(two);
        ContactNode test = one;

        System.out.println("CONTACT LIST");
        System.out.println("Name: " + test.getName());
        System.out.println("Phone number: " + test.getPhoneNumber());
        System.out.println();


        while(test.getNext() != null){
            test = test.getNext();
            System.out.println("Name: " + test.getName());
            System.out.println("Phone number: " + test.getPhoneNumber());
            System.out.println();

        }
        System.out.println(one.getNext().getName());



    }
}

