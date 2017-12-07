public class ContactNode {
//asdf

    private String name;
    private String number;
    private ContactNode nextNodePtr;

    public ContactNode(String name, String number) {
        this.name = name;
        this.number = number;
        this.nextNodePtr = null;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return number;
    }

    public ContactNode getNext() {
        return nextNodePtr;
    }

    public void printContactNode(){
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + number);
    }

    public void insertAfter(ContactNode previous){


        previous.nextNodePtr = this.nextNodePtr;
        this.nextNodePtr = previous;



    }

}